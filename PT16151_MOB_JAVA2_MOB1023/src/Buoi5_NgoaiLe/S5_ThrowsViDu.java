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
public class S5_ThrowsViDu {
    //A) Trong trường hợp bạn khai báo throws ngoại lệ, 
    //nếu ngoại lệ không xảy ra, code sẽ được thực hiện tốt.
    
//    void method() throws IOException {
//        System.out.println("device operation performed");  
//    }
// 
//    public static void main(String args[]) throws IOException {
//        S5_ThrowsViDu obj = new S5_ThrowsViDu();
//        obj.method();
//        System.out.println("Chạy đến hết hàm");
//    }
    
//    //B) Trong trường hợp bạn khai báo throws ngoại lệ, nếu ngoại lệ xảy ra, 
//    // một ngoại lệ sẽ được ném ra tại runtime vì throws nên không xử lý ngoại đó.
//    
    void method() throws IOException {
        throw new IOException("Mời bạn nhập vào");
    }
 
    public static void main(String args[]) throws IOException {
        S5_ThrowsViDu obj = new S5_ThrowsViDu();
        obj.method();
        System.out.println("normal flow...");
    }
}
