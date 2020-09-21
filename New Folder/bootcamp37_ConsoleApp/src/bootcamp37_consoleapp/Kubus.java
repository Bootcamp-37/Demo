package bootcamp37_consoleapp;

/**
 *
 * @author Deo Lahara
 */
public class Kubus extends Shape {
    public Kubus (){}
    
    public Kubus(double sisi){
        this.sisi = sisi;
    }
    
    public double getSisi(){
        return this.sisi;
    }
    
    @Override
    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    
    public double getVolume(){
        return this.sisi*this.sisi*this.sisi;
    }
    
    @Override
    public void Description(){
        System.out.println("Kubus");
        System.out.println("Volume Kubus adalah "+this.getVolume());}
    
    public String toString(){
    return "Kubus \n"+
            "Volume Kubus adalah "+this.getVolume();}
}
