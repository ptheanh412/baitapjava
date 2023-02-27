/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap2;

/**
 *
 * @author 84974
 */
public class Book {
    private String boCode;
    private String boTitle;
    private String boAuthor;
    public Book(){
        this.boCode = null;
        this.boTitle = null;
        this.boAuthor = null;
    
    }

    public Book(String boCode, String boTitle, String boAuthor) {
        this.boCode = boCode;
        this.boTitle = boTitle;
        this.boAuthor = boAuthor;
    }
    public Book(Book bo ) {
        this.boCode = bo.boCode;
        this.boTitle = bo.boTitle;
        this.boAuthor = bo.boAuthor;
    }

    public String getBoCode() {
        return boCode;
    }

    public String getBoTitle() {
        return boTitle;
    }

    public String getBoAuthor() {
        return boAuthor;
    }
    
}
