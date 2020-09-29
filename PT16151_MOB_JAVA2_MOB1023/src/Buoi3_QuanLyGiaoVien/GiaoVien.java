/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3_QuanLyGiaoVien;

import Buoi1_MVC.*;

/**
 *
 * @author LegendNguyen
 */
public class GiaoVien extends Person {

    private String magv;

    public GiaoVien() {

    }

    public GiaoVien(String magv, int id, String tengv, int tuoi, int gioiTinh, String sdt) {
        super(id, tengv, tuoi, gioiTinh, sdt);
        this.magv = magv;
    }

    public String getMagv() {
        return magv;
    }

    public void setMagv(String magv) {
        this.magv = magv;
    }

}
