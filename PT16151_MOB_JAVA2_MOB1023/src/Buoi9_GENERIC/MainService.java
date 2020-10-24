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
public class MainService {
    public static void main(String[] args) {
        Integer arrTuoi[] = {1989,2000,2001};
        //Định nghĩa kiểu dữ liệu của Interface
        Iservice<Integer> iservice = new Service<>(arrTuoi);
        System.out.println(iservice.checkOld(1989));
    }
}
