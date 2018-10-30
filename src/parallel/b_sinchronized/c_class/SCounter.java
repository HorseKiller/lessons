package parallel.b_sinchronized.c_class;

import parallel.b_sinchronized.a_methods.a_example.Counter;

final class SCounter extends Counter {
    private Integer c = 0;

    @Override
    public void increment(final Integer threadHash) {
        synchronized (SCounter.class) {
            System.out.println(String.format("%s | Текущее значение: %s", threadHash, c));
            c++;
            System.out.println(String.format("%s | Сейчас значение: %s", threadHash, c));
        }
    }

    @Override
    public void decrement(final Integer threadHash) {
        synchronized (SCounter.class) {
            System.out.println(String.format("%s | Текущее значение: %s", threadHash, c));
            c--;
            System.out.println(String.format("%s | Сейчас значение: %s", threadHash, c));
        }
    }
}
