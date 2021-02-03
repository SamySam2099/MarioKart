package com.quack.quack;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Sprite implements Renderer {
    private Vector position;
    private Vector velocity;
    private Image image;

    public Sprite() {
        position = new Vector(0, 0);
        velocity = new Vector(0, 0);
    }
    
    public Vector getPosition() {
        return position;
    }
    
    public Vector getVelocity() {
        return velocity;
    }
    
    public void setPosition(double x, double y) {
        position.set(x, y);
    }

    public void setImage(String filename) {
        image = new Image(filename);
    }  
    
    public void setImage(String filename, int width, int height) {
    	image = new Image(filename, width, height, false, false);
    }

    public Rectangle getCollider2D() {
        return new Rectangle(position.getX(), position.getY(), image.getWidth(), image.getHeight());
    }

    public boolean overlaps(Sprite other) {
        return getCollider2D().overlaps(other.getCollider2D());
    }

    public void render(GraphicsContext brush) {
        brush.drawImage(image, position.getX(), position.getY());
    }
}
