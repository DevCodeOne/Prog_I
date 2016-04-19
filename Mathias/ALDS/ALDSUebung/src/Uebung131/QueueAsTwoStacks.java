package Uebung131;

import Uebung130.Stack;
import Uebung130.StackOverflow;

public class QueueAsTwoStacks implements Queue {
	Stack a;
	Stack b;

	public QueueAsTwoStacks() {
		a = new Stack();
		b = new Stack();
	}

	@Override
	public Queue enqueue(Object x) throws QueueOverflowException {
		try {
			a.push(x);
		} catch (StackOverflow e) {
			e.printStackTrace();
			throw new QueueOverflowException();
		}
		return null;
	}

	@Override
	public Queue dequeue() throws QueueUnderflowException {
		try {
			while (!a.empty()) {

				b.push(a.top());
				a.pop();
			}
			b.pop();
			while (!b.empty()) {
				a.push(b.top());
				b.pop();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new QueueUnderflowException();
		}
		return this;
	}

	@Override
	public Object front() throws QueueUnderflowException {
		Object o = null;
		try {
			while (!a.empty()) {

				b.push(a.top());
				a.pop();
			}
			o = b.top();
			while (!b.empty()) {
				a.push(b.top());
				b.pop();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new QueueUnderflowException();
		}
		return o;
	}

	@Override
	public boolean empty() {
		
		return a.empty();
	}

}
