/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

/**
 *
 * @author 84974
 */
public class Lab3 {

    public static void main(String[] args) {
        Point2D p = new Point2D(2,3);
        System.out.println("x: "+ p.getX());
        System.out.println("y: "+ p.getY());
        Triangle tgiac = new Triangle(3,4);
        System.out.println("Chieu dai canh dai va chieu cao lan luot la " + tgiac.toString());
        Fraction f1 = new Fraction (6,3);
        Fraction f2 = new Fraction (f1);
        f1.reducer();
        System.out.println(f1.toString());

    

      
        
    }
}
