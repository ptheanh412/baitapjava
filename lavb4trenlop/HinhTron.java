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
public class HinhTron extends HinhHoc{
    public float banKinh;
    
    public HinhTron(){
       
    }

    public void nhapBanKinh(){
        System.out.println("Nhap ban kinh: ");
        Scanner sc = new Scanner (System.in);
        banKinh = sc.nextFloat();
    }
    public void tinhChuVi(){
        chuVi =  2*PI*this.banKinh ;
    }
    public void tinhDientich(){
        dienTich =PI*this.banKinh*this.banKinh ;
    }
    
}
