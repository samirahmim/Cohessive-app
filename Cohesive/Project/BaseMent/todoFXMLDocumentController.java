
package BaseMent;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class todoFXMLDocumentController implements Initializable {

    @FXML
    private TextField desTextField;
    @FXML
    private Button backBtn;

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        datePicker.setValue(LocalDate.now());
    }    
    @FXML  
    Button AddButton;
    @FXML
    DatePicker datePicker;
    
    @FXML
    ListView<LocalEvent> eventList; 
    
    ObservableList<LocalEvent> list = FXCollections.observableArrayList();
    
    
    @FXML
    private void addEvent(ActionEvent e){
        list.add(new LocalEvent(datePicker.getValue(),desTextField.getText()));
        eventList.setItems(list);
        refresh();
    }
    
    private void refresh(){
        datePicker.setValue(LocalDate.now());
        desTextField.setText(null);
        
    }

    @FXML
    private void BackBtnPressed(ActionEvent event) throws IOException {
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
                    
    }
}
