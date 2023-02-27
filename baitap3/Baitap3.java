/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baitap3;

/**
 *
 * @author 84974
 */
public class Baitap3 {

    public static void main(String[] args) {
        NhanVien nv = new NhanVien ("The Anh", 3000000, 2, 10000000);
        nv.inTTin();
        System.out.println(nv.tangLuong(6));
        System.out.println(nv.tinhLuong());
    }
}
