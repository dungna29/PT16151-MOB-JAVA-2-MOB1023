/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4_Collection_Map;

/**
 *
 * @author LegendNguyen
 */
//Tạo ra 1 đối tượng có tên Person2
/**
 * Ngoài ra đối tượng là một tập hợp các đối tượng bao gồm các đối tượng có cùng
 * thuộc tính Lập trình hướng đối tượng là hành động đưa các đối tượng có trong
 * thế giới thực:Sinh Viên, Giáo Viên, Con Người, Trường học........ để có thể
 * thao tác được với đối tượng đấy: Thêm, Sửa, Xóa... với đối tượng đấy Ngoài ra
 * các bạn có thể tương tác được với các thuộc tính và hành vi của đối tượng
 * đấy: Thêm Sửa Xóa.....
 */
public class Person2 {//Tên Class bắt buộc phải viết Camel Case Person, Student

    // Phần 1: Khai báo các thuộc tính của đối tượng đấy
    // Access Modifier sẽ phụ thuộc vào dự án
    private String ten;
    private long namsinh;
    private String diachi;
    private String sdt;
    private float diem;
    private long tuoi;

    //Phần 2: Khai báo contructor - Khi còn đi học thì chỉ cần khai báo 2 con tructor
    public Person2() {       
    }

    //Contructor có tham số dùng để gán giá trị cho các thuộc thính của đối tượng
    //Ghi nhớ phải truyền giá trị vào đúng vị trí của tham số
    public Person2(String ten, long namsinh, String diachi, String sdt, float diem, long tuoi) {
        this.ten = ten;
        this.namsinh = namsinh;
        this.diachi = diachi;
        this.sdt = sdt;
        this.diem = diem;
        this.tuoi = tuoi;
    }
    //Phần 3: Getter và Setter
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public long getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(long namsinh) {
        this.namsinh = namsinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public long getTuoi() {
        return 2020 - namsinh;
    }
    
    //Phần 4: Là nơi các bạn có thể triển khai các hàm
    //Các hàm sẽ phụ thuộc vào bài toán đưa ra và sẽ không code 
    //thêm sửa xóa... các đối tượng ở đây
    
    
   
    

}
