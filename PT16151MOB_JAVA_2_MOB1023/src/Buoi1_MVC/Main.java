/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi1_MVC;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LegendNguyen
 */
public class Main {

    public static void main(String[] args) {
        IQLGV iqlgv = new QLGV();
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        int input;
        char c = sc.next().charAt(0);
        do {
            main.Menu();
            System.out.print("Mời bạn chọn chức năng: ");
            input = Integer.parseInt(sc.nextLine());
            switch (input) {
                case 1:
                    if (iqlgv.taoGvAo()) {
                        System.out.println("Tạo 3 giáo viên ảo thành công");
                    }else{
                         System.out.println("Tạo 3 giáo viên ảo không thành công");
                    }
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Mời bạn nhập mã giáo viên: ");
                    iqlgv.xoaGVTheoMa(sc.nextLine());
                    break;
                case 4:
                    //iqlgv.xuatDsGv() cả cái cụm này tương ứng 1 danh sách giáo viên                  
                    for (GiaoVien x : iqlgv.xuatDsGv()) {
                        x.xuatLopCha();
                    }
                    break;
                default:
                    System.out.println("Bạn chọn chức năng không tồn tại");
                    System.exit(0);
            }

        } while (true);

    }

    void Menu() {
        System.out.println(" ======================Quản Lý Giáo Viên============");
        System.out.println("|-----------------------------------------------------------|");
        System.out.println("| 1. Tạo 3 GV ảo                                    |");
        System.out.println("| 2. Thêm mới GV                                    |");
        System.out.println("| 3. Xóa GV theo mã                                 |");
        System.out.println("| 4. Xuất DS GV                                     |");
        System.out.println("------------------------------------------------------------|");
    }
}
