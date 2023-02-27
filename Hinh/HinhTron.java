/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hinh;

/**
 *
 * @author 84974
 */
public class HinhTron {
    private double r;
    private double PI = 3.14;

    public HinhTron(double r) {
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double getPI() {
        return PI;
    }
    public double tinhDienTich(double r, double PI){
        return this.r*this.r*this.PI;
    }
    public double tinhChuVi(double r, double PI){
        return this.r*2*this.PI;
    }
   
    
    
}
