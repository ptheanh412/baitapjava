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


public class HinhChuNhat extends HinhHoc {
    public float dai;
    public float rong;
    
    public HinhChuNhat(){
        
    }
    
    public void nhapChieuDai(){
        System.out.println("Nhap chieu dai: ");
        Scanner sc = new Scanner(System.in);
        dai = sc.nextFloat();
    }
    
    public void nhapChieuRong(){
        System.out.println("Nhap chieu rong: ");
        Scanner sc = new Scanner(System.in);
        rong = sc.nextFloat();
    }
    
    public void tinhChuVi(){
        chuVi = (dai + rong) * 2;
   
    }
    public void tinhDientich(){
        dienTich = dai* rong;
    }
    
}
