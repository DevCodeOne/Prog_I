package mypack.stack;

public class Stack {
	Object[] s;
	int index = 0;

	public Stack() {
		s = new Object[20];
	}

	public Stack push(Object o) throws StackOverflow {
		if (index >= 20) {
			throw new StackOverflow();
		} else {
			s[index] = o;
			index++;
			return this;
		}
	}

	public Stack pop() throws StackUnderflow {
		if (index <= 0) {
			throw new StackUnderflow();
		} else {
			index--;
			return this;
		}
	}

	public Object top() throws StackUnderflow {
		if (index < 0) {
			throw new StackUnderflow();
		} else {
			return s[index - 1];
		}
	}

	public boolean empty() {
		return index <= 0;
	}

	public void test() {
		for (int i = 0; i < s.length; i++) {
			System.out.print("" + s[i] + " ");
		}
	}
}
