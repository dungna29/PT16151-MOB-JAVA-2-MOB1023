/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5_NgoaiLe;

import java.io.IOException;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S4_Throws {

    public static void main(String[] args) {
        /*
          Lưu ý:
        Nếu bạn đang gọi một phương thức khai báo throws một ngoại lệ, bạn phải bắt hoặc throws ngoại lệ đó. 
        Có hai trường hợp:
        Trường hợp bắt ngoại lệ, tức là xử lý ngoại lệ bằng cách sử dụng try/catch.
        Trường hợp khai báo ném ngoại lệ, tức là sử dụng từ khóa throws với phương thức.
         */
        try {
            S4_Throws st = new S4_Throws();
            st.method();
        } catch (Exception e) {
             System.out.println("Xử lý ngoại lệ");
        }
         System.out.println("Chương trình vẫn chạy tiếp được");
    }

    void method() throws IOException {
        throw new IOException("device error");
    }

}
