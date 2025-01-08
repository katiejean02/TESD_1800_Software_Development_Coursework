import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.layout.StackPane;
public class StopSign extends Application{

@Override
public void start(Stage primaryStage) {
	StackPane pane = new StackPane();
	Scene scene = new Scene(pane, 400,400);
	pane.setPadding(new Insets(5,5,5,5));
	Text text1 = new Text(20,20,"STOP");
	text1.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.ITALIC,30));
	text1.setFill(Color.WHITE);
	Polygon stopsign = new Polygon();
	stopsign.setFill(Color.RED);
	stopsign.setStroke(Color.BLACK);
	ObservableList<Double> list = stopsign.getPoints();
	double centerX = 400/2;
	double centerY = 400/2;
	double radius = Math.min(400, 400) * 0.4;
	
	int s = 8;
	for(int i = 0; i < s; i++) {
		list.add(centerX + radius * Math.cos(2 * i * Math.PI / s));
		list.add(centerY - radius * Math.sin(2 * i * Math.PI / s));
	}
	stopsign.setRotate(22.5);
	pane.getChildren().clear();
	pane.getChildren().add(stopsign);
	pane.getChildren().add(text1);
	primaryStage.setTitle("Exercise14_15");
	primaryStage.setScene(scene);
	primaryStage.show();
}

}