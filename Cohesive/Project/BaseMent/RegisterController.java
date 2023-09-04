
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


public class RegisterController implements Initializable {
    
    private Label label;
    @FXML
    private TextField txtUName;
    @FXML
    private PasswordField txtPass;
    @FXML
    private PasswordField txtPass1;
    @FXML
    private Button registerBtn;
    
    Connection con;
    PreparedStatement pst;
    @FXML
    private Button CloseBtn;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void registerBtnPressed(ActionEvent event) throws IOException {
        String UName=txtUName.getText();
        String Pass=txtPass.getText();
        String Pass1=txtPass1.getText();
        System.out.println(""+Pass+" "+Pass1);
        
        try {
            if(!Pass.equals(Pass1)){
                ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
                JOptionPane.showMessageDialog(null, "Registration Failed\npassword don't match");
            }
            
            Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
                pst=con.prepareStatement("SELECT * FROM `register` WHERE UserName=? && Password=?");
                pst.setString(1, UName);
                pst.setString(2, Pass);
            ResultSet rs = pst.executeQuery();
                
                if(rs.next()){
                   ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
                JOptionPane.showMessageDialog(null, "Registration Failed\nId already exists");
                txtUName.setText("");
                    txtPass.setText("");
                    txtUName.requestFocus();
                    txtPass1.setText("");
                }else{
                    
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/register","root","");
            pst=con.prepareStatement("INSERT INTO `register`(UserName,Password,Password2)values(?,?,?)");
            pst.setString(1, UName);
            pst.setString(2, Pass);
             pst.setString(3, Pass1);
            int status=pst.executeUpdate();
            if(status==1 && Pass.equals(Pass1)){
                
                ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
                 JOptionPane.showMessageDialog(null, "Registered");
                txtUName.setText("");
                txtPass.setText("");
                txtPass1.setText("");
                txtUName.requestFocus();
                    
                }
            
            
            
            
            
           
            }
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegisterController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RegisterController.class.getName()).log(Level.SEVERE, null, ex);
        
    }
    
}
    @FXML
    private void closeBtnPressed(ActionEvent event) {
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
    }
}
