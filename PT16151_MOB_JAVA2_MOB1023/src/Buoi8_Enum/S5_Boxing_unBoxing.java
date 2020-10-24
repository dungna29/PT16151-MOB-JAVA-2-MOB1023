/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi8_Enum;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S5_Boxing_unBoxing {
    public static void main(String[] args) {
        //Quá trình boxing là đưa 1 giá trị vào trong một đối tượng
        //Quá trình unboxing là lấy 1 giá trị từ mootjd dối tượng ra
        Integer objInt = new Integer(100);//Boxing
        Integer objInt2 = 110;//Boxing
        int a = objInt.intValue();//Unboxing
        int x = Integer.valueOf(objInt);//Unboxing        
        System.out.println("a = " + a);
        System.out.println("x = " + x);
    }
}
