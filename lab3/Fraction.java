/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

/**
 *
 * @author 84974
 */
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    
    public Fraction (Fraction f){
        this.numerator = f.getNumerator();
        this.denominator = f.getDenominator();
    }
    public Fraction add (Fraction f){
       int newNumerator = this.numerator * f.denominator + f.numerator * this.denominator ;
       int newDenominator = this.denominator * this.denominator;
       return new Fraction(newNumerator, newDenominator);
    }
    public Fraction sub (Fraction f){
       int newNumerator = this.numerator * f.denominator - f.numerator * this.denominator ;
       int newDenominator = this.denominator * this.denominator;
       return new Fraction(newNumerator, newDenominator);
    }
    public Fraction mul (Fraction f){
       int newNumerator = this.numerator * f.numerator ;
       int newDenominator = this.denominator * this.denominator;
       return new Fraction(newNumerator, newDenominator);
    }
    public Fraction div (Fraction f){
       int newNumerator = this.numerator * f.denominator ;
       int newDenominator = this.denominator * f.numerator;
       return new Fraction(newNumerator, newDenominator);
    }  
    public void reducer (){
        int ucLn = timUcLn (numerator, denominator);
        numerator /= ucLn;
        denominator /= ucLn;}
    private int timUcLn (int x, int y){
            if (y==0){
                return x;
            }else{
                return timUcLn(y, x %y);
            }
        }
                
    
    

    @Override
    public String toString(){
        return "Fraction{" + "numerator=" + numerator + ", denominator=" + denominator + '}';
    }
    
}
