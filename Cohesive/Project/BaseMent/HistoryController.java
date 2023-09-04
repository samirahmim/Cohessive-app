
package BaseMent;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;


public class HistoryController implements Initializable {

    @FXML
    private ListView<String> historyList;

   
    
    public void initializeCalculation(ArrayList<String> Calc_history){
       Calc_history.forEach((calculation)-> {
            historyList.getItems().add(calculation);
    });
      
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    

}
