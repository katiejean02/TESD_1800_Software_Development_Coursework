/*
Katie Prohaska
01/10/2025
 */
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.util.Duration;
import javafx.scene.paint.Color;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.collections.ObservableList;
import javafx.scene.input.MouseButton;
import javafx.animation.FadeTransition;

public class MovingRectangle extends Application{
@Override
	public void start(Stage primaryStage) {
	Pane pane = new Pane();
	Rectangle rectangle = new Rectangle(0,0,25,50);
	rectangle.setFill(Color.RED);
	rectangle.xProperty().bind(pane.widthProperty().divide(2));
	rectangle.yProperty().bind(pane.heightProperty().divide(2));
	Polygon polygon = new Polygon();
	ObservableList<Double> list = polygon.getPoints();
	double centerX = 400/2;
	double centerY = 400/2;
	double radius = Math.min(400,  400) * 0.4;
	int s = 5;
	for(int i =0; i < s; i++) {
		list.add(centerX + radius * Math.cos(2 * i * Math.PI / s));
		list.add(centerY - radius * Math.sin(2 * i * Math.PI /s));
	}
	polygon.setFill(Color.WHITE);
	polygon.setStroke(Color.BLACK);
	polygon.setRotate(54.0);
	pane.getChildren().add(polygon);
	pane.getChildren().add(rectangle);
	
	
	FadeTransition ft = new FadeTransition(Duration.millis(3000), rectangle);
	ft.setFromValue(1.0);
	ft.setToValue(0.1);
	ft.setCycleCount(Timeline.INDEFINITE);
	ft.setAutoReverse(true);
	ft.play();
	
	PathTransition pt = new PathTransition();
	pt.setDuration(Duration.millis(4000));
	pt.setPath(polygon);
	pt.setNode(rectangle);
	pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
	pt.setCycleCount(Timeline.INDEFINITE);
	pt.play();
	
	pane.setOnMousePressed(e -> {
		if(e.getButton() == MouseButton.PRIMARY) {
			pt.play();
		}
		else if(e.getButton() == MouseButton.SECONDARY) {
			pt.pause();
		}
	});

	Scene scene = new Scene(pane, 400, 400);
	primaryStage.setTitle("Exercise_15");
	primaryStage.setScene(scene);
	primaryStage.show();
	}

}
