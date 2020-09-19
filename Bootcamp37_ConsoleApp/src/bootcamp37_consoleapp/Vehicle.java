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
abstract public class Vehicle {
    protected double distance;
    protected double time;
    protected double mass;
    protected double velocity;
    protected double momentum;
    protected abstract void setDistance(double distance);
    protected abstract void setTime(double time);
    protected abstract void setMass(double mass);
    protected abstract void setVelocity(double velocity);
    protected abstract void setMomentum();
    protected abstract double getDistance();
    protected abstract double getTime();
    protected abstract double getMass();
    protected abstract double getVelocity();
    protected abstract double getMomentum();
    protected abstract double countVelocity(double distance, double time);
    protected abstract void countMomentum(double mass, double velocity);
    
}
