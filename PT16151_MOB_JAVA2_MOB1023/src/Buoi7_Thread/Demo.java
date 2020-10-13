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
 * @author LegendNguyen
 */
public class Demo extends Thread {

    @Override
    public void run(){
        int temp = 0;
        while (true) {
            System.out.println(temp++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("99999");
        Demo luong1 = new Demo();
        luong1.start();
        Demo luong2 = new Demo();
        luong2.start();
    }
}
