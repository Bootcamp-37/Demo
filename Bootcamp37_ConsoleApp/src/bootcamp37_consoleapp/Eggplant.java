/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootcamp37_consoleapp;

/**
 *
 * @author User
 */
public class Eggplant extends Fruit {

    public Eggplant() {
    }
    
    public double getPI() {
        return PI;
    }

    public double getVolume() {
        return volume;
    }
    
     public void setVolume(double diameter, double tall) {
        double spoke = diameter / 2;
        tall = tall - diameter;
        if (this.weight == 0) {
            double volume = ((4 * getPI() *spoke * spoke * spoke)/3)+ (getPI() * spoke * spoke * tall);
            this.volume = volume;
        }
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
        if (this.volume > 0) {
            double density = this.weight / this.volume;
            this.setDensity(density);
        }
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getMany() {
        return many;
    }

    public void setMany(double many) {
        this.many = many;
    }
           
    @Override
    public void Description() {
        System.out.println("This is a Eggplant Fruit");
        System.out.println("Volume: "+this.getVolume()+ "cm3");
        System.out.println("Weight: "+this.getWeight()+ "gr");
        System.out.println("Density: "+this.getDensity()+ "gr/cm3");
    }
}
