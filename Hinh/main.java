/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hinh;

/**
 *
 * @author 84974
 */
public class main {
    public static void main(String[] args) {
        HinhTron h1 = new HinhTron(4);
        System.out.println("Dien tich = " + h1.tinhDienTich(h1.getR(),h1.getPI()));
        HinhVuong c = new HinhVuong(5);
        System.out.println("Dien tich =" + c.tinhDienTich(c.getCanh()));
    }
}
