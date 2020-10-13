/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi7_Thread;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S3_Tao_Thread_Implements implements Runnable {

  

    public static void main(String[] args) {
        //Thực hiện 2 luồng chạy song song
        Thread thread1 = new Thread(new S3_Tao_Thread_Implements());
        thread1.start();
        Thread thread2 = new Thread(new S3_Tao_Thread_Implements());
        thread2.start();
    }

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
}
