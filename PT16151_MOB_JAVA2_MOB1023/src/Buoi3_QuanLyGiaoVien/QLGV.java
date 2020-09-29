/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3_QuanLyGiaoVien;

import Buoi1_MVC.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LegendNguyen
 */
public class QLGV {

    private List<GiaoVien> lstGiaoVien = new ArrayList<>();//Biến toàn cục

    public QLGV() {
        GiaoVien gv = new GiaoVien("Dungna", 1, "Dũng", 32, 1, "0865880779");
        GiaoVien gv1 = new GiaoVien("Minhdq", 2, "Minh", 32, 1, "0865880779");
        GiaoVien gv2 = new GiaoVien("Thientt", 3, "Thiện", 29, 1, "0865880779");
        GiaoVien gv3 = new GiaoVien("Loantt", 4, "Loan", 45, 0, "0865880779");
        GiaoVien gv4 = new GiaoVien("Quangck", 5, "Quang", 35, 1, "0865880779");
        GiaoVien gv5 = new GiaoVien("Datlt", 6, "Đạt", 32, 1, "0865880779");
        lstGiaoVien.add(gv);
        lstGiaoVien.add(gv1);
        lstGiaoVien.add(gv2);
        lstGiaoVien.add(gv3);
        lstGiaoVien.add(gv4);
        lstGiaoVien.add(gv5);
    }

    public List<GiaoVien> getlstGiaoVien() {
        return lstGiaoVien;
    }

    public List<String> getColumname() {
        List<String> lstcl = new ArrayList<>();
        lstcl.add("Số TT");
        lstcl.add("Mã");
        lstcl.add("Tên");
        lstcl.add("Tuổi");
        lstcl.add("Giới tính");
        lstcl.add("Điện thoại");
        return lstcl;
    }

}
