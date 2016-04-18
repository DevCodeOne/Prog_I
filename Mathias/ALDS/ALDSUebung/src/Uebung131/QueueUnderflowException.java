package Uebung131;

@SuppressWarnings("serial")
public class QueueUnderflowException extends Exception {

	public QueueUnderflowException() {
		super("Queue underflow");
	}

}
