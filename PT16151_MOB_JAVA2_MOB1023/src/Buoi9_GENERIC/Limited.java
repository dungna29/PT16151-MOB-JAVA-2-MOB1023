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
public class Limited<T extends Number> {//Giới hạn cho T không cho phép đặt thoải mái và chỉ được phép là số

    private T number;

    public Limited() {
    }

    public Limited(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public double getThaPhan() {
        return number.doubleValue() - number.intValue();//Dùng để lấy ra phần thập phân
    }

    //Sử dụng kiểu dữ liệu trong phương thức
    public boolean neuBangNhau(Limited<?> limited) {//Ký tự dấu hỏi đại diện cho tất cả các kiểu dữ liệu thuộc number
        if (number.doubleValue() == limited.getNumber().doubleValue()) {
            return true;
        }
        return false;
    }

}
