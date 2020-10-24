/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi9_GENERIC;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S1_Generic {
    /*
    Generics là một tính năng của Java giúp cho lập trình viên có thể chỉ định rõ kiểu dữ liệu 
    mà họ muốn làm việc với một class, một interface hay một phương thức nào đó.
    Đặt tên kiểu tham số là rất quan trọng để học Genericics. Nó không bắt buộc, 
    tuy nhiên chúng ta nên đặt theo quy ước chung để dễ đọc, dễ bảo trì. 
    Các kiểu tham số thông thường như sau:
   
    Một số quy ước đặt tên kiểu tham số Generic
    E- Element (phần tử – được sử dụng phổ biến trong Collection Framework)
    K – Key (khóa)
    V – Value (giá trị)
    N – Number (kiểu số: Integer, Double, Float, …)
    T – Type (Kiểu dữ liệu bất kỳ thuộc Wrapper class: String, Integer, Long, Float, …)
    S, U, V … – được sử dụng để đại diện cho các kiểu dữ liệu (Type) thứ 2, 3, 4, …
    */
    
    public static void main(String[] args) {       
        
        //Khi nào dùng thì bắt đầu định nghĩa nghĩa cho T là kiểu dữ liệu mình muốn
        Student<String> student = new Student<>();
        student.setT("Dung");
        System.out.println(student.getT());
        
        //Định nghĩa lại kiểu dữ liệu cho ClassGeneric
        //Không được sử dụng kiểu dữ liệu nguyên thủy
        Student<Double> studentdouble = new Student<>();
        studentdouble.setT(9.5);
        System.out.println(studentdouble.getT());
        
        Student<Integer> studentInt = new Student<>();
        studentInt.setT(9);
        System.out.println(studentInt.getT());
        
        //Kiểu không có định nghĩa kiểu cho ClassGeneric
        Student studentKhongKieu = new Student<>();
        studentKhongKieu.setT("Dung");
        System.out.println(studentKhongKieu.getT());
                
    }
}
