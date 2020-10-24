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
public class MaiPair {

    public static void main(String[] args) {
        //khi sử dụng tạo từ điển có thể dùng cái này
        //Định nghĩa cho Key và Value có kiểu dữ liệu là gì
        Pair<String, String> pair = new Pair("dungna29", "Nguyễn Anh Dũng");
        System.out.println(pair.getKey() + " " + pair.getValue());
        
        Pair<String, String> pair2 = new Pair<>();
        pair2.setKey("cat");
        pair2.setValue("mèo");
        System.out.println(pair2.getKey() + " = " + pair2.getValue());
    }
}
