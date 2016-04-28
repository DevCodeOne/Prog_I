import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
	
	public static final int ITERATIONEN = 10;
	
	public static void main(String [] args) throws Exception {
		Timer timer = new Timer(); 
		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				System.out.println("Hallo Welt ich bin der TimerTask");
			}
			
		};
		
		timer.scheduleAtFixedRate(task, 0, 1000);
		// wenn dus beenden willst timer.cancel
		
		Thread.sleep(1000 * ITERATIONEN);
		
		timer.cancel();
		
	}
}
