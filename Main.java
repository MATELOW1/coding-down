import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{ 

	
	public void start(Stage stage) throws Exception{ 
		Parent root = (Parent) FXMLLoader.load(getClass().getResource("Traffic.fxml")); 
		Scene scene = new Scene(root); 
		stage.setTitle("Traffic"); 
		stage.setScene(scene); 
		stage.show(); 
	} 
	public static long redTime;
	public static long greenTime;
	
	public static void main(String[] args) { 
		redTime = Long.parseLong(args[0]);
		greenTime = Long.parseLong(args[1]);
		launch(args);
		
		
		
		
	} 
}
