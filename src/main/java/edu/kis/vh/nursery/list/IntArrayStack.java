package edu.kis.vh.nursery.list;

public class IntArrayStack implements IntStack {
    private static final int INITIAL = -1;
    private static final int LENGTH = 12;
    private static final int RETURN = -1;

    private final int[] numbers = new int[LENGTH];

    public int total = INITIAL;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == INITIAL;
    }

    @Override
    public boolean isFull() {
        return total == LENGTH-1;
    }

    public int peekaboo() {
        if (callCheck())
            return RETURN;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return RETURN;
        return numbers[total--];
    }

}