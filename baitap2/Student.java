/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap2;

/**
 *
 * @author 84974
 */
public class Student {
    private String stID;
    private String stName;
    private String stClass;
    
    public Student(){
        this.stID = null;
        this.stName = null;
        this.stClass = null;
    }

    public Student(String stID, String stName, String stClass) {
        this.stID = stID;
        this.stName = stName;
        this.stClass = stClass;
    }
    public Student(Student st) {
        this.stID = st.stID;
        this.stName = st.stName;
        this.stClass = st.stClass;
   }

    public String getStID() {
        return stID;
    }

    public String getStName() {
        return stName;
    }

    public String getStClass() {
        return stClass;
    }

    public void setStID(String stID) {
        this.stID = stID;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public void setStClass(String stClass) {
        this.stClass = stClass;
    }

    @Override
    public String toString() {
        return "Student{" + "stID=" + stID + ", stName=" + stName + ", stClass=" + stClass + '}';
    }


    
}

