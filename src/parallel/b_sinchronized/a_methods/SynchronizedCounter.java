package parallel.b_sinchronized.a_methods;

public class SynchronizedCounter extends Counter{

    @Override
    public synchronized void increment(final Integer threadHash) {
        System.out.println(String.format("%s | Текущее значение: %s", threadHash, c));
        c++;
        System.out.println(String.format("%s | Сейчас значение: %s", threadHash, c));
    }
}
