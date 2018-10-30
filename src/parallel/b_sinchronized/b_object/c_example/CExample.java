package parallel.b_sinchronized.b_object.c_example;

import java.util.ArrayList;
import java.util.List;

public class CExample {
    public static void main(String[] args) throws InterruptedException {
        Thread blokedThread = new Thread(new BlockedThread(new ArrayList<Integer>()));
        Thread blokingThread = new Thread(new BlockedThread(new ArrayList<Integer>()));

        blokedThread.start();
        Thread.sleep(1000);
        blokingThread.start();
    }
}
