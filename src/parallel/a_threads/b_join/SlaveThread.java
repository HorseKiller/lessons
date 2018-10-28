package parallel.a_threads.b_join;

public class SlaveThread implements Runnable {
    @Override
    public void run() {
        try {
            long ms = 10000;
            System.out.println(String.format("--Slave поток спит %sms", ms));
            Thread.sleep(ms);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
            System.out.println("Процесс завершился с ошибкой");
        }
    }
}
