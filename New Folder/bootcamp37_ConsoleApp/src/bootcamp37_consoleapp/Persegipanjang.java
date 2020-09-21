/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootcamp37_consoleapp;

/**
 *
 * @author Deo Lahara
 */
public class Persegipanjang extends Shape {
    public Persegipanjang(){}
    
    public Persegipanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public double getPanjang(){
        return this.panjang;
    }
    
    public double getLebar(){
        return this.lebar;
    }
    
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
    
    @Override
    public void setLebar(double lebar){
        this.lebar = lebar;
    }
    
    public double getArea(){
        return this.panjang*this.lebar;
    }
    
    @Override
    public void Description(){
        System.out.println("Persegi Panjang");
        System.out.println("Persegi Panjang adalah "+this.getArea());}
    
    public String toString(){
    return "Persegi Panjang \n"+
            "Luas Persegi Panjang adalah "+this.getArea();}
    
}
