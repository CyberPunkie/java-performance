package BiasedLocking;

public class NewOneThreadCounterTest {

    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(4500);

        SynchronizeCounter counter = new SynchronizeCounter();
        long time = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            counter.increment();
        }
        time = System.currentTimeMillis() - time;
        System.out.printf("Counter: %d - Elapsed time: %d ms\n", counter.getCount(), time);
    }
}