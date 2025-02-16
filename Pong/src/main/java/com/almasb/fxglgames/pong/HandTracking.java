package com.almasb.fxglgames.pong;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.intelligence.gesturerecog.HandTrackingService;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HandTracking {

    private static GraphicsContext g;

    private static double y;

    public static void initUI(Canvas canvas) {
        g = canvas.getGraphicsContext2D();
        g.setFill(Color.BLUE);

        Stage stage = PongApp.getHandStage();
        Scene scene = new Scene(new Group(canvas));
        stage.setScene(canvas.getScene());

        FXGL.getService(HandTrackingService.class)
                .addInputHandler(hand -> {

                    Platform.runLater(() -> {
                        g.clearRect(0, 0, 800, 600);

                        hand.getPoints().forEach(p -> {
                            g.fillOval((1 - p.getX()) * 600, p.getY() * 400, 10, 10);
                        });

                        y = hand.getPoints().getFirst().getY();

                    });
                });

        FXGL.getService(HandTrackingService.class)
                .readyProperty()
                .subscribe(() -> {
                    System.out.println(FXGL.getService(HandTrackingService.class).getVideoDevices());
                    System.out.println("Ready");
                });

        FXGL.getService(HandTrackingService.class).start();
    }

    public double getY() {
        return y;
    }

}
