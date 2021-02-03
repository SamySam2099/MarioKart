package com.quack.quack;

import javafx.scene.canvas.GraphicsContext;

interface Renderer {
	
	/**
    * Render method. 
    *
    * @param  context render context object for drawing
    */
	public void render(GraphicsContext context);
}
