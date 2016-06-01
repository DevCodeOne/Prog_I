package mypack.dlist;

public class DLinkedList {

	private ListNodeDL anchor;

	public DLinkedList() {
		anchor = new ListNodeDL();
		anchor.setPrev(anchor);
		anchor.setNext(anchor);
	}

	public void show() {
		ListNodeDL current = anchor.getNext();
		while (current != anchor) {
			System.out.print(current.getKey() + " ");
			current = current.getNext();
		}
	}

	public void dispose() {
		ListNodeDL current = anchor.getNext();

		while (current != anchor) {
			current.setPrev(null);
			current = current.getNext();
		}
		anchor.setPrev(anchor);
		anchor.setNext(anchor);
	}

	public void insertFirst(int key) {
		ListNodeDL newNode = new ListNodeDL(key, anchor, anchor.getNext());
		anchor.getNext().setPrev(newNode);
		anchor.setNext(newNode);
	}

	public void insertLast(int key) {
		ListNodeDL newNode = new ListNodeDL(key, anchor.getPrev(), anchor);
		anchor.getPrev().setNext(newNode);
		anchor.setPrev(newNode);
	}

	public void insert(int key) {
		ListNodeDL current = anchor.getNext();
		while ((current != anchor) && (key >= current.getKey()))
			current = current.getNext();

		ListNodeDL newNode = new ListNodeDL(key, current.getPrev(), current);
		current.getPrev().setNext(newNode);
		current.setPrev(newNode);
	}

	public void delete(int key) {
		ListNodeDL current = anchor.getNext();

		while ((current != anchor) && (current.getKey() != key))
			current = current.getNext();

		if (current != anchor) {
			current.getPrev().setNext(current.getNext());
			current.getNext().setPrev(current.getPrev());
		}
	}

	public void reverse() {
		ListNodeDL current = anchor;
		ListNodeDL tmpNode = new ListNodeDL(-1, current.getPrev(), current.getNext());
		do {
			current.setPrev(tmpNode.getNext());
			current.setNext(tmpNode.getPrev());
			current = tmpNode.getPrev();
			tmpNode.setNext(current.getNext());
			tmpNode.setPrev(current.getPrev());
		} while (current != anchor);
	}

	public void swap(ListNodeDL x, ListNodeDL y) {
		ListNodeDL nextX, prevX, nextY, prevY;
		x = searchSwap(x.getKey());
		y = searchSwap(y.getKey());
		if (x.getNext() == y) {
			nachbar(x, y);
			return;
		}
		if (x.getPrev() == y) {
			nachbar(y, x);
			return;
		}
		nextX = x.getNext();
		prevX = x.getPrev();
		nextY = y.getNext();
		prevY = y.getPrev();
		x.getPrev().setNext(y);
		x.getNext().setPrev(y);
		y.getPrev().setNext(x);
		y.getNext().setPrev(x);
		y.setNext(nextX);
		y.setPrev(prevX);
		x.setNext(nextY);
		x.setPrev(prevY);
	}

	public void nachbar(ListNodeDL x, ListNodeDL y) {
		ListNodeDL tmp;
		x.getPrev().setNext(y);
		y.getNext().setPrev(x);
		tmp = x.getPrev();
		x.setPrev(x.getNext());
		x.setNext(y.getNext());
		y.setNext(y.getPrev());
		y.setPrev(tmp);
		
	}

	public ListNodeDL searchSwap(int key) {
		ListNodeDL current = anchor.getNext();
		while (current.getKey() != key) {
			current = current.getNext();
			if (current == anchor)
				return null;
		}
		return current;
	}

	public ListNodeDL show_middle() {
		ListNodeDL next = anchor.getNext();
		ListNodeDL prev = anchor.getPrev();
		while (next != prev) {
			next = next.getNext();
			prev = prev.getPrev();
		}
		return next;
	}

}
