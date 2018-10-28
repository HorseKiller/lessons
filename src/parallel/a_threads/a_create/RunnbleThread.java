package parallel.a_threads.a_create;

/***
 * @author dakon
 */
public final class RunnbleThread implements Runnable {
    private final String name;

    public RunnbleThread(final String threadName) {
        this.name = threadName;
    }

    @Override
    public void run() {
        System.out.println(String.format("Это поток с названием: %s", this.name));
    }
}