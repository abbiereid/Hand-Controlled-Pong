package com.almasb.fxglgames.pong;

import com.almasb.fxgl.ui.UIController;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

public class HandTrackingUIController implements UIController {
    @Override
    public void init() {
       Canvas canvas = new Canvas(800, 600);
    }
}
