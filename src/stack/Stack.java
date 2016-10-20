package stack;

import java.util.ArrayList;
import java.util.Arrays;

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
		stack[getSize()] = i;
		size++;
	}

	public Integer pop() {
		size--;
		return stack[getSize()];
		

	}

	@Override
	public String toString() {

		return Arrays.toString(stack);
	}

}