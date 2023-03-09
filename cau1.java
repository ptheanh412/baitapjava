/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author 84974
 */
public class cau1 {

    public static void main(String[] args) {
        QuaCam c1 = new QuaCam();
        c1.setGiaBan(10);
        c1.setSoLuong(2);
        System.out.println("gia:" + c1.thanhToan());
        QuaTao t = new QuaTao();
        t.setNguonGoc("Nam Dinh");
        System.out.println("Nguon goc: " + t.getNguonGoc());
    }
}
