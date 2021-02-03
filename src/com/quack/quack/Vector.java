package com.quack.quack;

public class Vector {

    public double x; // x coordinate
    public double y; // y coordinate

    public Vector(double x, double y){
        this.set(x,y);
    }

    public void set(double x, double y){
        this.x = x;
        this.y = y;
    }
}
