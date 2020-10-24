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
public class MainLimited {

    public static void main(String[] args) {
        //Limited<String> limited = new Limited<String>();//Lỗi
        Limited<Double> limited = new Limited<Double>();
        limited.setNumber(8.69);
        System.out.println(limited.getNumber());
        System.out.println(limited.getThaPhan());

        Limited<Float> limited2 = new Limited(8.9f);
        System.out.println(limited2.getThaPhan());

        System.out.println("--------------Sử dụng kiểu dữ liệu trong phương thức của number");
        Limited<Integer> limited3 = new Limited(10);
        Limited<Float> limited4 = new Limited(10.0);
        System.out.println("limited3 có bằng limited4 không? " + limited3.neuBangNhau(limited4));
    }

}
