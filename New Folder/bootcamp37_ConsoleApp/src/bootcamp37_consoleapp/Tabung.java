
package bootcamp37_consoleapp;

/**
 *
 * @author Deo Lahara
 */
public class Tabung extends Shape{
    public Tabung(){}
    
    public Tabung(double radius, double tinggi){
        this.radius = radius;
        this.tinggi = tinggi;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public double getTinggi(){
        return this.tinggi;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    
    public double getVolume(){
    return Math.PI*this.radius*this.radius*this.tinggi;}
    
    public void Description(){
        System.out.println("Tabung");
        System.out.println("Volume Tabung adalah "+this.getVolume());}
    
    public String toString(){
        return "Tabung"+
                "Volume Tabung adalah "+this.getVolume();}
    }
}
