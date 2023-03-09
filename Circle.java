/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cau3;

/**
 *
 * @author 84974
 */
public class Circle extends Shape {
    private double radius = 1.0;
    final double PI = 3.14;
    

    public Circle() {
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
      
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }
    
    public double getArea(){
        return PI * this.radius * this.radius ;
    }
    public double getPerimeter(){
        return 2*PI*this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", PI=" + PI + '}';
    }
    
    
    
    
}
