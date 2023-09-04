
package BaseMent;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class LoginController implements Initializable {
    
    private Label label;
    @FXML
    private TextField txtUName;
    @FXML
    private PasswordField txtPass;
    @FXML
    private Button LoginBtn;
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    @FXML
    private Button closeBtn;
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void LoginBtnPressed(ActionEvent event) throws IOException {
        String UName=txtUName.getText();
        String Pass=txtPass.getText();
        
        if(UName.equals("")&&Pass.equals("")){
            JOptionPane.showMessageDialog(null, "UserName Or Password is Blank");
        }else{
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
                pst=con.prepareStatement("SELECT * FROM `register` WHERE UserName=? && Password=?");
                pst.setString(1, UName);
                pst.setString(2, Pass);
                rs=pst.executeQuery();
                
                if(rs.next()){
                    ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
                    Stage primaryStage=new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("BaseMent.fxml"));
                    Scene scene = new Scene(root);
                    primaryStage.setScene(scene);
                    primaryStage.show();
                    
                }else{
                    ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
                    JOptionPane.showMessageDialog(null, "Login Failed\nInvalid username or password");
                    txtUName.setText("");
                    txtPass.setText("");
                    txtUName.requestFocus();
                    
                }
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @FXML
    private void closeBtnPressed(ActionEvent event) {
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
    }
    
}
