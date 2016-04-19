package Uebung131;

public interface Queue {

	// Hinzufügen eines neuen Elements am Ende der Queue;
	// wenn kein Speicherplatz mehr vorhanden ist,
	// wird eine QueueOverflowException generiert
	public Queue enqueue(Object x) throws QueueOverflowException;

	// Entfernen des vordersten Elements; falls die Queue leer
	// ist, wird eine QueueUnderflowException generiert
	public Queue dequeue() throws QueueUnderflowException;

	// Liefert das vorderste Element; falls die Queue leer ist,
	// wird eine QueueUnderflowException generiert
	public Object front() throws QueueUnderflowException;

	// Abfragen, ob die Queue leer ist
	public boolean empty();

}
