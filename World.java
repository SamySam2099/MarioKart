package com.quack.quack;

import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class World {
	
	private ArrayList<Renderer> renderObjects = new ArrayList<Renderer>(); //storage of all the worlds objects to be rendered

	/*All passed in constructor*/
	private int width, height; //canvas width and height
	private Color backgroundColor; //background color
    GraphicsContext brush; //instance of fx drawer "GraphicsContext")
	
	public World(int worldwidth, int worldheight, Color color, GraphicsContext inpbrush) {
		width = worldwidth;
		height = worldheight;
		backgroundColor = color;
		brush = inpbrush;
	}
	
	// render loop
    AnimationTimer renderLoop = new AnimationTimer() {
    	public void handle(long nanotime) {
            brush.fillRect(0, 0, width, height); //draw background first
    		for(Renderer sprite : renderObjects) {
    			sprite.render(brush); //render all registered objects
    		}
    	}
    };
	
    // begin rendering
	void beginRendering() {
		brush.setFill(backgroundColor); // setting the colour of the brush
		renderLoop.start(); // starts renderloop
        
	}
	
	// registers renderable object by adding it to arraylist
	public void addRenderable(Renderer renderItem) {
		renderObjects.add(renderItem);
	}
		
}
