/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi1_MVC;

import java.util.List;

/**
 *
 * @author LegendNguyen
 */
public interface IQLGV {
    
    // Chức năng tạo 3 giáo viên ảo
    boolean taoGvAo();
    // Chức năng thêm mới giáo viên
    boolean themMoiGV();
    // Xóa giáo viên theo mã
    boolean xoaGVTheoMa(String magv);
    // Chức năng 4 xuất ds giáo viên
    List<GiaoVien> xuatDsGv();
}   
