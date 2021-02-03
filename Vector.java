package com.quack.quack;

public class Vector {

    private double x, y; // x, y coordinate
    
    public Vector(double x, double y){
        this.set(x,y);
    }
        
    public double getX() {
    	return x;
    }
    
    public double getY() {
    	return y;
    }

    public void set(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public void add(double dx, double dy) {
    	this.x += dx;
    	this.y += dy;
    }
    
    public void add(Vector other) {
    	this.add(other.x, other.y);
    }
}
