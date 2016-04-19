package Uebung131;

public class QueueAsArray implements Queue{
	Object[] q = new Object[100];
	int index = 99;
	int load = 0;
	int last = 0;

	private int nxtindex() {
		if (index >= 99) {
			index -= 99;
		} else {
			index++;
		}
		load++;
		return index;
	}

	private int deqindex() {
		if (last >= 99) {
			last -= 99;
		} else {
			last++;
		}
		load--;
		return last;
	}

	// Hinzufügen eines neuen Elements am Ende der Queue;
	// wenn kein Speicherplatz mehr vorhanden ist,
	// wird eine QueueOverflowException generiert
	public QueueAsArray enqueue(Object x) throws QueueOverflowException {
		if (load >= 100) {
			throw new QueueOverflowException();

		}
		q[nxtindex()] = x;
		return this;
	}

	// Entfernen des vordersten Elements; falls die Queue leer
	// ist, wird eine QueueUnderflowException generiert
	public QueueAsArray dequeue() throws QueueUnderflowException {
		if (load <= 0) {
			throw new QueueUnderflowException();
		}
		deqindex();
		return this;
	}

	// Liefert das vorderste Element; falls die Queue leer ist,
	// wird eine QueueUnderflowException generiert
	public Object front() throws QueueUnderflowException {
		if (load <= 0) {
			throw new QueueUnderflowException();
		}
		return q[last];
	}

	// Abfragen, ob die Queue leer ist
	public boolean empty() {
		return (load<=0);
	}

}
