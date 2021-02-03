package com.quack.quack;

public class Rectangle {
	
    private double x, y, width, height; // x y coordinates and width height

    public Rectangle(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    public double getX() {
    	return x;
    }
    
    public double getY() {
    	return y;
    }
    
    public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getWidth() { 
    	return width;
    }
    
    public double getHeight() {
    	return height;
    }
	
	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

    public boolean overlaps(Rectangle other){
        // separating axis theorem to see with two rectangles overlap
        // 4 cases to consider
        // this rect to the left of other rectangle
        // this rect to the right of the other rect
        // this rect above the other rect
        // this rect below the other rect

        boolean noOverlap =
                this.x + this.width < other.x
                        || other.x + other.width < this.x
                        || this.y + this.height < other.y
                        || other.y + other.height < this.y;

        return !noOverlap;
    }
}
