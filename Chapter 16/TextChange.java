import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
public class TextChange extends Application{
@Override
	public void start(Stage primaryStage) {
	BorderPane pane = new BorderPane();
	Text text1 = new Text(60,60,"Programming is fun");
	text1.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR,20));
	
	HBox paneforRadio = new HBox(20);
	HBox paneforButton = new HBox(20);
	paneforRadio.setPadding(new Insets(5,5,5,5));
	paneforRadio.setStyle("-fx-border-width: 2px; -fx-border-color: blue");
	
	RadioButton rbRed = new RadioButton("Red");
	RadioButton rbGreen = new RadioButton("Green");
	RadioButton rbYellow = new RadioButton("Yellow");
	RadioButton rbBlack = new RadioButton("Black");
	RadioButton rbBlue = new RadioButton("Blue");
	Button leftbt = new Button("<<");
	Button rightbt = new Button(">>");
	paneforButton.getChildren().addAll(leftbt, rightbt);
	paneforRadio.getChildren().addAll(rbRed,rbGreen,rbYellow,rbBlack,rbBlue);
	pane.setTop(paneforRadio);
	pane.setBottom(paneforButton);
	paneforButton.setAlignment(Pos.CENTER);
	Pane TextPane = new Pane();
	TextPane.getChildren().add(text1);
	pane.setCenter(TextPane);
	
	ToggleGroup group = new ToggleGroup();
	rbRed.setToggleGroup(group);
	rbGreen.setToggleGroup(group);
	rbYellow.setToggleGroup(group);
	rbBlack.setToggleGroup(group);
	rbBlue.setToggleGroup(group);
	
	rbRed.setOnAction(e ->{
		if(rbRed.isSelected()) {
			text1.setFill(Color.RED);
		}
	});
	rbGreen.setOnAction(e ->{
		if(rbGreen.isSelected()) {
			text1.setFill(Color.GREEN);
		}
	});
	rbYellow.setOnAction(e ->{
		if(rbYellow.isSelected()) {
			text1.setFill(Color.YELLOW);
		}
	});
	rbBlack.setOnAction(e ->{
		if(rbBlack.isSelected()) {
			text1.setFill(Color.BLACK);
		}
	});
	rbBlue.setOnAction(e ->{
		if(rbBlue.isSelected()) {
			text1.setFill(Color.BLUE);
		}
	});
	leftbt.setOnAction(e_-> text1.setX(text1.getX() - 10));
	rightbt.setOnAction(e -> text1.setX(text1.getX() + 10));
	
	Scene scene = new Scene(pane,400,400);
	primaryStage.setTitle("Exercise_16_1");
	primaryStage.setScene(scene);
	primaryStage.show();
}
}