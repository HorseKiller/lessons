package parallel.a_threads.b_join;

public class ThreadJoin {
    public static void main(String[] args) {
        Thread slave = new Thread(new SlaveThread());
        Thread master = new Thread(new MasterThread(slave));

        slave.start();
        master.start();
    }
}
