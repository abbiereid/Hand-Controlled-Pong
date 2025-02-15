package com.almasb.fxglgames.pong;

import com.almasb.fxgl.ui.UIController;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

public class HandTrackingUIController implements UIController {

    @FXML
    private Canvas canvas;

    public Canvas getCanvas() {
        return canvas;
    }

    @Override
    public void init() {
       canvas.getGraphicsContext2D().setFill(Color.WHITE);
       canvas.setHeight(600);
       canvas.setWidth(800);
    }
}
