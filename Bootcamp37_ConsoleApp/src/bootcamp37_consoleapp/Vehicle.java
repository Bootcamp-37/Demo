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
public class Vehicle implements VehicleInterface{
    protected double distance;
    protected double time;
    protected double mass;
    protected double velocity;
    protected double momentum;
    
    public void setDistance(double distance) {
     this.distance=distance;  
    }

    public void setTime(double time) {
     this.time=time;   
    }

    public void setMass(double mass) {
        this.mass=mass;
    }

    public void setVelocity(double velocity) {
        this.velocity=velocity;
    }

    public void setMomentum() {
        
    }

    public double getDistance() {
        return distance;
    }

    public double getTime() {
        return time;
    }

    public double getMass() {
       return mass;
    }

    public double getVelocity() {
        return velocity;
    }

    public double getMomentum() {
        return momentum;
    }


    @Override
    public double countVelocity(double distance, double time) {
      velocity=distance/time;
        System.out.println("RESULT OF VELOCITY is "+velocity+"km/hours");
        return velocity;
    }

    @Override
    public void countMomentum(double mass, double velocity) {
        momentum=mass/velocity;
        System.out.println("THE RESULT OF MOMENTUM IS "+momentum+"kg km/hours");
    }
   
}
