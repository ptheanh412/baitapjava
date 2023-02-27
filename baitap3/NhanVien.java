/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap3;

/**
 *
 * @author 84974
 */
public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    private double LUONG_MAX;

    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong, double LUONG_MAX) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.LUONG_MAX = LUONG_MAX;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public void setLUONG_MAX(double LUONG_MAX) {
        this.LUONG_MAX = LUONG_MAX;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public double getLUONG_MAX() {
        return LUONG_MAX;
    }
    
    public void inTTin (){
        System.out.println("Ten: " + tenNhanVien + "\nLuong CB: " + luongCoBan + "\nHe so luong: " + heSoLuong + "\nLuong max: " + LUONG_MAX );
    }
    public double tinhLuong (){
        return this.luongCoBan * this.heSoLuong;
        
    }
    public boolean tangLuong(double b){
        setHeSoLuong(b);
        if (tinhLuong() > this.LUONG_MAX){
            return false;
        }else {
        return true;
        }

    }
}
