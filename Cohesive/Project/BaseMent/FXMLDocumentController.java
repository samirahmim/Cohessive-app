
package BaseMent;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import java.lang.reflect.Method;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class FXMLDocumentController extends HistoryController{
    
    @FXML
    private Label InputExp;
    @FXML
    private Label Result;
    @FXML
    private Button History;
    
    private ArrayList<String> Calc_history = new ArrayList();
    
    public void InputNumber(String number){
        InputExp.setText(InputExp.getText() + number);
    }
    
    public void InputOperator(String operator){
        InputExp.setText(InputExp.getText() + " "+operator+" ");
    }
    
    public void clearExpression(){
        InputExp.setText("");
        Result.setText("");
    }
    public Label getInputExp(){
        return InputExp;
    }
    public Label getResult(){
        return Result;
    }
    public void setResult(String newResult){
        this.Result.setText("= "+newResult);
    }
    public void insertAnswer(String Ans){
        InputExp.setText(InputExp.getText()+" "+Ans);
    }
    
    public void OpenHistoryWindow() throws IOException{
       /* try{
             FXMLLoader loader=FXMLLoader.load(getClass().getResource("History.fxml"));
             Parent root = loader.load();
             CalculatorAttempt2.getHistoryStage().setScene(new Scene (root));
              HistoryController historyController=loader.getController();
             historyController.initializeCalculation(Calc_history);
              CalculatorAttempt2.getHistoryStage().show();
             
        } catch(IOException e){
            System.out.println(e);
        }
      */
       
       Parent root = FXMLLoader.load(getClass().getResource("History.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=new Stage();
        stage.setScene(scene);
        //FXMLLoader loader=FXMLLoader.load(getClass().getResource("History.fxml"));
            // HistoryController historyController=root.getController();
             //initializeCalculation(Calc_history);
             stage.show();
    
    }
    
    public void deleteLast(){
        if(!getInputExp().getText().isEmpty()){
            StringBuilder text = new StringBuilder(getInputExp().getText());
            text.deleteCharAt(text.length() -1);
            getInputExp().setText(text.toString());
        }
    }
    
    public void addCalculation(String InputExp, String Result){
        this.Calc_history.add(InputExp + " = " + Result);
    }

    @FXML
    private void OnMouseClicked(MouseEvent mouseEvent) throws IOException {
        Button btn=(Button) mouseEvent.getSource();
        String buttonText=btn.getText();
        
        switch(buttonText){
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "0":
                InputNumber(buttonText);
                break;
            case "+":
            case "-":
            case "/":
            case "*":
                InputOperator(buttonText);
                break;
            case "Clear":
                clearExpression();
                break;
            case "=":
                double result = EvaluateString.evaluate(this.getInputExp().getText());
                addCalculation(this.getInputExp().getText(), String.valueOf(result));
                setResult(String.valueOf(result));
                break;
            case "Ans":
                insertAnswer(getResult().getText().substring(2));
                break;
            case "Delete":
                deleteLast();
                break;
            case "History":
                OpenHistoryWindow();
                
                break;
            default:
                break;
        }
    }

    @FXML
    private void btnNmbr(ActionEvent event) {
    }

    @FXML
    private void btnOperator(ActionEvent event) {
    }

    @FXML
    private void btnText(ActionEvent event) {
    }

    @FXML
    private void btnText(MouseEvent event) {
    }

    @FXML
    private void OnKeyPressed(KeyEvent event) {
        
    }


}
