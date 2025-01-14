import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.util.Duration;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.geometry.Pos;

public class CountDown extends Application{
	protected TextField countdown = new TextField();
	protected Media media = new Media("https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3");
	protected MediaPlayer mp = new MediaPlayer(media);
	protected Timeline Animation;
	
@Override
	public void start(Stage PrimaryStage) {
	StackPane pane = new StackPane();
	countdown.setFont(Font.font(60));
	pane.getChildren().add(countdown);
	pane.setAlignment(Pos.CENTER);
	mp.setCycleCount(MediaPlayer.INDEFINITE);
	
	
	Timeline Animation = new Timeline(new KeyFrame(Duration.millis(1000), e -> timer()));
	Animation.setCycleCount(Timeline.INDEFINITE);
	
	countdown.setOnKeyPressed(e ->{
		if(e.getCode() == KeyCode.ENTER) {
			Animation.play();
		}
	});

	Scene scene = new Scene(pane,250,200);
	PrimaryStage.setTitle("Exercise16_21");
	PrimaryStage.setScene(scene);
	PrimaryStage.show();
}
public void timer() {
	if(Integer.parseInt(countdown.getText()) > 0) {
		mp.pause();
		mp.seek(Duration.ZERO);
		countdown.setText(String.valueOf(Integer.parseInt(countdown.getText()) - 1));
	}
	if(countdown.getText().equals("0")) {
		//Animation.pause();
		mp.play();
	}
}
}


	

