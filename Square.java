/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cau3;

/**
 *
 * @author 84974
 */
public class Square extends Rectangle {
    private double side;
    
    public Square() {
    }
    
    public Square(String color, boolean filled, double side) {
        //super(color, filled);
        this.side = side;
        
    }
    
    public Square(double side){
        
    }

    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }
    @Override
    public void setWidth(double side){
        this.side = side;
    }
    @Override
    public void setLength(double side){
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }
    
    
}
