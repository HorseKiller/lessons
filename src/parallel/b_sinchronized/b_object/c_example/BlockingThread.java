package parallel.b_sinchronized.b_object.c_example;

import java.util.List;

public class BlockingThread implements Runnable {
    final List<Integer> list;

    BlockingThread(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        System.out.println("BlockingThread: Я изменяю list");
        list.add(2);
        System.out.println("BlockedThread: Я изменил list");
    }
}
