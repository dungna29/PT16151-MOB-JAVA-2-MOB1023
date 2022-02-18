/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5_NgoaiLe;

import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S1_Exception {

    public static void main(String[] args) {
        /*
        Exception là một sự kiện xảy ra trong quá trình thực thi một chương trình Java, 
        nó làm phá vỡ cái flow (luồng xử lý) bình thường của một chương trình, thậm chí chết chương trình.
        
        Một ngoại lệ có thể xảy ra với nhiều lý do khác nhau, nó nằm ngoài dự tính của chương trình.
        Một vài ngoại lệ xảy ra bởi lỗi của người dùng, 
        một số khác bởi lỗi của lập trình viên và số khác nữa đến từ lỗi của nguồn dữ liệu vật lý. 
        Chẳng hạn như:
            Người dùng nhập dữ liệu không hợp lệ.
            Truy cập ngoài chỉ số mảng.
            Một file cần được mở nhưng không thể tìm thấy.
            .......
        
        Phân cấp của Exception trong java.
            + Class ở mức cao nhất là Throwable
            + Hai class con trực tiếp là Error và Exception.
         */
        //Exception1();
        //Exception2();
        //TryCatchCoNhieuCatch();

        /*
        Exception
        Trong Java có 2 loại exception: checked và unchecked. 
        Tất cả các checked exception được kế thừa từ lớp Exception ngoại trừ lớp RuntimeException. 
        RuntimeException là lớp cơ sở của tất cả các lớp unchecked exception.
        Đó cũng là dấu hiệu để nhận biết đâu là checked exception và đâu là unchecked exception.
        
        ❑Ngoại lệ ‘unchecked’:
        ❖Là các ngoại lệ được kiểm tra lúc chạy
        ❖Bao gồm các class Error, RuntimeException và các lớp con của chúng
        ❖Ví dụ: Integer.parseInt(“abc”) vẫn dịch được nhưng chạy lỗi.
        ❑Ngoại lệ ‘checked’:
        ❖Là các ngoại lệ được kiểm tra lúc dịch
        ❖Bao gồm các class exception còn lại
        ❖Ví dụ: new FileWriter(“c:/data.txt”) dịch lỗi dù file đã tồn tại
         */
        TryCatchCoNhieuCatch();
    }

    static void Exception1() {
        //Chương trình chia 2 số mà mẫu số bằng 0 cũng gây ra lỗi
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        int zero = 0;
        int average = 10 / zero;
        System.out.println("Average = " + average);
    }

    static void Exception2() {
        try {
            int a = Integer.parseInt("Dũng");
            System.out.println(a);
        } catch (NumberFormatException numberFormatException) {
           
        }
    }

    static void UnCheckedExceptions() {
        /*Là loại exception xảy ra tại thời điểm thực thi chương trình, 
        nó cũng có thể gọi là runtime exceptions đó là programming bugs, 
        lỗi logic của chương trình… 
        Loại exception này được bỏ qua trong quá trình compile,
        không bắt buộc ta phải handle nó.
        Ví dụ: NullPointerException, NumberFormatException, ArrayIndexOutOfBoundsException, DivideByZeroException
         */
        String temp = null;
        System.out.println(temp.length());

        //một biến có giá trị null, thực hiện bất kỳ hoạt động nào bởi biến đó sẽ xảy ra ngoại lệ NullPointerException.
    }

    static void CheckedExceptions() {
        /*Là loại exception xảy ra trong lúc compile time, 
        nó cũng có thể được gọi là compile time exceptions. 
        Loại exception này không thể bỏ qua được trong quá trình compile, 
        bắt buộc ta phải handle nó.
        Các lớp extends từ lớp Throwable ngoại trừ 
        RuntimeException và Error được gọi là checked exception.
        
        Ví dụ: IOException, FileNotFoundException, NoSuchFieldException,
         */
        //FileReader f = new FileReader("File Không Tồn Tại");
        //một biến có giá trị null, thực hiện bất kỳ hoạt động nào bởi biến đó sẽ xảy ra ngoại lệ NullPointerException.
    }

    static void ViDuException() {

        int a = 10 / 0; // ArithmeticException
        String obj = null;
        System.out.println(obj.length()); // NullPointerException
        String str = "abc";
        int num = Integer.parseInt(str); // NumberFormatException 
        int arr[] = new int[5];
        arr[5] = 50; // ArrayIndexOutOfBoundsException

        //Object dog = new Dog();
        //Rectangle rect = (Rectangle) dog;//ClassCastException
        /* Khi code 1 chương trình luôn phải lường trước mọi tình huống
        trong khả năng của người lập trình
         */
    }

    static void TryCatchCoNhieuCatch() {
        /* Khi code 1 chương trình luôn phải lường trước mọi tình huống trong khả năng của người lập trình
            ❑Giả sử có mảng chuỗi ss. Lệnh sau đây có thể xảy
            ra những lỗi nào?
            ❖Integer.parseInt(ss[5]);
            ❑Rõ ràng có khả năng xảy ra 3 lỗi
            ❖Mảng ss null (chưa được khởi tạo)
            ❖Mảng ss ít hơn 6 phần tử
            ❖Phần tử thứ 6 (ss[5]) không thể chuyển sang số
            ❑Xử lý các lỗi này thế nào?
         */
        String[] ss = {"1","a","2"};
        try {
            int a = Integer.parseInt(ss[4]);
        } catch (NumberFormatException e1) {
            System.out.println("Không đúng định dạng số");
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("Nằm ngoài phạm vi của mảng ");
        } catch (NullPointerException e3) {
            System.out.println("Mảng chưa được khởi tạo ");
        }
    }

    static void ChuyenDoiDinhDangNgay() {
        SimpleDateFormat formater = new SimpleDateFormat();
        String text = "22-11-2000";
        try {
            formater.applyPattern("dd-MM-yyyy");
            Date date = formater.parse(text);
            formater.applyPattern("EEEE, dd MMMM, yyyy");
            String text2 = formater.format(date);
            System.out.println(text2);
        } catch (ParseException ex) {
            Logger.getLogger(S1_Exception.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
