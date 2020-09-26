/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoCbcSuDungInterface;

/**
 *
 * @author LegendNguyen
 */
public class Service implements IService{

    @Override
    public String[] getDsNamSinh() {
        String[] arrNam = {"1989","1990","1991"};
        return arrNam;
    }
    
}
