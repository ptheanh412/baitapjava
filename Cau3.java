/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cau3;


// Trong biểu đồ có 3 quan hệ thừa kế is-a. Vì thuộc tính Circle khác Retangle 
public class Cau3 {

    public static void main(String[] args) {
        //Circle
        Circle c = new Circle(5.5);
        System.out.println("MU is " + c.getColor());
        System.out.println("Dien tich: " + c.getArea());
        //Square
        Square s = new Square();
        s.setLength(2);
        s.setWidth(3);
        System.out.println(s.getSide());
        //Rectangle
        Rectangle r = new Rectangle(3,4);
        Rectangle r1 = new Rectangle("blue",true,3,4);
        System.out.println("Dien tich: " + r.getArea());
        System.out.println( r1.isFilled());
    }
}
