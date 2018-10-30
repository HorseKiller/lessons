package parallel.b_sinchronized.a_methods.b_example;

public class BExample_static {
    String sdf = "sdfsdfsdf";
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    SyncObject.increment();
                    sleep();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    SyncObject.decrement();
                    sleep();
                }
            }
        });

        thread1.start();
        thread2.start();
    }

    private static void sleep() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
