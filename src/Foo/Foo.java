package Foo;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;
public class Foo extends Thread {
    private static final AtomicBoolean proceed = new AtomicBoolean(false);
    private static final int iters = 10000000;
    private static volatile long startTime = 0L;
    private static final long bootTime = System.nanoTime();
    private static final long[] start = new long[iters];
    private static final long[] delta = new long[iters];

    public void run() {
        for (int j=0; j<2; j++) {
            int limit = (j==0)?(iters/10):iters;
            for (int i=0; i<limit; i++) {
                while (!proceed.compareAndSet(false, true));
                LockSupport.park();
                long endTime = System.nanoTime();
                start[i] = startTime-bootTime;
                delta[i] = endTime-startTime;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Foo foo = new Foo();
        foo.start();
        for (int j=0; j<2; j++) {
            if (j==0) {
                System.out.println("WARMUP");
            } else {
                System.out.println("RUNNING TEST");
            }
            int limit = (j==0)?(iters/10):iters;
            for (int i=0; i<limit; i++) {
                while(!proceed.compareAndSet(true, false));
                startTime = System.nanoTime();
                LockSupport.unpark(foo);
            }
        }

        int longest = 0;
        long total = 0L;
        for (int i=0; i<iters; i++) {
            total += delta[i];
            if (delta[i] > delta[longest])
                longest = i;
            if (delta[i] > 100000L)
                System.out.println(delta[i] + " starting at " + start[i]);
        }
        System.out.println("Longest = " + delta[longest] + " starting at " + start[longest]);
        System.out.println("Average = " + total/iters);
    }
}