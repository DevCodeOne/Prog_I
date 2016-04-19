package Uebung131;

import java.util.Scanner;

public class QueueTest {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception{
		QueueAsArray a = new QueueAsArray();
		a.enqueue("1");
		a.enqueue("2");
		a.enqueue("3");
		a.enqueue("4");
		a.enqueue("5");
		write(a.front());
		write(a.front());
		a.dequeue();
		a.dequeue();
		write(a.front());
		a.dequeue();
		a.dequeue();
		write(a.front());
		a.dequeue();
		
		QueueAsTwoStacks b = new QueueAsTwoStacks();
		a.enqueue("1");
		a.enqueue("2");
		a.enqueue("3");
		a.enqueue("4");
		a.enqueue("5");
		write(a.front());
		write(a.front());
		a.dequeue();
		a.dequeue();
		write(a.front());
		a.dequeue();
		a.dequeue();
		write(a.front());
		a.dequeue();
		
	}
	
	public static void write(Object o) {
		System.out.print(o);
	}

	public static Object read() {
		Object o = new Object();
		System.out.println("Eingabe: ");
		o = sc.next();
		sc.close();
		return o;
	}

}
