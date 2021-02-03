package com.quack.quack;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class MarioKart2D extends Application {
	
    final int windowWidth = 600, windowHeight = 600; //window width and height

    
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

    	/* Inital javafx window setup*/
        mainStage.setTitle("MarioKart2D v0.0.1"); // setting the title of the game
        BorderPane root = new BorderPane(); // useful for menu bar across the top
        Scene mainScene = new Scene(root, windowWidth, windowHeight); // create a scene, the content area in the pane
        mainStage.setScene(mainScene); // setting the scene in the pane
        Canvas canvas = new Canvas(windowWidth, windowHeight); // the area where elements are rendered
        GraphicsContext brush = canvas.getGraphicsContext2D();//performs all the drawing operations on the canvas
        root.getChildren().add(canvas);

        
        /*Construct world*/
        World world = new World(windowWidth, windowHeight, Color.BLUE, brush);
        world.beginRendering(); //begin render loop

        
        /*Test sprite 1*/
        Sprite car1 = new Sprite(); // creating a sprite
        car1.getPosition().set(100, 100); // setting the position
        car1.setImage("https://www.spriters-resource.com/resources/sheet_icons/7/6880.png"); // setting the img
        
        world.addRenderable(car1); //registering the object
        
        /*Test sprite 2*/
        Sprite car2 = new Sprite(); // creating a sprite
        car2.getPosition().set(200, 200); // setting the position
        car2.setImage("https://www.spriters-resource.com/resources/sheets/145/147793.png?updated=1611572881", 100, 100); // setting the img and width/height
        
        world.addRenderable(car2); //registering the object

        
                
        mainStage.show();    
 
    }
}
