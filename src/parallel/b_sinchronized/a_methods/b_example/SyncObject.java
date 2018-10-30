package parallel.b_sinchronized.a_methods.b_example;

final class SyncObject {
    private static Integer counter = 0;
    private Integer objCounter = 0;

    static synchronized void increment() {
        System.out.println("=======\nУвеличиваю: " + counter);
        counter++;
        System.out.println("Увеличено: " + counter);
    }

    static synchronized void decrement() {
        System.out.println("=======\nУменьшаю: " + counter);
        counter--;
        System.out.println("Уменьшено: " + counter);
    }

     synchronized void objIncrement() {
        System.out.println("=======\nУвеличиваю: " + counter);
        objCounter++;
        System.out.println("Увеличено: " + counter);
    }

    synchronized void objDecrement() {
        System.out.println("=======\nУменьшаю: " + counter);
        objCounter--;
        System.out.println("Уменьшено: " + counter);
    }
}
