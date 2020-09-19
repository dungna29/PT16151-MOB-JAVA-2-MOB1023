/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi1_MVC;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LegendNguyen
 */
public class QLGV implements IQLGV {

    List<GiaoVien> lstGiaoVien = new ArrayList<>();//Biến toàn cục

    @Override
    public boolean taoGvAo() {
        GiaoVien gv = new GiaoVien(1, "Dũng", "Dungna", 32, "HN", "091222222");
        GiaoVien gv1 = new GiaoVien(2, "Dũng", "Dungna2", 32, "HN", "091222222");
        GiaoVien gv2 = new GiaoVien(3, "Dũng", "Dungna3", 32, "HN", "091222222");
        lstGiaoVien.add(gv);
        lstGiaoVien.add(gv1);
        lstGiaoVien.add(gv2);
        return true;
    }
    @Override
    public boolean themMoiGV() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean xoaGVTheoMa(String magv) {
        if (getIndexGV(magv) == -1) {
            return false;
        }else{
            lstGiaoVien.remove(getIndexGV(magv));
            return true;            
        }
    }
    @Override
    public List<GiaoVien> xuatDsGv() {
      return lstGiaoVien;
    }     
    //Hàm này là hàm động dùng để lấy vị trí của đối tượng trong danh sách
    int getIndexGV(String mgv){
        for (int i = 0; i < lstGiaoVien.size(); i++) {
            if (lstGiaoVien.get(i).getMagv().equalsIgnoreCase(mgv)) {
                return i;
            }
        }
        return -1;
    }

}
