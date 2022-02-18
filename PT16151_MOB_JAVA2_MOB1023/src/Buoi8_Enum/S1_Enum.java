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
//Khai báo bên ngoài 1 lớp thì sẽ không được khai báo access modifier
//enum NgayTrongTuan1 {
//    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
//}

public class S1_Enum {
   enum NgayTrongTuan1 {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    public static void main(String[] args) {
        //enum là một từ khóa trong Java, là một kiểu dữ liệu đặc biệt 
        //được sử dụng để đại diện cho hằng số cố định.
        //Một enum có thể chứa các trường, phương thức và constructor.
        //Bởi vì các giá trị của Enum là các hằng số, nên tên của các trường 
        //kiểu enum thường là các chữ cái hoa.
        //Trong ngôn ngữ lập trình Java, bạn xác định một kiểu enum bằng cách sử dụng từ khóa enum. 
        //Enum có thể implement một Interface

        //Đây là cách in ra màn hình giá trị
        //Chú ý phải chấm Values ở cuối trong vòng lặp
        for (NgayTrongTuan1 x : NgayTrongTuan1.values()) {
            System.out.println(x);
        }
        System.out.println("----------------");
        
        
        //Lấy 1 giá trị trong Enum thì gọi đến tên ENUM và chấm giá trị
        //Đang gọi đến Enum là file riêng
        NgayTrongTuan ngayTrongTuan = NgayTrongTuan.MONDAY;
        System.out.println(ngayTrongTuan);
        
        
        //Sử dụng so sánh với Enum
        NgayTrongTuan1 today = NgayTrongTuan1.WEDNESDAY;
        // Sử dụng equal() method
        if (today.equals(NgayTrongTuan1.SUNDAY)) {
            System.out.println("Hôm nay là ngày nghỉ  cuối tuần");
        } else {
            System.out.println("Hôm nay là ngày đi học");
        }
        
        //Đối với Emnum có thể sử dụng toán tử == để so sánh thay cho equals
        // Sử dụng == toán tử
        if (today == NgayTrongTuan1.SUNDAY) {
            System.out.println("Hôm nay là ngày nghỉ  cuối tuần");
        } else {
            System.out.println("Hôm nay là ngày đi giảng dậy");
        }

    }

}
