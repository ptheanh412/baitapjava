/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author 84974
 */
public class QuaCam extends HoaQua {
    private String color;
    
    public QuaCam(String nguonGoc, double soLuong, double giaBan, String color) {
        super(nguonGoc, soLuong, giaBan);
        this.color = color;
    }

    public QuaCam() {
    }
    
    
}
