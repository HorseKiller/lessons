package parallel.b_sinchronized.c_class;

import parallel.b_sinchronized.a_methods.ExampleThread;
import parallel.b_sinchronized.b_object.d_example.DecrementThread;

public class Example {
    public static void main(String[] args) {
        final SCounter counter = new SCounter();
        final SCounter counter2 = new SCounter();

        final Thread increment = new Thread(new ExampleThread(counter));
        final Thread decrenent = new Thread(new DecrementThread(counter2));

        try {
            increment.start();
            decrenent.start();
            increment.join();
            decrenent.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println("Занчение - " + counter.value());
    }
}
