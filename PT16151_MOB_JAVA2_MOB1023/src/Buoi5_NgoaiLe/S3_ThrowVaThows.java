/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5_NgoaiLe;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S3_ThrowVaThows {

    public static void main(String[] args) {
        /*
        Từ khoá throw trong java được sử dụng để ném ra một ngoại lệ (exception) cụ thể.        
        throw được sử dụng để phát sinh một ngoại lệ
        throw new RuntimeException(“Lỗi”);
        
        throws được sử dụng để quăng ngoại lệ ra ngoài
        phương thức. Ngoại lệ sẽ được xử lý khi gọi phương thức
        ❖void method() throws FileNotFoundException{…}
        
        Từ khóa throws trong java được sử dụng để khai báo một ngoại lệ. 
        Nó thể hiện thông tin cho lập trình viên rằng có thể xảy ra một ngoại lệ, 
        vì vậy nó là tốt hơn cho các lập trình viên để cung cấp các mã xử lý ngoại lệ để duy trì luồng 
        bình thường của chương trình.

         */
        KiemTraTuoi(19);//Ném ra 1 ngoại lệ ArithmeticException nếu không thỏa mãn
        
        
   
        
            S3_ThrowVaThows obj = new S3_ThrowVaThows();
            //obj.method();
        
 
        System.out.println("normal flow...");
    }

    static void KiemTraTuoi(int age) {
        if (age < 18) {
            throw new ArithmeticException("Chưa đủ tuổi làm CMND");
        } else {
            System.out.println("Đã đủ tuổi làm CMND");
        }
    }

    void method() throws IOException {
        throw new IOException("device error");
    }

}
