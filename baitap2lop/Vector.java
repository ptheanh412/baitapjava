/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap2lop;

/**
 *
 * @author 84974
 */
public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
    public Vector(Vector a) {
        this.x = a.x;
        this.y = a.y;
        this.z = a.z;
    }
    public Vector add(Vector a){
        double newX = this.x + a.x;
        double newY = this.y + a.y;
        double newZ = this.z + a.z;
      
        
        return new Vector (newX, newY, newZ);

    }
    public Vector sub(Vector a){
        double newX = this.x - a.x;
        double newY = this.y - a.y;
        double newZ = this.z - a.z;
      
        
        return new Vector (newX, newY, newZ);

    }
    public Vector sub(double a){
        double newX = this.x * a;
        double newY = this.y * a;
        double newZ = this.z * a;
      
        
        return new Vector (newX, newY, newZ);
    
    }
        public double nhanVoHuong(Vector a){
      

        return this.x*a.x + this.y*a.y + this.z * a.z ;
        }

    @Override
    public String toString() {
        return "Vector{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }
        
         
}
