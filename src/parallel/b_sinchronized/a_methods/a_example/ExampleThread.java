package parallel.b_sinchronized.a_methods.a_example;

public class ExampleThread implements Runnable {
    private final Counter counter;

    public ExampleThread(final Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i = 0; i < 3; i++) {
            counter.increment(this.hashCode());
            try {
                Thread.sleep(10);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}
