/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author 84974
 */
public class HoaQua {
    private String nguonGoc;
    private double soLuong;
    private double giaBan;

    public HoaQua(String nguonGoc, double soLuong, double giaBan) {
        this.nguonGoc = nguonGoc;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
    }
    
    public HoaQua(){
        
    }
    
    

    public String getNguonGoc() {
        return nguonGoc;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
    public double thanhToan(){
        return this.giaBan * this.soLuong;
    }
    
    
}
