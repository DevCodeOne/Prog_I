package Uebung130;

import java.util.Scanner;

public class Stack{
	Object[] s;
	int index = -1;
	public Stack(){
		s = new Object[20];
	}
	
	public Stack push(Object o) throws StackOverflow{
		if (index>=20) {
			throw new StackOverflow();
		} else {
			s[index] = o;
			index++;
			return this;
		}
	}
	
	public Stack pop() throws StackUnderflow {
		if (index<0) {
			throw new StackUnderflow();
		} else {
			index--;
			return this;
		}		
	}
	
	public Object top() throws StackUnderflow{
		if (index<0) {
			throw new StackUnderflow();
		} else {
			return s[index];
		}
	}
	
	public boolean empty(){		
		return index<0;
	}
	
}