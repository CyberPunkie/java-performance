package Numa;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class SerializeTest {

	private long endtime;

	public void run() {
		long duration = Integer.parseInt(System.getProperty("durationInSecs", "30"));
		endtime = now() + duration * 1000;

		int threads = Integer.parseInt(System.getProperty("threads", "10").trim());

		System.out.println(String.format(
				"Running serialization test. Threads: %d, Time: %d sec", threads,
				duration));
		ExecutorService executors = Executors.newFixedThreadPool(threads);
		List<Future<Stats>> list = new ArrayList<Future<Stats>>();

		for (int i = 0; i < threads; i++) {
			list.add(executors.submit(new WorkerThreads()));
		}

		Stats total = new Stats();

		for (Future<Stats> task : list){
			try {
				total.add(task.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		System.out.println(total);
		executors.shutdown();
	}

	private long now(){
		return System.currentTimeMillis();
	}

	private boolean isRunning(){
		return now() < endtime;
	}

	private class WorkerThreads implements Callable<Stats> {

		private long now() {
			return System.currentTimeMillis();
		}

		private byte[] getBytes(Object obj) throws IOException {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream o = new ObjectOutputStream(bos);
			o.writeObject(obj);
			o.close();
			bos.close();
			return bos.toByteArray();
		}

		public Stats call() throws Exception {
			Stats local = new Stats();
			while (isRunning()) {
				ObjectGenerator obj = new ObjectGenerator(400);
				try {
					long start = now();
					getBytes(obj);
					long end = now();
					local.add(end - start);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return local;
		}
	}

	public static void main(String[] args) {
		new SerializeTest().run();
	}

}

