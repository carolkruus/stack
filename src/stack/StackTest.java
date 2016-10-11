package stack;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {
	// – loo pinu ja kontrolli, et selles on 0 elementi.

	@Test
	public void emptyStackHasZeroElements() {
		Stack stack = new Stack();
		assertThat(stack.getSize(), is(0));
	}

	// – loo pinu, lisa (push) kaks elementi ja kontrolli, et selles on 2
	// elementi (size == 2).

	@Test
	public void pushIncreaseSize() {
		Stack stack = new Stack();
		stack.push(3);
		stack.push(5);
		assertThat(stack.getSize(), is(2));
	}

	// – loo pinu, lisa (push) kaks elementi, võta (pop) kaks elementi ja
	// kontrolli, et pinus on 0 elementi.

	@Test
	public void popDecreaseSize() {
		Stack stack = new Stack();
		stack.push(3);
		stack.push(5);
		stack.pop();
		stack.pop(); // ctrl + alt + nool alla tuubeldab

		assertThat(stack.getSize(), is(0));
	}

	// – loo pinu, lisa (push) kaks elementi, võta (pop) kaks elementi ja
	// kontrolli, et need on needsamad lisatud elemendid.
	
//	@Test
//	public void () {
//		Stack stack = new Stack();
//		stack.push(3);
//		stack.push(5);
//		stack.pop();
//		stack.pop(); // ctrl + alt + nool alla tuubeldab
//
//		assertThat(stack.getSize(), is(0));
//}
}
