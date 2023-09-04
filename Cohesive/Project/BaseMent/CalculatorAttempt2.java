
package BaseMent;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class CalculatorAttempt2 extends Application {
    
    private static Stage historyStage = null;
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("Calculator");
        stage.show();
        createHistoryStage();
    }
    public void createHistoryStage(){
        historyStage = new Stage();
        historyStage.setTitle("Calculation History");
        historyStage.setAlwaysOnTop(true);
        historyStage.setResizable(false);
        historyStage.initModality(Modality.APPLICATION_MODAL);
    }

    public static Stage getHistoryStage() {
        return historyStage;
    }
   
    public static void main(String[] args) {
        launch(args);
    }
    
}
