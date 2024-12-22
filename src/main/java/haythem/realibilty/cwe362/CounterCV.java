package haythem.realibilty.cwe362;

public class CounterCV {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}
