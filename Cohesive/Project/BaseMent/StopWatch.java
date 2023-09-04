/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseMent;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.control.Label;
import javafx.util.Duration;

class StopWatch {
    private int counter = 0;
    private int mills = 0;
    private Timeline timeline;
    private Timeline millsLine;

    private void addMilliseconds(Label label) {
        int limit = 6000 * 6000;
        if (mills < limit) {
            mills++;
        }
        String millsDigits = String.format("%02d", mills % 100);
        label.setText(millsDigits);
    }

    private void secondsAndMinutes(Label label) {
        int limit = 60 * 60;
        if (counter < limit) {
            counter++;
        }

        String stopwatch = String.format("%02d:%02d", counter / 60, counter % 60);
        label.setText(stopwatch);

    }

    void run(Label main, Label mills) {
        millsLine = new Timeline(new KeyFrame(Duration.millis(10), e -> addMilliseconds(mills)));
        millsLine.setCycleCount(Animation.INDEFINITE);
        millsLine.play();
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> secondsAndMinutes(main)));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    void stop() {
        try {
            timeline.stop();
            millsLine.stop();
        } catch (NullPointerException e) {
            System.out.println("ERROR: There is no timeline running to stop.");
        }
    }

    void reset() {
        counter = 0;
        mills = 0;
    }
}