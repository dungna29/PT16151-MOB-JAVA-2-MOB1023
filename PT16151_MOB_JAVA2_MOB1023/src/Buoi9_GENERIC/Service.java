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
public class Service<T> implements Iservice<T>{
    T[] arrTuoi;

    public Service(T[] arrTuoi) {
        this.arrTuoi = arrTuoi;
    }
 
    @Override
    public boolean checkOld(T obj) {        
        for (T t : arrTuoi) {
            if (t.equals(obj)) {
                return true;
            }
        }
        return false;
    }
    
}
