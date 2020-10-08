/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoDocGhiDoiTuong;

import java.io.Serializable;

/**
 *
 * @author LegendNguyen
 */
public class Teacher implements Serializable{
    private String maGV;
    private String tenGV;

    public Teacher() {
    }

    
    public Teacher(String maGV, String tenGV) {
        this.maGV = maGV;
        this.tenGV = tenGV;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }
    
   
    
}
