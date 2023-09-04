package BaseMent;

import java.io.IOException;
import java.net.URL;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class ConverterFxmlController implements Initializable {
   Convert convert=new Convert();
    private Label label;
    @FXML
    private ComboBox<String> TypeComboBox;
    ObservableList<String> list=FXCollections.observableArrayList("Length","Area","Weight","Volume","Time","Speed","Temperature");
    @FXML
    public ComboBox<String> Unit1ComboBox;
    
    @FXML
    private ComboBox<String> Unit2ComboBox;
    
    @FXML
    private TextField ValueTxtFld;
    @FXML
    private Button ShowResultBtn;
    @FXML
    private TextField ResultTxtFld;
    @FXML
    private Button backBtn;
    
    private void handleButtonAction(ActionEvent event) {
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TypeComboBox.setItems(list);
    }    
    
    
    @FXML
    public void TypeComboBoxChanged(ActionEvent event) {
        
      if(TypeComboBox.getValue()=="Length"){
            ObservableList<String> list1=FXCollections.observableArrayList("Kilometre","Meter","Centimeter","Millimeter","Micrometres","Nanometre","Mile","Yard","Foot","Inch","Nautical mile");
            ObservableList<String> list2=FXCollections.observableArrayList("Kilometre","Meter","Centimeter","Millimeter","Micrometres","Nanometre","Mile","Yard","Foot","Inch","Nautical mile");
            Unit1ComboBox.setItems(list1);
            Unit2ComboBox.setItems(list2);
      }else if(TypeComboBox.getValue()=="Area"){
          ObservableList<String> list1=FXCollections.observableArrayList("Square kilometer","Square meter","Square mile","Square yard","Square foot","Square inch","Hectare","Acre");
          ObservableList<String> list2=FXCollections.observableArrayList("Square kilometer","Square meter","Square mile","Square yard","Square foot","Square inch","Hectare","Acre");
          Unit1ComboBox.setItems(list1);
          Unit2ComboBox.setItems(list2);
      }else if(TypeComboBox.getValue()=="Weight"){
          ObservableList<String> list1=FXCollections.observableArrayList("tonne","Kilogram","Gram","Milligram","Imperial ton","US ton","Stone","Pound","Ounce");
          ObservableList<String> list2=FXCollections.observableArrayList("tonne","Kilogram","Gram","Milligram","Imperial ton","US ton","Stone","Pound","Ounce");
          Unit1ComboBox.setItems(list1);
          Unit2ComboBox.setItems(list2);
      }else if(TypeComboBox.getValue()=="Weight"){
          ObservableList<String> list1=FXCollections.observableArrayList("tonne","Kilogram","Gram","Milligram","Imperial ton","US ton","Stone","Pound","Ounce");
          ObservableList<String> list2=FXCollections.observableArrayList("tonne","Kilogram","Gram","Milligram","Imperial ton","US ton","Stone","Pound","Ounce");
          Unit1ComboBox.setItems(list1);
          Unit2ComboBox.setItems(list2);
      }else if(TypeComboBox.getValue()=="Volume"){
          ObservableList<String> list1=FXCollections.observableArrayList("US liquid gallon","US liquid quart","US liquid pint","US legal cup","fluid ounce","US tablespoon","US teaspoon","Cubic meter","Liter","Milliliter","imperial gallon","imperial quart","imperial pint","imperial cup","fluid ounce","imperial tablespoon","imperial teaspoon","Cubic foot","Cubic inch");
          ObservableList<String> list2=FXCollections.observableArrayList("US liquid gallon","US liquid quart","US liquid pint","US legal cup","fluid ounce","US tablespoon","US teaspoon","Cubic meter","Liter","Milliliter","imperial gallon","imperial quart","imperial pint","imperial cup","fluid ounce","imperial tablespoon","imperial teaspoon","Cubic foot","Cubic inch");
          Unit1ComboBox.setItems(list1);
          Unit2ComboBox.setItems(list2);
      }
      else if(TypeComboBox.getValue()=="Time"){
          ObservableList<String> list1=FXCollections.observableArrayList("year","month","week","day","hour","minute","second");
          ObservableList<String> list2=FXCollections.observableArrayList("year","month","week","day","hour","minute","second");
          Unit1ComboBox.setItems(list1);
          Unit2ComboBox.setItems(list2);
      }else if(TypeComboBox.getValue()=="Speed"){
          ObservableList<String> list1=FXCollections.observableArrayList("miles per hour","foot per second","meter per second","kilometer per hour","knot");
          ObservableList<String> list2=FXCollections.observableArrayList("miles per hour","foot per second","meter per second","kilometer per hour","knot");
          Unit1ComboBox.setItems(list1);
          Unit2ComboBox.setItems(list2);
      }else if(TypeComboBox.getValue()=="Temperature"){
          ObservableList<String> list1=FXCollections.observableArrayList("Celsius","Fahrenheit","Kelvin");
          ObservableList<String> list2=FXCollections.observableArrayList("Celsius","Fahrenheit","Kelvin");
          Unit1ComboBox.setItems(list1);
          Unit2ComboBox.setItems(list2);
      }
      
    }
    
    @FXML
    private void Unit1ComboChanged(ActionEvent event) {
        String unit1Selected=Unit1ComboBox.getValue();
        
    }

    @FXML
    private void Unit2ComboChanged(ActionEvent event) {
        
    }

    @FXML
    private void ValueTxtFldShow(ActionEvent event) {
    }

    @FXML
    private void ShowResultBtnClicked(ActionEvent event) {
                
                boolean valid = true;
                
        double value = 0;
        try {
            value = Double.parseDouble(ValueTxtFld.getText());
            ValueTxtFld.setStyle(null);
        } catch (NumberFormatException ex) {
            valid = false;
            ValueTxtFld.setStyle("-fx-control-inner-background: red;");
        }


        if (valid) {
                ResultTxtFld.setText(String.valueOf(convert.convert(TypeComboBox.getValue(),value, Unit1ComboBox.getValue(), Unit2ComboBox.getValue())));
            }                      
        }   

    @FXML
    private void backBtnPressed(ActionEvent event) throws IOException {
            ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
            Stage primaryStage=new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Basement.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.initStyle(StageStyle.UNDECORATED);
            primaryStage.show();
    }
}
