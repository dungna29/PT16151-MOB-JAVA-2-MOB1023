/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi7_Thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S7_MoiQuanHeGiuaCacThread {

    double tienTrongVi = 50000;

    public static void main(String[] args) {
        /*
        ❑Phương thức wait() sẽ đưa thread vào trạng thái
        ‘sleeping’.
        ❑Phương thức notify() ‘đánh thức’ thread đầu
        tiên đang ở trạng thái ‘sleeping’ bởi vì phương
        phức wait() bị gọi.
        ❑Phương thức notifyAll() ‘đánh thức’ tất cả các
        thread đang ở trạng thái ‘sleeping’ bởi vì
        phương thức wait() bị gọi.
        ❑Khi tất cả các thread thoát khỏi trạng thái
        spleeping, thread có độ ưu tiên cao nhất sẽ chạy
        đầu tiên.
         */
        S7_MoiQuanHeGiuaCacThread t1 = new S7_MoiQuanHeGiuaCacThread();
        Thread th1 = new Thread() {
            public void run() {
                try {
                    t1.rutTien(59000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(S7_MoiQuanHeGiuaCacThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        th1.start();
        Thread th2 = new Thread() {
            public void run() {
                try {
                    t1.napTien(10000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(S7_MoiQuanHeGiuaCacThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        th2.start();

        //Cả 2 thread ở trên đang dùng chung t1
    }

    public synchronized void rutTien(double tienMuonRut) throws InterruptedException {
        System.out.println("Bạn đang rút tiền.....");
        if (tienTrongVi < tienMuonRut) {
            Thread.sleep(1000);
            System.out.println("Chia buồn với bạn vì bạn không đủ tiền mặt để rút");
            wait();
        }
        tienTrongVi = tienTrongVi - tienMuonRut;
        System.out.println("Bạn đã rút tiền thành công và số dư tài khoản là: " + tienTrongVi);
    }

    public synchronized void napTien(double tienMuonNap) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Bạn đang nạp tiền");
        Thread.sleep(1000);
        tienTrongVi = tienTrongVi + tienMuonNap;
        Thread.sleep(1000);
        System.out.println("Nạp tiền thành công và số dư hiện tại " + tienTrongVi);
        notify();
    }

}
