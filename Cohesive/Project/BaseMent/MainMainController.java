
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
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainMainController implements Initializable {

    @FXML
    private Button SignInBtn;
    @FXML
    private Button SignUpBtn;
    @FXML
    private Button ExitBtn;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void SignInBtnPressed(ActionEvent event) throws IOException {
            Stage primaryStage=new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.initStyle(StageStyle.UNDECORATED);
            primaryStage.show();
    }

    @FXML
    private void SignUpBtnPressed(ActionEvent event) throws IOException {
            Stage primaryStage=new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("register.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.initStyle(StageStyle.UNDECORATED);
            primaryStage.show();
    }

    @FXML
    private void ExitBtnPressed(ActionEvent event) {
         ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
    }
    
}
