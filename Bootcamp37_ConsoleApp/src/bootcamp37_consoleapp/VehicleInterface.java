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
public interface VehicleInterface {

    void setDistance(double distance);

    void setTime(double time);

    void setMass(double mass);

    void setVelocity(double velocity);

    void setMomentum();

    double getDistance();

    double getTime();

    double getMass();

    double getVelocity();

    double getMomentum();

    double countVelocity(double distance, double time);

    void countMomentum(double mass, double velocity);

}
