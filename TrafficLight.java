import javafx.application.Platform;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class TrafficLight {
	
	private Circle _carRed;
	private Circle _carGreen;
	private Rectangle _pedRed;
	private Rectangle _pedGreen;
	
	
	
	
	public TrafficLight(Circle carRed, Circle carGreen, Rectangle pedRed, Rectangle pedGreen) {
		this._carRed = carRed;
		this._carGreen = carGreen;
		this._pedRed = pedRed;
		this._pedGreen =pedGreen;
	}


	public void setTrafficLight(Color color) { //sets car traffic light to 'color' and the rest accordingly
		
		if(color.equals(Color.RED)) {
			
			this._carRed.setFill(color);
			this._carGreen.setFill(Color.WHITE);
			this._pedRed.setFill(Color.WHITE);
			this._pedGreen.setFill(Color.GREEN);
			
//			Platform.runLater(() -> {
//                this._pedGreen.setFill(Color.GREEN);
//                try {
//					Thread.sleep(200);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//                this._pedGreen.setFill(Color.WHITE);
//                   
//			
//		});
		}
		
		else { // set car traffic light to green and the rest accordingly
			
			this._carRed.setFill(Color.WHITE);
			this._carGreen.setFill(color);
			this._pedRed.setFill(Color.RED);
			this._pedGreen.setFill(Color.WHITE);
			
		}
		
		
		
	}


	public Rectangle getPedGreen() {
		return _pedGreen;
	}


	

	 
	
	

}
