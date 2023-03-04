/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lavb4trenlop;

/**
 *
 * @author 84974
 */
public class Lavb4trenlop {

    public static void main(String[] args) {
        HinhTru t = new HinhTru();
        t.nhapChieuCao();
        HinhTron c = new HinhTron();
        c.nhapBanKinh();
        c.tinhChuVi(); 
        c.inChuVi();
        c.tinhDientich();
        c.inDienTich();
        t.nhapBanKinh();
        t.tinhDientich();
        t.tinhTheTich();
        t.inTheTich();
        HinhChuNhat b = new HinhChuNhat();
        b.nhapChieuDai();
        b.nhapChieuRong();
        b.tinhChuVi();
        b.tinhDientich();
        b.inChuVi();
        b.inDienTich();
        b.inTheTich();
        HinhVuong v = new HinhVuong();
        v.nhapCanh();
        
    }
}
