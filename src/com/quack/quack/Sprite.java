package com.quack.quack;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Sprite {
    public Vector position;
    public Vector velocity;
    public Image image;
    public Rectangle collider2D;

    public Sprite() {
        position = new Vector(0, 0);
        velocity = new Vector(0, 0);
        collider2D = new Rectangle(0, 0, 0, 0);
    }

    public void setPosition(double x, double y) {
        position.set(x, y);
    }

    public void setImage(String filename) {
        image = new Image(filename);
        collider2D.width = image.getWidth();
        collider2D.height = image.getHeight();
    }

    public Rectangle getCollider2D() {
        collider2D.x = position.x;
        collider2D.y = position.y;
        return collider2D;
    }

    public boolean overlaps(Sprite other) {
        return this.getCollider2D().overlaps(other.getCollider2D());
    }

    public void render(GraphicsContext brush) {
        brush.drawImage(image, position.x, position.y);
    }
}
