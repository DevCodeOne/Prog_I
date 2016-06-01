package mypack;

import java.util.Scanner;

import mypack.stack.Stack;

public class TestStack {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack a = new Stack();
		a.push("1");
		a.push("2");
		a.push("3");
		a.push("4");
		a.push("5");
		a.push("6");
		a.push("7");
		a.push("8");
		a.push("9");
		a.push("10");
		for (int i = 0; i < 10; i++) {
			third(a);
		}
		a.test();
		// System.out.println("Ende first");
		// second(a);
		// System.out.println("Ende Second");
		// third(a);
		// System.out.println("Ende Third");

	}

	public static void first(Stack s) throws Exception {

		s.push(read());
		write(s.top());
		s.pop();
		s.push(read());

	}

	public static void second(Stack s) throws Exception {
		write(s.top());
		s.pop();
		write(s.top());
		s.pop();
		s.push(read());
	}

	public static void third(Stack s) throws Exception {
		s.pop();
		s.push(s.top());
		write(s.top());
		s.pop();
		s.push(read());
	}

	public static void write(Object o) {
		System.out.print(o);
	}

	public static Object read() {
		System.out.println("Eingabe: ");
		return sc.next();
	}
}
