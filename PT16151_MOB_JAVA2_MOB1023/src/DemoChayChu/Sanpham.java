/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoChayChu;

/**
 *
 * @author LegendNguyen
 */
public class Sanpham {

    double money;
    String trangthai;

    public Sanpham() {
    }

    public Sanpham(double money, String trangthai) {
        this.money = money;
        this.trangthai = trangthai;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
        if (money < 5000) {
            this.trangthai = "Rẻ";
        } else {
            this.trangthai = "Đắt";
        }
    }

    public String getTrangthai() {
        return trangthai;
    }

}
