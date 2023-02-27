/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

/**
 *
 * @author 84974
 */
public class Triangle {
    private float width = 0.0f;
    private float hegth = 0.0f;
    
    public Triangle (float width, float hegth){
        this.width = width;
        this.hegth = hegth;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getWidth() {
        return width;
    }

    public void setHegth(float hegth) {
        this.hegth = hegth;
    }

    public float getHegth() {
        return hegth;
    }

    @Override
    public String toString() {
        return "{" + "width=" + width + ", hegth=" + hegth + '}';
    }

}
