package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {
	private IntLinkedList oldList;
	private static final int INITIAL = -1;
	private static final int LENGTH = 12;
	private static final int RETURN = -1;

	private final int[] numbers = new int[LENGTH];

	public int total = INITIAL;

	public DefaultCountingOutRhymer() {
		oldList = new IntLinkedList();
	}

	public void push(int i) {
		oldList.push(i);
	}

	public boolean isEmpty() {
		return oldList.isEmpty();
	}

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
		
	public boolean isFull() {
		return total == LENGTH-1;
	}

	public int top() {
		return oldList.top();
	}

	public int pop() {
		return oldList.pop();
	}

	protected int peekaboo() {
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