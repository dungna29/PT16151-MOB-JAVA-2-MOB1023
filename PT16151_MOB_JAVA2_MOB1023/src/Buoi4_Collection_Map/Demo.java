/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4_Collection_Map;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author LegendNguyen
 */
public class Demo {

    public static void main(String[] args) {
        String[] arrString = {"Duy Anh", "My MY", "Sy Phong"};
        //Cần khai báo thêm một list tạm
        List<String> lstArrStringTemp = Arrays.asList(arrString);//List phụ
        List<String> lstStringName = new ArrayList<String>();//List chính
        lstStringName.add("Dũng"); //Thêm
        lstStringName.set(0, "Nam");//Sửa
        lstStringName.get(0);//Lấy ra
        lstStringName.remove(0);//Xóa theo index  
        boolean kiemtradanhsach = lstStringName.isEmpty();//true là không có phần tử nào
        if (lstStringName.size()==0) {
            //Chỉ ra danh sách rỗng
        }
        // Nhóm 1: Nam - My - Phong
        // Nhóm 2: Nam - My - Phong - Dũng
        // Nhóm 3: Nam - Phong - Dũng
        for (String x : addAllList(lstStringName, lstArrStringTemp)) {
            System.out.println(x);
        }
    }

    static List<String> addAllList(List<String> lstGoc, List<String> lstThem) {
        for (int i = 0; i < lstThem.size(); i++) {
            lstGoc.add(lstThem.get(i));
        }
        return lstGoc;
    }

}
