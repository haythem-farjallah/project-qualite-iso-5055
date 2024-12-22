package haythem.realibilty.cwe362;

public class MultiThreadedExampleCV {
    public static void main(String[] args) throws InterruptedException {
        CounterCV counter = new CounterCV();

        Runnable task = () -> {
            for(int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("Valeur finale : " + counter.getCount());
    }
}