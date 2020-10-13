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
public class S2_Tao_Thread extends Thread{

    @Override
    public void run() {
        int i = 0;
        while (true) {
            System.out.println(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                break;
            }
        }
    }

    

    public static void main(String[] args) {
        //Thực hiện 2 luồng chạy song song
        S2_Tao_Thread thread1 = new S2_Tao_Thread();
        thread1.start();//khởi động thread
        S2_Tao_Thread thread2 = new S2_Tao_Thread();
        thread2.start();
    }
}
