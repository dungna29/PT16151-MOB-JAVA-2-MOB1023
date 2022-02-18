/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi1_OnTap;

/**
 *
 * @author LegendNguyen
 */
public class GiaoVien extends Person{
       //(ID,Tên,Mã,Tuổi)
    //Tạo các thuộc tính của đối tượng theo đầu bài
   private int id;
   private String tengv;
   private String magv;
   private int tuoi;
    
    //Tạo ra 2 Hàm tạo Contructor
    //Hàm tạo không tham số
    public GiaoVien() {
    }
    //Hàm tạo có tham số

    public GiaoVien(int id, String tengv, String magv, int tuoi, String diachi, String sdt) {
        super(diachi, sdt);
        this.id = id;
        this.tengv = tengv;
        this.magv = magv;
        this.tuoi = tuoi;
        
    }
    
    
    //Get Set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTengv() {
        return tengv;
    }

    public void setTengv(String tengv) {
        this.tengv = tengv;
    }

    public String getMagv() {
        return magv;
    }

    public void setMagv(String magv) {
        this.magv = magv;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    void xuatLopCha() {
         System.out.printf("ID : %d - Tên: %s - Mã: %s - Tuổi: %d - Địa Chỉ : %s \n",id,tengv,magv,tuoi,getDiachi());
    }
    
    
    
}
