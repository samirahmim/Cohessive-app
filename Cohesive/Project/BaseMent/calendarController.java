package BaseMent;



import java.io.IOException;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
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
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class calendarController implements Initializable {
    
    private Label label;
    @FXML
    private Label l1;
    @FXML
    private Label l2;
    @FXML
    private Label l3;
    @FXML
    private Label l4;
    @FXML
    private Label l5;
    @FXML
    private Label l6;
    @FXML
    private Label l7;
    @FXML
    private Label l8;
    @FXML
    private Label l9;
    @FXML
    private Label l10;
    @FXML
    private Label l11;
    @FXML
    private Label l12;
    @FXML
    private Label l13;
    @FXML
    private Label l14;
    @FXML
    private Label l22;
    @FXML
    private Label l23;
    @FXML
    private Label l24;
    @FXML
    private Label l25;
    @FXML
    private Label l26;
    @FXML
    private Label l27;
    @FXML
    private Label l28;
    @FXML
    private Label l15;
    @FXML
    private Label l16;
    @FXML
    private Label l17;
    @FXML
    private Label l18;
    @FXML
    private Label l19;
    @FXML
    private Label l20;
    @FXML
    private Label l21;
    @FXML
    private Label l29;
    @FXML
    private Label l30;
    @FXML
    private Label l31;
    @FXML
    private Label l32;
    @FXML
    private Label l33;
    @FXML
    private Label l34;
    @FXML
    private Label l35;
    
    String []monthName={"January","February","March","April","May","June","July","August","September","October","November","December"};
    int []monthDay={31,28,31,30,31,30,31,31,30,31,30,31};
    int [] fdayofMonth=new int[12];
    int firstdayofyear=0;
    int day;
    int year;
    int month;
    int firstdayofmonth;
    String monString;
    int mon;
    Date date= new Date();
    @FXML
    private ComboBox<String> comboMnth;
    ObservableList<String> list=FXCollections.observableArrayList(monthName);
    @FXML
    private Label crntMnth;
    @FXML
    private Label crntYear;
    @FXML
    private TextField yearInputField=null;
    @FXML
    private Button UpBtn;
    @FXML
    private Button DownBtn;
    @FXML
    private Button TodayBtn;
    @FXML
    private Button BackBtn;
    
    private void handleButtonAction(ActionEvent event) {
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       comboMnth.setItems(list);
       month=getcurrentmonth();
       year=getcurrentyear();
       comboMnth.setValue(""+monthName[month] );
       
       String tm = new String(date.getMonth() + "");
       crntMnth.setText(monthName[month]);
       crntYear.setText(String.valueOf(Calendar.getInstance().get(Calendar.YEAR))) ;
       generatemonthfday(getFirstdayOfYear(year));
       showCalender(getMonthFday(month));
        
    } 
    public int getcurrentmonth(){
        
       int dat=date.getMonth();
       return dat;
       }
    public int getcurrentyear(){
        int dat=date.getYear();
        dat=dat+1900;
        return dat;
    }
    public int getcurrentday(){
        int dat=date.getDate();
        return dat;
    }
    @FXML
    private void getYearinput(ActionEvent event) {
        if(yearInputField!=null){year=Integer.valueOf(yearInputField.getText());}
        else {year=getcurrentyear();}
        month=monthdaycounter(comboMnth.getValue());
        crntMnth.setText(monthdaycounter2(month));
        crntYear.setText(String.valueOf(year));
        generatemonthfday(getFirstdayOfYear(year));
        showCalender(getMonthFday(month));
    }
    @FXML
    public void comboMnthchange(ActionEvent event){
       crntMnth.setText(comboMnth.getValue());
       if(yearInputField!=null){
           year=Integer.valueOf(yearInputField.getText());
       }
       else {
           year=getcurrentyear();
           System.out.println(""+year);
       }
    
       month=monthdaycounter(comboMnth.getValue());
       crntMnth.setText(monthdaycounter2(month));
       crntYear.setText(String.valueOf(year));
   
      
      generatemonthfday(getFirstdayOfYear(year));
       
        showCalender(getMonthFday(month));
        
   }
    
     public int monthdaycounter(String month){
         if(month.equals("January")){return 0;}
        else if(month.equals("February")){return 1;}
        else if(month.equals("March")){return 2;}
        else if(month.equals("April")){return 3;}
        else if(month.equals("May")){return 4;}
        else if(month.equals("June")){return 5;}
        else if(month.equals("July")){return 6;}
        else if(month.equals("August")){return 7;}
        else if(month.equals("September")){return 8;}
        else if(month.equals("October")){return 9;}
        else if(month.equals("November")){return 10;}
        else if(month.equals("December")){return 11;}
        return 0;
        }
     
     public String monthdaycounter2(int m){
         if(m==0) return "January";
        else if(m==1){return "February";}
        else if(m==2){return "March";}
        else if(m==3){return "April";}
        else if(m==4){return "May";}
        else if(m==5){return "June";}
        else if(m==6){return "July";}
        else if(m==7){return "August";}
        else if(m==8){return "September";}
        else if(m==9){return "October";}
        else if(m==10){return "November";}
        else if(m==11){return "December";}
        return null;
        
        }
     
    public void generatemonthfday(int day){
        
    
          int totalmday=day;
          fdayofMonth[0]=day;
       
        for(int i=1;i<12;i++){
            totalmday+=monthDay[i-1];
            fdayofMonth[i]=totalmday%7;
            
            if(fdayofMonth[i]==0){
             fdayofMonth[i]=7;}}
   }
    public int getMonthFday(int month)
    { 
        return fdayofMonth[month];
        
    }
    public void showCalender(int d){
        if(d==7){
            d=0;
        }
     Label[]label= new Label[]{l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l35};
      for(int i=0;i<35;i++){
          
          label[i].setStyle("-fx-text-fill: #000000");
      }
        for(int i=0;i<d;i++){
           label[i].setText(" ");
        }
        int j=1;
        for(int i=d;i<d+monthDay[month];i++){
            label[i].setText(Integer.toString(j));
            j++;
        }
       
        if(year==getcurrentyear()&&month==getcurrentmonth()){
            int a;
            a=getcurrentday();
            label[d+a-1].setStyle("-fx-text-fill: #cf1020");
        }
       
       
       int k=d+monthDay[month];
       
      for(int l=k;l<35;l++){
          label[l].setText(" ");
      }
        
        
    }
    public int getFirstdayOfYear(int year){
        
         day = (((year - 1) * 365) + ((year - 1) / 4) - ((year - 1) / 100) + ((year) / 400) + 1) % 7;
         if ((year%4==0&&year%100!=0)||(year%400==0)){
            monthDay[1]=29;
          }
         if(day==0){firstdayofyear=1;}
       else if(day==1){firstdayofyear=2;}
       else if(day==2){firstdayofyear=3;}
       else if(day==3){firstdayofyear=4;}
       else if(day==4){firstdayofyear=5;}
       else if(day==5){firstdayofyear=6;}
       else if(day==6){firstdayofyear=7;}
        return firstdayofyear;
    }

    @FXML
    private void UpBtnPressed(ActionEvent event) {
        month=month+1;
        if(month==12){
            month=0;
            year=year+1;
        }
        crntMnth.setText(monthdaycounter2(month));
        generatemonthfday(getFirstdayOfYear(year));
        crntMnth.setText(monthdaycounter2(month));
        crntYear.setText(String.valueOf(year));
        //comboMnth.setValue(monthdaycounter2(month));
        //yearInputField.setText(String.valueOf(year));
        showCalender(getMonthFday(month));
    }

    @FXML
    private void DownBtnPressed(ActionEvent event) {
        month=month-1;
        if(month==-1){
            month=11;
            year=year-1;
        }
        crntMnth.setText(monthdaycounter2(month));
        generatemonthfday(getFirstdayOfYear(year));
        crntMnth.setText(monthdaycounter2(month));
        crntYear.setText(String.valueOf(year));
        //comboMnth.setValue(monthdaycounter2(month));
        //yearInputField.setText(String.valueOf(year));
        showCalender(getMonthFday(month));
    }

    @FXML
    private void TodayBtnPressed(ActionEvent event) {
         month=getcurrentmonth();
         year=getcurrentyear();
         String tm = new String(date.getMonth() + "");
         crntMnth.setText(monthName[month]);
         crntYear.setText(String.valueOf(Calendar.getInstance().get(Calendar.YEAR))) ; 
         generatemonthfday(getFirstdayOfYear(year));
         //comboMnth.setValue(monthdaycounter2(month));
         //yearInputField.setText(String.valueOf(year));
         showCalender(getMonthFday(month));
    }

    @FXML
    private void BackBtnPressed(ActionEvent event) throws IOException {
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
            Stage primaryStage=new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Basement.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.initStyle(StageStyle.UNDECORATED);
            primaryStage.show();
    }
    

    
    
}
