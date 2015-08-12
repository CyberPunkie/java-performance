package BiasedLocking;

public class SynchronizeCounter {

    private static long count = 0l;

    public synchronized void increment() {
        count = count + 1;
    }

    public long getCount() {
        return count;
    }
}
