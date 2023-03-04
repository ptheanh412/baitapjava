/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lavb4trenlop;

/**
 *
 * @author 84974
 */

import java.util.Scanner; 


public class HinhVuong extends HinhChuNhat {
    public HinhVuong(){
        
    }
     public void nhapCanh(){
         Scanner sc = new Scanner (System.in);
         System.out.println("Nhap canh: ");
         dai = rong = sc.nextFloat();
     }
    
}
