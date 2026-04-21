package edu.kis.vh.nursery;

/**
 * Dziala na zasadzie stosu, przechowuje liczby calkowite.
 */
public class DefaultCountingOutRhymer {
    public static final int CAPACITY = 12;

    public static final int EMPTY_RHYMER_INDICATOR = -1;

    public static final int DEFAULT_VALUE = -1;

    private final int[] numbers = new int[CAPACITY];

    private int total = EMPTY_RHYMER_INDICATOR;

    /**
     * Dodaja nowa wartosc do tablicy, jezeli nie jest pelna
     * @param in
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza czy tablica jest pusta
     * @return
     */
    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    /**
     * Sprawdza czy wliczanka jest pelna
     * @return
     */
    public boolean isFull() {
        return total == CAPACITY - 1;
    }

    /**
     * Wyswitla ostatni dodany element
     * @return
     */
    protected int peekaboo() { // TODO: Zmienienie nazwy funkcji w bardziej odpowiadajaca dzialaniu
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    /**
     * Wyswietla ostatni oddany elelment i usuwa go
     * @return
     */
    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total--];
    }

    /**
     * Zwraca liczbe elementow
     * @return
     */
    public int getTotal() {
        return total;
    }
}
