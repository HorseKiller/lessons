package parallel.a_threads.a_create;

public class ThreadCreate {
    /**
     * Запуск примера
     * @param args
     */
    public static void main(String[] args) {
        Thread thread = new Thread(
                new RunnableThread("Thread1")
        );
        thread.start();
    }
}
