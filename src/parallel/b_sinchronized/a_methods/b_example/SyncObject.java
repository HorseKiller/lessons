package parallel.b_sinchronized.a_methods.b_example;

final class SyncObject {
    private static Integer counter = 0;

    static synchronized void increment() {
        System.out.println("=======\nУвеличиваю: " + counter);
        counter++;
        System.out.println("Увеличено: " + counter + "\n=======");
    }

    static synchronized void decrement() {
        System.out.println("=======\nУменьшаю: " + counter);
        counter--;
        System.out.println("Уменьшено: " + counter + "\n=======");
    }
}
