/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hinh;

/**
 *
 * @author 84974
 */
public class HinhVuong {
    private double canh;

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }
    
    
    public double tinhDienTich (double canh){
        return this.canh * this.canh;
    }
    public double tinhChuVi (double canh){
        return this.canh * 4 ;
    }
}
