package JavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class knapp extends Application implements EventHandler<ActionEvent> {
	

	Button button;
	public void start(Stage primarystage) throws Exception{
		Group root = new Group();
		Scene scene = new Scene(root,500,500,Color.DARKGREY);
		primarystage.setScene(scene);
		primarystage.show();
		button = new Button("Hello");
		button.setTranslateX(235);
		button.setTranslateY(235);
		button.setMinHeight(30);
		button.setMinWidth(30);
		button.setOnAction(this);
		root.getChildren().add(button);
		
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();

	}


	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		if (event.getSource() == button)
		{
			System.out.println("hi");
		}
	}

}
