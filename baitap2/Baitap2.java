/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baitap2;

/**
 *
 * @author 84974
 */
public class Baitap2 {

    public static void main(String[] args) {
        Student sv = new Student("001", "The Anh","CNTT2");
        System.out.println(sv.toString());
        Book bo = new Book ("a1","Hoc lap trinh","The anh");
        System.out.println(bo.getBoTitle());
        
        
    }
}
