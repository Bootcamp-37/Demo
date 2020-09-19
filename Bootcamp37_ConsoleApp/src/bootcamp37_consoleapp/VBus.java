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
public class VBus extends Vehicle{
     @Override
    public double countVelocity(double distance, double time) {
    velocity=distance/time;
        System.out.println("RESULT OF VELOCITY is "+velocity+"km/hours");
    return velocity;
    }

    @Override
    public void setDistance(double distance) {
     this.distance=distance;  
    }

    @Override
    public void setTime(double time) {
     this.time=time;   
    }

    @Override
    public void setMass(double mass) {
        this.mass=mass;
    }

    @Override
    public void setVelocity(double velocity) {
        this.velocity=velocity;
    }

    @Override
    public void setMomentum() {
        
    }

    @Override
    public double getDistance() {
        return distance;
    }

    @Override
    public double getTime() {
        return time;
    }

    @Override
    public double getMass() {
       return mass;
    }

    @Override
    public double getVelocity() {
        return velocity;
    }

    @Override
    public double getMomentum() {
        return momentum;
    }

    @Override
    public void countMomentum(double mass, double velocity) {
        mass=11062;
        momentum=mass/velocity;
        System.out.println("THE RESULT OF MOMENTUM IS "+momentum+"kg km/hours");
    }
}
