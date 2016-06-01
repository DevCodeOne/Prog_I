package mypack.list;

public class LinkedList {
	private ListNodeSL anchor;

	public LinkedList() {
		anchor = null;
	}

	public ListNodeSL getFirst() throws ListEmptyException {
		if (isEmpty())
			throw new ListEmptyException("List is Empty");
		return anchor;
	}

	public ListNodeSL getLast() {
		ListNodeSL current = anchor;
		if (anchor == null)
			return anchor;
		else {
			while (current.getNext() != null)
				current = current.getNext();
			return current;
		}
			
	}

	public ListNodeSL getNext(ListNodeSL position) {
		if (position.getNext() != null)
			return this.getNext(position);
		return position;
	}

	public ListNodeSL getPrevious(ListNodeSL position) {
		int pos = position.getKey();
		ListNodeSL prev;
		try {
			prev = getFirst();
			if ( prev.getKey()==pos) return position;
			while (prev.getNext().getKey()!=pos) {
				prev = prev.getNext();
			}
			return prev;
		} catch (ListEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return position;
	}

	public void insertFirst(int key) {
		anchor = new ListNodeSL(key, anchor);
	}

	public void insertLast(int key) {
		ListNodeSL current = anchor;
		if (anchor == null)
			anchor = new ListNodeSL(key, anchor);
		else {
			while (current.getNext() != null)
				current = current.getNext();
			current.setNext(new ListNodeSL(key, null));
		}
	}

	public void insert(int key) {
		ListNodeSL current = anchor;
		if ((anchor == null) || (key < anchor.getKey()))
			anchor = new ListNodeSL(key, anchor);
		else {
			while ((current.getNext() != null) && (key >= current.getNext().getKey()))
				current = current.getNext();
			current.setNext(new ListNodeSL(key, current.getNext()));
		}
	}

	public void delete4(int key) {// K48
		ListNodeSL previous, current = anchor;
		if (current == null)
			return;

		if (current.getKey() == key) {
			anchor = anchor.getNext();
			return;
		}

		do {
			previous = current;
			current = current.getNext();
		} while ((current != null) && (current.getKey() != key));

		if (current != null)
			previous.setNext(current.getNext());
	}

	public void delete5(int key) {// k49
		if (anchor == null)
			return;
		if (anchor.getKey() == key) {
			anchor = anchor.getNext();
			return;
		}
		delete5_rec(anchor, key);
	}

	private void delete5_rec(ListNodeSL previous, int key) {
		ListNodeSL current = previous.getNext();
		if ((current != null) && (current.getKey() != key))
			delete5_rec(current, key);
		else if (current != null)
			previous.setNext(current.getNext());
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public void show1() {
		ListNodeSL current = anchor;
		while (current != null) {
			System.out.println(current.getKey() + " ");
			current = current.getNext();
		}
	}

	public void show2() {
		show2_rec(anchor);
	}

	private void show2_rec(ListNodeSL current) {
		if (current != null) {
			System.out.println(current.getKey() + " ");
			show2_rec(current.getNext());
		}
	}

	public void dispose1() {
		anchor = null;
	}

	public void dispose2() {
		ListNodeSL next = anchor;
		while (next != null) {
			next = next.getNext();
			anchor.setNext(null);
			anchor = next;
		}
	}

}
