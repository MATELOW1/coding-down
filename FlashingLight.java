import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class FlashingLight extends Thread {
	
	private TrafficLight _traff1;
	private TrafficLight _traff2;
	private long _numOfFlash;
	
	
	public FlashingLight(TrafficLight traff1, TrafficLight traff2, long numOfFlash) {
		
		this._traff1 = traff1;
		this._traff2 = traff2;
		this._numOfFlash = numOfFlash;
		//System.out.println(numOfFlash);
	}

	@Override
	public void run() {
		super.run();
		
		for (long i=0; i< this._numOfFlash; i++) {
			
			this._traff1.getPedGreen().setFill(Color.GREEN);
			this._traff2.getPedGreen().setFill(Color.GREEN);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {  e.printStackTrace(); }
			
			this._traff1.getPedGreen().setFill(Color.WHITE);
			this._traff2.getPedGreen().setFill(Color.WHITE);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {  e.printStackTrace(); }
			
		}
	}

}
