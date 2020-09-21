/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan;

import java.util.Scanner;

/**
 *
 * @author ZFH
 */
public abstract class Lemari extends Penyimpanan{

    String name;
    
    public Lemari(){
    } 
    public double getPanjang(){
    return panjang;
    }
    
    public double getLebar(){
    return lebar;
    }
    
    public double getLuas() {
    return luas;
    }
    public void Description() {
        
        System.out.println(this.getPanjang());
        System.out.println(this.getLebar());       
        System.out.println(this.getLuas());

    }
public static void PakaianIni(){
    
System.out.println("Ini adalah Lemari");
}
}