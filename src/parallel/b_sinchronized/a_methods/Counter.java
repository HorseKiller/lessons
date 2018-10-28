package parallel.b_sinchronized.a_methods;

public class Counter {
    protected int c = 0;

    public void increment(final Integer threadHash) {
        System.out.println(String.format("%s | Текущее значение: %s", threadHash, c));
        c++;
        System.out.println(String.format("%s | Сейчас значение: %s", threadHash, c));
    }

    public void decrement(final Integer threadHash) {
        System.out.println(String.format("%s | Текущее значение: %s", threadHash, c));
        c--;
        System.out.println(String.format("%s | Сейчас значение: %s", threadHash, c));
    }

    public int value() {
        return c;
    }
}
