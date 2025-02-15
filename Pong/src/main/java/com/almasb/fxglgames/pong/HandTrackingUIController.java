package com.almasb.fxglgames.pong;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.intelligence.gesturerecog.HandTrackingService;
import com.almasb.fxgl.ui.UIController;
import javafx.application.Platform;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HandTrackingUIController implements UIController {

    private GraphicsContext g;
    @Override
    public void init() {
        Canvas canvas = new Canvas(800, 600);

        g = canvas.getGraphicsContext2D();
        g.setFill(Color.BLUE);

//        FXGL.addUINode(canvas);
//
//        FXGL.getService(HandTrackingService.class)
//                .addInputHandler(hand -> {
//
//                    Platform.runLater(() -> {
//                        g.clearRect(0, 0, 800, 600);
//
//                        Stage stage = FXGL.getPrimaryStage();
//
//                        hand.getPoints().forEach(p -> {
//                            g.fillOval((1 - p.getX()) * 600, p.getY() * 400, 10, 10);
//                        });
//
//                    });
//                });
//
//        FXGL.getService(HandTrackingService.class)
//                .readyProperty()
//                .subscribe(() -> {
//                    // code
//                    System.out.println(FXGL.getService(HandTrackingService.class).getVideoDevices());
//                    System.out.println("Ready");
//                });
//
//        FXGL.getService(HandTrackingService.class).start();
    }
}
