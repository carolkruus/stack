package stack;

import java.util.ArrayList;

public class Stack {

	private Integer[] stack;
	private int size;

	public Stack() {
		stack = new Integer[100];
		size = 0;
	}

	public int getSize() {
		return size;
	}

	public void push(Integer i) {
		size++;
	}

	public Integer pop() {
		size--;
		return null;

	}
	
	
}