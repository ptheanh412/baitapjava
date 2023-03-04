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

public class HinhTru extends HinhTron {
    public float chieuCao;
    
    public HinhTru(){
        
    }
    
    public void nhapChieuCao(){
        System.out.println("Nhap chieu cao: ");
        Scanner sc = new Scanner (System.in);
        chieuCao = sc.nextFloat();
    }
    
    public void tinhTheTich(){
        theTich = chieuCao * dienTich;
    }
    
}
