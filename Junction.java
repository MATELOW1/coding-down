import javafx.application.Platform;
import javafx.scene.paint.Color;

public class Junction extends Thread{

	private TrafficLight _traffLightUp, _traffLightRight, _traffLightDown, _traffLightLeft;
	final long FLASH = 200;  // Milliseconds for each flash
	
	
	public Junction (TrafficLight traffLightUp,TrafficLight traffLightRight, TrafficLight traffLightDown, TrafficLight traffLightLeft ) {
		this._traffLightUp = traffLightUp;
		this._traffLightRight = traffLightRight;
		this._traffLightDown = traffLightDown;
		this._traffLightLeft = traffLightLeft;
	}
	
	@Override
	public void run() {
		super.run();
		while(true) {
			
			setJunction (Color.RED); 
			
			FlashingLight flash1 = new FlashingLight(this._traffLightUp, this._traffLightDown, Main.redTime / (FLASH*2));
			flash1.start();
		
		try {
			Thread.sleep(Main.redTime);
		} catch (InterruptedException e) { e.printStackTrace();}
		
		
			setJunction (Color.GREEN);
			
			FlashingLight flash2 = new FlashingLight(this._traffLightRight, this._traffLightLeft, Main.greenTime / (FLASH*2));
			flash2.start();
			
			
			try {
				Thread.sleep(Main.greenTime);
			} catch (InterruptedException e) { e.printStackTrace();}

		
		
	}
		
		
}
		
	// method will set top car traffic light to 'color' and the rest accordingly
	private void setJunction(Color color) { 
		
		Color oppositeColor;
		
		if(color.equals(Color.RED))
		{
			oppositeColor = Color.GREEN;
		}
		else
		{
			oppositeColor = Color.RED;
					
		}
		
		this._traffLightUp.setTrafficLight(color);
		this._traffLightDown.setTrafficLight(color);
		this._traffLightRight.setTrafficLight(oppositeColor);
		this._traffLightLeft.setTrafficLight(oppositeColor);
		
		
	}
	
}
