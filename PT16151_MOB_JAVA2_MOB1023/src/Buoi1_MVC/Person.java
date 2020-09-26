/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi1_MVC;

/**
 *
 * @author LegendNguyen
 */
public class Person {

    private String diachi;
    private String sdt;

    public Person() {
    }

    public Person(String diachi, String sdt) {
        this.diachi = diachi;
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    void xuatLopCha() {
        System.out.printf("Địa Chỉ : %s - SĐT: %s", diachi,sdt);

    }

   
    
}
