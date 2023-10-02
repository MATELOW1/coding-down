import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;


public class TrafficController {

	@FXML
    private Circle carRed1,carRed2, carRed3, carRed4 ;
	
	@FXML
    private Circle carGreen1, carGreen2 ,carGreen3,carGreen4 ;

	@FXML
    private Rectangle pedRed1, pedRed2, pedRed3, pedRed4 ;
	
	@FXML
    private Rectangle pedGreen1 , pedGreen2, pedGreen3, pedGreen4;
	

	
	public void initialize() {
		
		TrafficLight traffLightUp = new TrafficLight(this.carRed1, this.carGreen1, this.pedRed1, this.pedGreen1);
		TrafficLight traffLightRight = new TrafficLight(this.carRed2, this.carGreen2, this.pedRed2, this.pedGreen2);
		TrafficLight traffLightDown = new TrafficLight(this.carRed3, this.carGreen3, this.pedRed3, this.pedGreen3);
		TrafficLight traffLightLeft = new TrafficLight(this.carRed4, this.carGreen4, this.pedRed4, this.pedGreen4);
		
		Junction junction = new Junction (traffLightUp, traffLightRight, traffLightDown, traffLightLeft);
		junction.start();
		
		
	}


}
