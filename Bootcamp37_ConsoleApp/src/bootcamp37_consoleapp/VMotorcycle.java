/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootcamp37_consoleapp;

/**
 *
 * @author Laila
 */
public class VMotorcycle extends Vehicle{

    public VMotorcycle(){
        
    }

    @Override
    public void countMomentum(double mass, double velocity) {
        mass=95;
        Vehicle v1= new Vehicle();
        v1.countMomentum(mass, velocity);
    }
}
