/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootcamp37_consoleapp;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author aqira
 */
public class Bootcamp37_ConsoleApp {

    static String vehiclechoice;

    private static void showAll(Vehicle VC, double distance, double mass, double time) {
        VC.setDistance(distance);
        VC.setMass(mass);
        VC.setTime(time);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        double distance = 0;
        double time = 0;
        double mass = 0;
        int err = 0;
        try {
            System.out.println("WELCOME!!");
            System.out.println("FIRST, WE WILL COUNT VELOCITY OF VEHICLE, THEN YOU WILL AUTOMATICALLY GET THE MOMENTUM RESULT");
            System.out.println("PLEASE CHOOSE ONE OF THESE VEHICLE");
            System.out.println("1. MOTORCYCLE");
            System.out.println("2. ELF/TOUR CAR");
            System.out.println("3. FIRE TRUCK");
            System.out.println("4. BUS");
            System.out.println("5. AMBULANCE");
            System.out.println("6. COP CAR");
            System.out.println("7. BIKE");
            System.out.println("PLEASE INSERT YOUR CHOICE [1/2/3/4/5/6/7] : ");
            int choice = scanner1.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("YOU CHOSE MOTORCYCLE");
                    System.out.println("INSERT HOW LONG YOU RIDE IN HOUR");
                    time = scanner1.nextDouble();
                    System.out.println("INSERT HOW FAR YOU RIDE IN KILOMETER");
                    distance = scanner1.nextDouble();
                    if (time > 0 && distance > 0) {
                        vehiclechoice = "MOTORCYCLE";
                        
                        Vehicle mc1 = new Vehicle();
                        mc1.countVelocity(distance, time);
                        double velocity = mc1.getVelocity();
                        VMotorcycle mc2= new VMotorcycle();
                        mc2.countMomentum(mass, velocity);
                        
                    } else {
                        throw new IllegalArgumentException("INPUT CAN'T BE 0 OR NEGATIVE");
                    }   break;
                case 2:
                    System.out.println("YOU CHOSE ELF/TOUR CAR");
                    System.out.println("INSERT HOW LONG YOU RIDE IN HOUR");
                    time = scanner1.nextDouble();
                    System.out.println("INSERT HOW FAR YOU RIDE IN KILOMETER");
                    distance = scanner1.nextDouble();
                    if (time > 0 && distance > 0) {
                        vehiclechoice = "ELF/TOUR CAR";
                        
                        Vehicle e1 = new Vehicle();
                        e1.countVelocity(distance, time);
                        double velocity = e1.getVelocity();
                        VElf e2 = new VElf();
                        e2.countMomentum(mass, velocity);
                        
                    } else {
                        throw new IllegalArgumentException("INPUT CAN'T BE 0 OR NEGATIVE");
                    }   break;
                case 3:
                    System.out.println("YOU CHOSE FIRE TRUCK");
                    System.out.println("INSERT HOW LONG YOU RIDE IN HOUR");
                    time = scanner1.nextDouble();
                    System.out.println("INSERT HOW FAR YOU RIDE IN KILOMETER");
                    distance = scanner1.nextDouble();
                    if (time > 0 && distance > 0) {
                        vehiclechoice = "FIRE TRUCK";
                        
                          Vehicle ft1 = new Vehicle();
                        ft1.countVelocity(distance, time);
                        double velocity = ft1.getVelocity();
                        VFiretruck ft2 = new VFiretruck();
                        ft2.countMomentum(mass, velocity);
                    } else {
                        throw new IllegalArgumentException("INPUT CAN'T BE 0 OR NEGATIVE");
                    }   break;
                case 4:
                    System.out.println("YOU CHOSE BUS");
                    System.out.println("INSERT HOW LONG YOU RIDE IN HOUR");
                    time = scanner1.nextDouble();
                    System.out.println("INSERT HOW FAR YOU RIDE IN KILOMETER");
                    distance = scanner1.nextDouble();
                    if (time > 0 && distance > 0) {
                        vehiclechoice = "BUS";
                        
                        Vehicle b1 = new Vehicle();
                        b1.countVelocity(distance, time);
                        double velocity = b1.getVelocity();
                        VBus b2 = new VBus();
                        b2.countMomentum(mass, velocity);
                    } else {
                        throw new IllegalArgumentException("INPUT CAN'T BE 0 OR NEGATIVE");
                    }   break;
                case 5:
                    System.out.println("YOU CHOSE AMBULANCE");
                    System.out.println("INSERT HOW LONG YOU RIDE IN HOUR");
                    time = scanner1.nextDouble();
                    System.out.println("INSERT HOW FAR YOU RIDE IN KILOMETER");
                    distance = scanner1.nextDouble();
                    if (time > 0 && distance > 0) {
                        vehiclechoice = "AMBULANCE";
                        
                         Vehicle a1 = new Vehicle();
                        a1.countVelocity(distance, time);
                        double velocity = a1.getVelocity();
                        VAmbulance a2 = new VAmbulance();
                        a2.countMomentum(mass, velocity);
                        
                    } else {
                        throw new IllegalArgumentException("INPUT CAN'T BE 0 OR NEGATIVE");
                    }   break;
                case 6:
                    System.out.println("YOU CHOSE COP CAR");
                    System.out.println("INSERT HOW LONG YOU RIDE IN HOUR");
                    time = scanner1.nextDouble();
                    System.out.println("INSERT HOW FAR YOU RIDE IN KILOMETER");
                    distance = scanner1.nextDouble();
                    if (time > 0 && distance > 0) {
                        vehiclechoice = "COP CAR";
                        
                       Vehicle cc1 = new Vehicle();
                        cc1.countVelocity(distance, time);
                        double velocity = cc1.getVelocity();
                         VCopCar cc2 = new VCopCar();
                        cc2.countMomentum(mass, velocity);
                        
                    } else {
                        throw new IllegalArgumentException("INPUT CAN'T BE 0 OR NEGATIVE");
                    }   break;
                case 7:
                    System.out.println("YOU CHOSE BIKE");
                    System.out.println("INSERT HOW LONG YOU RIDE IN HOUR");
                    time = scanner1.nextDouble();
                    System.out.println("INSERT HOW FAR YOU RIDE IN KILOMETER");
                    distance = scanner1.nextDouble();
                    if (time > 0 && distance > 0) {
                        vehiclechoice = "BIKE";
                        
                       Vehicle bike1 = new Vehicle();
                        bike1.countVelocity(distance, time);
                        double velocity = bike1.getVelocity();
                         VBike bike2 = new VBike();
                        bike2.countMomentum(mass, velocity);
                        
                    } else {
                        throw new IllegalArgumentException("INPUT CAN'T BE 0 OR NEGATIVE");
                    }   break;
                default:
                    System.out.println("YOU DIDN'T CHOSE ANY OF CHOICE");
                    break;
            }
        } catch (InputMismatchException | ArithmeticException e) {
            err = 1;
            System.out.println("PROGRAM CAN NOT RUN, BECAUSE OF " + e);
        }

    }

}
