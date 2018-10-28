package parallel.b_sinchronized.a_methods;

public class Synchronized {
    public static void main(String[] args) {
        final SynchronizedCounter counter = new SynchronizedCounter();
        final Thread thread1 = new Thread(new ExampleThread(counter));
        final Thread thread2 = new Thread(new ExampleThread(counter));

        try {
            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println("Занчение - " + counter.value());
    }
}
