package bootcamp37_consoleapp;

/**
 *
 * @author Deo Lahara
 */
public class Persegi extends Shape {
    public Persegi(){}
    
    public Persegi(double sisi){
        this.sisi = sisi;
    }
    
    public double getSisi(){
        return this.sisi;}
    
    @Override
    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    
    public double getArea(){
        return this.sisi*this.sisi;
    }
    
    @Override
    public void Description(){
        System.out.println("Persegi");
        System.out.println("Luas Persegi adalah "+this.getArea());}
    
    public String toString(){
    return "Persegi \n"+
            "Luas Persegi adalah "+this.getArea();}
}
