package parallel.a_threads.b_join;

/**
 * Этот поток будет ожидать выполнение другого потока
 */
public class MasterThread implements Runnable {
    private final Thread slave;

    MasterThread(final Thread slave) {
        this.slave = slave;
    }

    @Override
    public void run() {
        try {
            System.out.println("Поток Master ожидает завершения Slave потока");
            slave.join();
            System.out.println("Поток Master дождался завершения Slave, и тоже завершился");
        } catch (InterruptedException ie) {
            System.out.println("Поток Master завершен с ошибкой");
            ie.printStackTrace();
        }
    }
}
