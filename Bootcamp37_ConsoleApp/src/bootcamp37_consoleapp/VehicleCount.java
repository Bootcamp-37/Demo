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
public class VehicleCount extends Vehicle {

//    protected double distance;
//    protected double time;
//    protected double mass;
//    protected double velocity;
////    protected double momentum;

    @Override
    protected double countVelocity(double distance, double time) {
    velocity=distance/time;
        System.out.println("RESULT OF VELOCITY is "+velocity+"km/hours");
    return velocity;
    }

    @Override
    protected void setDistance(double distance) {
     this.distance=distance;  
    }

    @Override
    protected void setTime(double time) {
     this.time=time;   
    }

    @Override
    protected void setMass(double mass) {
        this.mass=mass;
    }

    @Override
    protected void setVelocity(double velocity) {
        this.velocity=velocity;
    }

    @Override
    protected void setMomentum() {
        
    }

    @Override
    protected double getDistance() {
        return distance;
    }

    @Override
    protected double getTime() {
        return time;
    }

    @Override
    protected double getMass() {
       return mass;
    }

    @Override
    protected double getVelocity() {
        return velocity;
    }

    @Override
    protected double getMomentum() {
        return momentum;
    }

    @Override
    protected void countMomentum(double mass, double velocity) {
        momentum=mass/velocity;
        System.out.println("THE RESULT OF MOMENTUM IS "+momentum+"kg km/hours");
    }
}
