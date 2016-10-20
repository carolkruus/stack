package stack;

import java.util.Arrays;

public class StackApp {

	public static void main(String[] args) {
		Stack tryStack = new Stack();
		tryStack.push(5);
		tryStack.push(8);
		System.out.println(tryStack.pop());
		
		
		Integer[] array = new Integer[10];
		array[0] = 55555;
		array[1] = 7;
		
		
		int arraySize = 2;
		array[arraySize] = 5;
//		System.out.println(Arrays.toString(array));

	}

}
