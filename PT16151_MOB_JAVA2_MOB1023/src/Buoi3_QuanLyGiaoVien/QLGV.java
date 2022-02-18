/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3_QuanLyGiaoVien;

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

    //Hàm này dùng để tạo tên các cột trên giao diện
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

    //Hàm này dùng để tạo ra danh sách năm sinh
    public int[] getNamSinh() {
        int[] arrNamsinh = new int[2020 - 1900];
        for (int i = 0; i < arrNamsinh.length; i++) {
            arrNamsinh[i] = 1900 + i;//Gán dữ liệu cho năm sinh
        }
        return arrNamsinh;//Trả về một mảng kiểu số nguyên
    }

    public boolean addGiaoVien(GiaoVien giaoVien) {
        if (giaoVien != null) {
            lstGiaoVien.add(giaoVien);
            return true;
        }
        return false;
    }

    public int indexGV(String maGV) {
       for (int i = 0; i < lstGiaoVien.size(); i++) {
            if (lstGiaoVien.get(i).getMagv().equalsIgnoreCase(maGV)) {
                return i;
            }
        }
        return -1;
    }

}
