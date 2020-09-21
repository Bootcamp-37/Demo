package bootcamp37_consoleapp;

/**
 *
 * @author Deo Lahara
 */
public class Bola extends Shape {
    public Bola(){}
    
    public Bola(double radius){
        this.radius = radius;}
    
    public double getRadius(){
        return this.radius;
    }
    
    public void setRadius(double radius){
        this.radius=radius;
    }
    
    public double getVolume(){
        return (4*Math.PI*this.radius*this.radius*this.radius)/3;
    }
    
    @Override
    public void Description(){
        System.out.println("Bola");
        System.out.println("Volume Bola adalah "+this.getVolume());}
    
    public String toString(){
        return "Bola \n"+
                "Volume Bola adalah "+this.getVolume();}
}
