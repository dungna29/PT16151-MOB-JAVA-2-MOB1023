/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3_QuanLyGiaoVien;

/**
 *
 * @author LegendNguyen
 */
public class NewClass {

    public static void main(String[] args) {
        tempFunc(108);
    }

    static int tempFunc(int number) {
        if (number == 1) {
            return 1;
        }
        if (number == 0) {
            return 10;
        }

        int a = 0;
        for (int i = 9; i > 1; i--) {//Chạy từ 9 về 2
            System.out.println("Kết quả i trước khi vào While = " + i);
            while (number % i == 0) {//Những số chẵn thì sẽ vẫn chạy
                System.out.println("While trước khi chạy: i = " + i);
                System.out.println("a * 10 + i = " + a + "* 10 + " + i);
                a = a * 10 + i;
                System.out.println("While sau khi tính với i thì a = " + a);
                number /= i;
                System.out.println("While product = " + number);
            }
        }
        System.out.println("-------------------------------");
        int b = 0;
        while (a > 0) {
            System.out.println("a = " + a);
            b = b * 10 + a % 10;
            System.out.println("b = " + b);
            a /= 10;
            System.out.println("a sau khi chia 10 = " + a);

        }
        System.out.println("=========");
        return (b != 0) ? b : -1;
    }
}
