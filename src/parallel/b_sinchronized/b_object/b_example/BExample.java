package parallel.b_sinchronized.b_object.b_example;

import java.util.ArrayList;
import java.util.List;

public class BExample {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();

        Thread blokedThread = new Thread(new BlockedThread(list));
        Thread blokingThread = new Thread(new BlockedThread(list));

        blokedThread.start();
        Thread.sleep(1000);
        blokingThread.start();

        blokedThread.join();
        blokingThread.join();

        System.out.println(list.toString());
    }
}
