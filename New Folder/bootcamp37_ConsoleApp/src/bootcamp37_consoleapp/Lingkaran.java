package bootcamp37_consoleapp;

/**
 *
 * @author Deo Lahara
 */
public class Lingkaran extends Shape {
    public Lingkaran(){}
    
    public Lingkaran(double radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public void setRadius(double radius){
        this.radius=radius;
    }
    
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    
    @Override
    public void Description(){
        System.out.println("Lingkaran");
        System.out.println("Luas Lingkaran adalah "+this.getArea());}
    
    public String toString(){
        return "Lingkaran \n"+
                "Luas Lingkaran adalah "+this.getArea();}
}
