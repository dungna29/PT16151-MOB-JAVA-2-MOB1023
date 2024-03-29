/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi5_NgoaiLe;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S2_CuPhapVaCachSuDung {

    public static void main(String[] args) {
        /*
            ❑Mỗi khối try yêu cầu có ít nhất một khối catch
            hoặc/và duy nhất một khối finally.
            ❑Khối finally sẽ được thực hiện dù ngoại lệ có xuất
            hiện hay không.
        
            Các phương thức của lớp Exception
        STT	Phương thức và Miêu tả
        1 public String getMessage() Trả về một message cụ thể về exception đã xảy ra. Message này được khởi tạo bởi phương thức contructor của Throwable
        2 public Throwable getCause()Trả về nguyên nhân xảy ra exception biểu diễn bởi đối tượng Throwable
        3 public String toString()Trả về tên của lớp và kết hợp với kết quả từ phương thức getMessage()
        4 public void printStackTrace()In ra kết quả của phương thức toString cùng với stack trace đến System.err
        5 public StackTraceElement [] getStackTrace() Trả về một mảng chứa mỗi phần tử trên stack trace. Phần tử tại chỉ mục 0 biểu diễn phần trên cùng của Call Stack, và phần tử cuối cùng trong mảng biểu diễn phương thức tại dưới cùng của Call Stack
        6 public Throwable fillInStackTrace() Fills the stack trace of this Throwable object with the current stack trace, adding to any previous information in the stack trace.
         */

        //CuPhapTryCatch();
        CuPhapTryCatchFinally();
    }

    static void CuPhapTryCatch() {
//        try {
//            // code có thể ném ra ngoại lệ
//        } catch (Exception_class_Name ex) {
//            // code xử lý ngoại lệ
//        }
        try {
            int zero = 0;
            int average = 10 / zero;
            System.out.println("Average = " + average);
        } catch (ArithmeticException ex) {
            System.out.println("Thông báo lỗi" + ex);
        }
        System.out.println("Kết Thúc Hàm!");
    }

    static void CuPhapTryFinally() {
        //try {
        //// code có thể ném ra ngoại lệ
        //} finally {
        //// code trong khối này luôn được thực thi
        //}
        try {
            int res = 10 / 2;
            System.out.println("10/2 = " + res);
        } finally {
            System.out.println("Khối lệnh finally luôn được thực thi");
        }

        System.out.println("Kết Thúc Hàm!");
    }

    static void CuPhapTryCatchFinally() {
        //       try {
        //    // code có thể ném ra ngoại lệ
        //} catch(Exception_class_Name_1 ex) {
        //    // code xử lý ngoại lệ 1
        //} catch(Exception_class_Name_2 ex) {
        //    // code xử lý ngoại lệ 2
        //} catch(Exception_class_Name_n ex) {
        //    // code xử lý ngoại lệ n
        //} finally {
        //    // code trong khối này luôn được thực thi
        //}
        try {
            int arr[] = new int[5];
            arr[5] = 4;
            System.out.println("arr[5] = " + arr[5]);
        } catch (NullPointerException ex) {
            System.out.println(ex);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
        } finally {
            System.out.println("Khối lệnh finally luôn được thực thi");
        }
        System.out.println("Kết Thúc Hàm!");
    }

    static void LuuYKhiSuDung() {
        /*
        Tại một thời điểm chỉ xảy ra một ngoại lệ và tại một thời điểm chỉ có một khối catch được thực thi. Khi exception đã bị bắt ở một catch thì các catch tiếp theo sẽ không được bắt.        
        Tất cả các khối catch phải được sắp xếp từ cụ thể nhất đến chung nhất (từ exception con đến exception cha), tức là phải khai báo khối lệnh catch để xử lý lỗi NullPointerException, ArithmeticException, … trước khi khai báo catch để xử lý lỗi Exception.        
        Khối lệnh finally luôn được thực thi dù chương trình có xảy ra ngoại lệ hay không (ngay cả sử dụng lệnh return).        
        Đối với mỗi khối try, có thể không có hoặc nhiều khối catch, nhưng chỉ có một khối finally.
        Khối finally sẽ không được thực thi nếu chương trình bị thoát bằng cách gọi System.exit() 
        hoặc xảy ra một lỗi (Error) không thể tránh khiến chương trình bị chết.
        */
//        try {
//            int arr[] = new int[5];
//            arr[5] = 4;
//            System.out.println("arr[5] = " + arr[5]);
//        } catch (ArrayIndexOutOfBoundsException ex) {
//            System.out.println(ex);
//            System.exit(0); // Khối finally sẽ không được thực thi
//        } finally {
//            System.out.println("Khối lệnh finally luôn được thực thi");
//        }
        
//        try {
//            int arr[] = new int[5];
//            arr[5] = 4;
//            System.out.println("arr[5] = " + arr[5]);
//            return 1;
//        } catch (ArrayIndexOutOfBoundsException ex) {
//            System.out.println(ex);
//            return 0; // Return kết quả nhưng vẫn thực thi khối finally
//        } finally {
//            System.out.println("Khối lệnh finally luôn được thực thi");
//        }
 
        System.out.println("kết Thúc Hàm!");

    }

}
