package org.example.busGame;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class HelloController {
    private int x1 = -10;
    private int x2 = -150 ;
    private int x3 = -350;
    private int x4 = -550 ;
    private int x5 = -30;
    private int x6 = -170 ;
    private int x7 = -390;
    private int x8 = -570 ;
    private int y = 0;
    private boolean continueMove;

    @FXML
    private Rectangle snake;
    @FXML
    private Rectangle snake1;
    @FXML
    private Rectangle snake2;
    @FXML
    private Rectangle snake3;
    @FXML
    private Rectangle snake4;
    @FXML
    private Rectangle snake5;
    @FXML
    private Rectangle snake6;
    @FXML
    private Rectangle snake7;
    @FXML
    private Pane screen;

    @FXML
    void right() {
        continueMove = true; // Set continueMove to true
        x1 += 1; // Increase the increment value for x1
        x2 += 1; // Increase the increment value for x2
        x3 += 1; // Increase the increment value for x3
        x4 += 1; // Increase the increment value for x4
        x5 += 1; // Increase the increment value for x1
        x6 += 1; // Increase the increment value for x2
        x7 += 1; // Increase the increment value for x3
        x8 += 1; // Increase the increment value for x4
        int delayMillis = 40;

        if(x1<600) {
            snake.setLayoutX(x1);
            snake4.setLayoutX(x5);
        } else {
            x1 = -10;
            x4 = -30;
        }
        if(x2<600) {
            snake1.setLayoutX(x2);
            snake5.setLayoutX(x6);
        } else {
            x2 = -150;
            x4 = -170;
        }
        if(x3<600) {
            snake2.setLayoutX(x3);
            snake6.setLayoutX(x7);
        } else {
            x3 = -350;
            x7 = -390;
        }
        if(x4<600) {
            snake3.setLayoutX(x4);
            snake7.setLayoutX(x8);
        } else {
            x4 = -550;
            x8 = -570;
        }

        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(delayMillis), e -> right()));
        timeline.play();
        System.out.println("x1:"+x1+" x2:"+x2+" x3:"+x3+" x4:"+x4);
    }


    public void initialize(){
        right();
    }
}
