/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4;

/**
 *
 * @author 84974
 */
public class Lab4 {

    public static void main(String[] args) {
        Circle c = new Circle (3.5,"red");
        System.out.println("Dien tich: " + c.getArea() +" " + "Color: " + c.getColor());
        Cylinder h = new Cylinder(3.5,"blue",6);
        System.out.println("The tich: " + h.getVolume());
    }
}
