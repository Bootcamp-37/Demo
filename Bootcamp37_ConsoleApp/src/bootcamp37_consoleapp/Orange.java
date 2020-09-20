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
public class Orange extends Fruit{

    public Orange() {
    }
    
    public double getPI() {
        return PI;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double diameter) {
        double spoke = diameter / 2;
        if (this.weight == 0) {
            double volume = (4 * getPI() *spoke * spoke * spoke)/3;
            this.volume = volume;
        }
    }

    public double getWeight() {
        return weight;
    }

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
        System.out.println("This is a Orange Fruit");
        System.out.println("Volume: "+this.getVolume());
        System.out.println("Weight: "+this.getWeight());
        System.out.println("Density: "+this.getDensity());
    }
}
