//Nikhil Sethi
//1213414
//Assignment three
//Reference: http://docs.oracle.com/javase/8/javafx/get-started-tutorial/form.htm

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

/**
 *
 * @author nikhilsethi
 */
public class task3 extends Application {
    
   @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Welcome to JAVAFX App");
        
        primaryStage.show();
                
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 600, 575);
        primaryStage.setScene(scene);

//Adding the labels and textfield in the scene 
//There is a certain position for each label and textbox
        Text scenetitle = new Text("Please enter the your information");
        scenetitle.setFont(Font.font("Arial", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label name = new Label("First Name:");
        grid.add(name, 0, 1);

        Label lname = new Label("Last Name:");
        grid.add(lname, 2, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        TextField lnameF = new TextField();
        grid.add(lnameF, 3, 1);

//-----------------------------------------------------------------------
        Label address = new Label("Address:");
        grid.add(address, 0, 2);

        Label city = new Label("City:");
        grid.add(city, 2, 2);

        Label pC = new Label("Post Code:");
        grid.add(pC,0,3);

        TextField addf = new TextField();
        grid.add(addf, 1, 2);

        TextField cityF = new TextField();
        grid.add(cityF, 3, 2);

        TextField pcF = new TextField();
        grid.add(pcF, 1, 3);

        Label dob = new Label("Date of Birth:");
        grid.add(dob, 2, 3);

        TextField dobF = new TextField();
        grid.add(dobF, 3, 3);
//-----------------------------------------------------------------------
//This creates a button on the scene and allow user to inteact with it
//This sets the position, alignment of the text on the scene
        Button btn = new Button("Submit");
        HBox hbBtn = new HBox(30);
        hbBtn.setAlignment(Pos.CENTER);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 2, 6);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        
        btn.setOnAction(new EventHandler<ActionEvent>() { 
    @Override
    public void handle(ActionEvent e) {
        actiontarget.setFill(Color.RED);
        actiontarget.setText("Form has been submitted");
    }
});
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
                launch(args);
            
        }
    
}
