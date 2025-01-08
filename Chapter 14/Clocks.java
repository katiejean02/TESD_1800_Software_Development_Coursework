import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class Clocks extends Application {
	@Override
	public void start(Stage primaryStage){
		ClockPane clock = new ClockPane((int)(Math.random() * 12),((int)(Math.random() * 2) == 1 ? 30 : 0), 0);
		String timeString = clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond();
		clock.setSecondHand(false);
		Label lblCurrentTime = new Label(timeString);
		
		BorderPane pane = new BorderPane();
		pane.setCenter(clock);
		pane.setBottom(lblCurrentTime);
		BorderPane.setAlignment(lblCurrentTime,Pos.TOP_CENTER);
		Scene scene = new Scene(pane,250,250);
		primaryStage.setTitle("Excercise_14_28");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
}