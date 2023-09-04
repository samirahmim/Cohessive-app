package BaseMent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class BaseMentController implements Initializable {
    
    private Label label;
    @FXML
    private Button CalculatorBtn;
    @FXML
    private Button CalenderBtn;
    @FXML
    private Button ConverterBtn;
    @FXML
    private Button timer;
    @FXML
    private Button planner;
    @FXML
    private Button exitBtn;
    
    private void handleButtonAction(ActionEvent event) {
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void CalculatorBtnPressed(ActionEvent event) throws IOException{
            Stage primaryStage=new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
    }

    @FXML
    private void CalenderBtnPressed(ActionEvent event) throws IOException {
            Stage primaryStage=new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("calendar.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.initStyle(StageStyle.UNDECORATED);
            primaryStage.show();
    }

    @FXML
    private void ConverterBtnPressed(ActionEvent event) throws IOException{
           //((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
            Stage primaryStage=new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("ConverterFxml.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.initStyle(StageStyle.UNDECORATED);
            primaryStage.show();
    }

    @FXML
    private void TimerBtnPressed(ActionEvent event) throws IOException {
            //((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
            Stage primaryStage=new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("timer.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.initStyle(StageStyle.UNDECORATED);
            primaryStage.show();
    }

    @FXML
    private void PlannerBtnPressed(ActionEvent event) throws IOException {
            Stage primaryStage=new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("ToDoFXMLDocument.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.initStyle(StageStyle.UNDECORATED);
            primaryStage.show();
    }

    @FXML
    private void exitBtnPressed(ActionEvent event) {
          ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
    }
    
}