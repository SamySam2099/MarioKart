package com.quack.quack;

public class Rectangle {
    public double x; // x coordinate
    public double y; // y coordinate
    public double width; // width of the rectangle
    public double height; // height of the rectangle

    public Rectangle(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
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
