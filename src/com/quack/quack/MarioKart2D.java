package com.quack.quack;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class MarioKart2D extends Application {
    public static void main(String[] args) {
        // trying to launch the application
        try {
            launch(args);
        }
        // catching any exceptions if required
        catch (Exception e) {
            e.printStackTrace();
        }
        // finally exits when we are done
        finally {
            System.exit(0);
        }
    }

    public void start(Stage mainStage) {
        mainStage.setTitle("MarioKart2D v0.0.1"); // setting the title of the game

        BorderPane root = new BorderPane(); // useful for menu bar across the top

        Scene mainScene = new Scene(root); // create a scene, the content area in the pane
        mainStage.setScene(mainScene); // setting the scene in the pane

        // custom code
        Canvas canvas = new Canvas(600, 600); // the area where elements are rendered
        GraphicsContext brush = canvas.getGraphicsContext2D();//performs all the drawing operations on the canvas
        // acts as a brush

        root.setCenter(canvas); // adding the canvas to the border pane in order to be displayed on the scene

        brush.setFill(Color.BLUE); // setting the colour of the brush
        brush.fillRect(0, 0, 600, 600); // drawing with the brush
        // custom code

        Sprite car1 = new Sprite(); // creating a sprite
        car1.position.set(100, 100); // setting the position
        car1.setImage("https://www.spriters-resource.com/resources/sheet_icons/7/6880.png"); // setting the img
        car1.render(brush); // render it

        mainStage.show(); // showing everything on the screen
    }
}
