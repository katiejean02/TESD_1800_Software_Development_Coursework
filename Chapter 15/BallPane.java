/*
 Katie Prohaska
 Date: 01/09/2025
 */
import javafx.animation.KeyFrame;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.event.ActionEvent;
import javafx.application.Application;


public class BallPane extends Application{
	public final double radius = 20;
	private double x = radius, y = radius;
	private double dx = 1, dy = 1;
	private Circle circle = new Circle(x,y,radius);
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		Button btUP = new Button("Up");
		Button btDn = new Button("Down");
		Button btLt =  new Button("Left ");
		Button btRt =  new Button("Right");
		HBox hbox = new HBox(btUP,btDn,btLt,btRt);
		hbox.setSpacing(10);
		hbox.setAlignment(Pos.BOTTOM_CENTER);
		BorderPane bp = new BorderPane(pane);
		circle.setFill(Color.RED);
		pane.getChildren().add(circle);
		pane.getChildren().add(hbox);
		bp.setBottom(hbox);
	
		primaryStage.setTitle("Exercise 15");
		primaryStage.setScene(new Scene(bp, 300, 250));
        primaryStage.show();
		
		btUP.setOnAction( e -> {
			circle.setCenterY(circle.getCenterY() - 5);
		});
		btDn.setOnAction(e ->{
			circle.setCenterY(circle.getCenterY() + 5);
		});
		btLt.setOnAction(e ->{
			circle.setCenterX(circle.getCenterX() - 5);
		});
		btRt.setOnAction(e ->{
			circle.setCenterX(circle.getCenterX() + 5);
		});
		
		
	}
}
