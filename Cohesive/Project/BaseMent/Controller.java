package BaseMent;

import java.io.IOException;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Controller {

    private double xOffset = 0;
    private double yOffset = 0;
    private StopWatch stopWatch = new StopWatch();
    private Stage stage;
    private Color glowingRed = Color.web("ff2800");
    private Color glowingGreen = Color.web("00bf0f");
    private DropShadow dropShadow = new DropShadow(10.81, glowingRed);
    private InnerShadow innerShadow = new InnerShadow(20.58, glowingRed);

    private Button minimizeButton;
    @FXML
    private ToggleButton mainButton;
    @FXML
    private Button resetButton;
    private ToolBar controlBar;
    @FXML
    private Label millsLabel;
    @FXML
    private Label secondsLabel;
    @FXML
    private ProgressIndicator progressIndicator;
    @FXML
    private Button BackBtn;


    @FXML
    void clickMainButton() {
        if (mainButton.getText().equals("Start")) {
            stopWatch.run(secondsLabel, millsLabel);
            mainButton.setText("Stop");
            makeButtonRed(mainButton, dropShadow, innerShadow);
            progressIndicator.setVisible(true);
        } else if (mainButton.getText().equals("Stop")) {
            stopWatch.stop();
            mainButton.setText("Start");
            makeButtonGreen(mainButton, dropShadow, innerShadow);
            progressIndicator.setVisible(false);
        }
    }

    @FXML
    void clickResetButton() {
        millsLabel.setText("00");
        secondsLabel.setText("00:00");
        stopWatch.reset();
    }

    void exit() {
        Platform.exit();
    }

    void minimize() {
        stageOf(stage, minimizeButton).setIconified(true);
    }

    private void initialize() {
        makeDraggable(stage, controlBar);
    }

    private void makeDraggable(Stage stage, Parent parent) {
        parent.setOnMousePressed(event -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });
        parent.setOnMouseDragged(event -> {
            stageOf(stage, parent).setX(event.getScreenX() - xOffset);
            stageOf(stage, parent).setY(event.getScreenY() - yOffset);
        });
    }

    private Stage stageOf(Stage stage, Parent parent) {
        stage = (Stage) parent.getScene().getWindow();
        return stage;
    }

    private void makeButtonRed(ToggleButton button, DropShadow dropShadow, InnerShadow innerShadow) {
        button.setStyle("-fx-border-color: #ff2800;" +
                "-fx-border-width: 2;" +
                "-fx-border-radius: 7;" +
                "-fx-background-radius: 7;");
        dropShadow.setColor(glowingRed);
        innerShadow.setColor(glowingRed);
        innerShadow.setInput(dropShadow);
        button.setEffect(innerShadow);
    }

    private void makeButtonGreen(ToggleButton button, DropShadow dropShadow, InnerShadow innerShadow) {
        button.setStyle("-fx-border-color: #00bf0f;" +
                "-fx-border-width: 2;" +
                "-fx-border-radius: 7;" +
                "-fx-background-radius: 7;");
        dropShadow.setColor(glowingGreen);
        innerShadow.setColor(glowingGreen);
        innerShadow.setInput(dropShadow);
        button.setEffect(innerShadow);
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