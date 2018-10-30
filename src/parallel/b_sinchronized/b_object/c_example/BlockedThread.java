package parallel.b_sinchronized.b_object.c_example;

import java.util.List;

final class BlockedThread implements Runnable {
    final List<Integer> list;

    BlockedThread(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            System.out.println("BlockedThread: Я заблокировал list");
            list.add(1);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.println("BlockedThread: Я разблокировал list");
        }
    }
}
