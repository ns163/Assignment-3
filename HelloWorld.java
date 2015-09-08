import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.control.*;

public class HelloWorld extends Application 
{
	@Override
	public void start(Stage primaryStage)
	{
		Button btn = new Button();
		btn.setText("Say 'Hello World'");
		
		btn.setOnAction(new EventHandler<ActionEvent>() 

		{

		@Override
		public void handle(ActionEvent event) 
		{
			System.out.println("Hello World!");
		}});

			StackPane root = new StackPane();
			root.getChildren().add(btn);
			Scene scene = new Scene(root, 300, 250);
			primaryStage.setTitle("Hello !");
			primaryStage.setScene(scene);
			primaryStage.show();
	}

	public static void main(String[] args) 
	{
		launch(args);
	}
}