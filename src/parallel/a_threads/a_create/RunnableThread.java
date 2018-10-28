package parallel.a_threads.a_create;

/***
 * @author dakon
 */
public final class RunnableThread implements Runnable {
    private final String name;

    RunnableThread(final String threadName) {
        this.name = threadName;
    }

    @Override
    public void run() {
        System.out.println(String.format("Это поток с названием: %s", this.name));
    }
}