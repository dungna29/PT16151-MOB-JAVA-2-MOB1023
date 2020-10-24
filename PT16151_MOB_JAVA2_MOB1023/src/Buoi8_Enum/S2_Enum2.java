/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi8_Enum;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S2_Enum2 {

    enum CacLoaiPhuongTien {
        // Khởi tạo các phần tử từ construnctor
        // Các phần tử này luôn là static final
        CAR(1), TRUCK(2), AIRPLANE(3), TRAIN(8), BOAT(9), BIKE(10);

        private int value;

        // constructor này chỉ dùng trong nội bộ Enum
        // Modifier của constructor enum luôn là private
        // Nếu không khai báo private, java cũng sẽ hiểu là private.
        CacLoaiPhuongTien(int value) {
            this.value = value;
        }

        // Có thể viết một static method lấy ra WeekDay theo value.
        public static CacLoaiPhuongTien getWeekDayByValue(int value) {
            for (CacLoaiPhuongTien d : CacLoaiPhuongTien.values()) {
                if (d.value == value) {
                    return d;
                }
            }
            return null;
        }
    }

    enum PhuongTienDuongBo {

    }

    public static void main(String[] args) {
        for (CacLoaiPhuongTien d : CacLoaiPhuongTien.values()) {
            System.out.println(d + " = " + d.value);
        }

        // Sử dụng static method của enum
        CacLoaiPhuongTien d = CacLoaiPhuongTien.getWeekDayByValue(3);
        System.out.println("giá trị của 3 là " + d);

        CacLoaiPhuongTien cacLoaiPhuongTien;
        cacLoaiPhuongTien = CacLoaiPhuongTien.BIKE;//Phép gán      
        for (CacLoaiPhuongTien x : CacLoaiPhuongTien.values()) {
            System.out.println(x);
        }
        //PhuongTienDuongBo duongBo;
        //duongBo = CacLoaiPhuongTien.BIKE;//Phép gán lỗi    

    }
}
