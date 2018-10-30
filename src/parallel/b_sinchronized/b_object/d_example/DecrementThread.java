package parallel.b_sinchronized.b_object.d_example;

import parallel.b_sinchronized.a_methods.Counter;

public final class DecrementThread implements Runnable {
    private final Counter counter;

    public DecrementThread(final Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i = 0; i < 3; i++) {
            counter.decrement(this.hashCode());
            try {
                Thread.sleep(10);
            }catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}
