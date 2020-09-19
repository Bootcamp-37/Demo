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
            System.out.println("PLEASE INSERT YOUR CHOICE [1/2/3/4/5/6/7/8] : ");
            int choice = scanner1.nextInt();
            if (choice == 1) {

                System.out.println("YOU CHOSE MOTORCYCLE");
                System.out.println("INSERT HOW LONG YOU RIDE IN HOUR");
                time = scanner1.nextDouble();
                System.out.println("INSERT HOW FAR YOU RIDE IN KILOMETER");
                distance = scanner1.nextDouble();
                if (time > 0 && distance > 0) {
                    vehiclechoice = "MOTORCYCLE";

                    VMotorcycle mc1 = new VMotorcycle();
                    mc1.countVelocity(distance, time);
                    double velocity = mc1.getVelocity();

                    mc1.countMomentum(mass, velocity);

                } else {
                    throw new IllegalArgumentException("INPUT CAN'T BE 0 OR NEGATIVE");
                }
            } else if (choice == 2) {

                System.out.println("YOU CHOSE ELF/TOUR CAR");
                System.out.println("INSERT HOW LONG YOU RIDE IN HOUR");
                time = scanner1.nextDouble();
                System.out.println("INSERT HOW FAR YOU RIDE IN KILOMETER");
                distance = scanner1.nextDouble();
                if (time > 0 && distance > 0) {
                    vehiclechoice = "ELF/TOUR CAR";

                    VElf e1 = new VElf();
                    e1.countVelocity(distance, time);
                    double velocity = e1.getVelocity();
                    e1.countMomentum(mass, velocity);

                } else {
                    throw new IllegalArgumentException("INPUT CAN'T BE 0 OR NEGATIVE");
                }
            } else if (choice == 3) {

                System.out.println("YOU CHOSE FIRE TRUCK");
                System.out.println("INSERT HOW LONG YOU RIDE IN HOUR");
                time = scanner1.nextDouble();
                System.out.println("INSERT HOW FAR YOU RIDE IN KILOMETER");
                distance = scanner1.nextDouble();
                if (time > 0 && distance > 0) {
                    vehiclechoice = "FIRE TRUCK";

                    VFiretruck ft1 = new VFiretruck();
                    ft1.countVelocity(distance, time);
                    double velocity = ft1.getVelocity();
                    ft1.countMomentum(mass, velocity);
                } else {
                    throw new IllegalArgumentException("INPUT CAN'T BE 0 OR NEGATIVE");
                }
            } else if (choice == 4) {
                System.out.println("YOU CHOSE BUS");
                System.out.println("INSERT HOW LONG YOU RIDE IN HOUR");
                time = scanner1.nextDouble();
                System.out.println("INSERT HOW FAR YOU RIDE IN KILOMETER");
                distance = scanner1.nextDouble();
                if (time > 0 && distance > 0) {
                    vehiclechoice = "BUS";

                    VBus b1 = new VBus();
                    b1.countVelocity(distance, time);
                    double velocity = b1.getVelocity();
                    b1.countMomentum(mass, velocity);
                } else {
                    throw new IllegalArgumentException("INPUT CAN'T BE 0 OR NEGATIVE");
                }
            } else if (choice == 5) {

                System.out.println("YOU CHOSE AMBULANCE");
                System.out.println("INSERT HOW LONG YOU RIDE IN HOUR");
                time = scanner1.nextDouble();
                System.out.println("INSERT HOW FAR YOU RIDE IN KILOMETER");
                distance = scanner1.nextDouble();
                if (time > 0 && distance > 0) {
                    vehiclechoice = "AMBULANCE";

                    VAmbulance a1 = new VAmbulance();
                    a1.countVelocity(distance, time);
                    double velocity = a1.getVelocity();
                    a1.countMomentum(mass, velocity);

                } else {
                    throw new IllegalArgumentException("INPUT CAN'T BE 0 OR NEGATIVE");
                }
            } else if (choice == 6) {
                
                System.out.println("YOU CHOSE COP CAR");
                System.out.println("INSERT HOW LONG YOU RIDE IN HOUR");
                time = scanner1.nextDouble();
                System.out.println("INSERT HOW FAR YOU RIDE IN KILOMETER");
                distance = scanner1.nextDouble();
                if (time > 0 && distance > 0) {
                    vehiclechoice = "COP CAR";

                    VCopCar cc1 = new VCopCar();
                    cc1.countVelocity(distance, time);
                    double velocity = cc1.getVelocity();
                    cc1.countMomentum(mass, velocity);

                } else {
                    throw new IllegalArgumentException("INPUT CAN'T BE 0 OR NEGATIVE");
                }
            } else if (choice == 7) {
                
                System.out.println("YOU CHOSE BIKE");
                System.out.println("INSERT HOW LONG YOU RIDE IN HOUR");
                time = scanner1.nextDouble();
                System.out.println("INSERT HOW FAR YOU RIDE IN KILOMETER");
                distance = scanner1.nextDouble();
                if (time > 0 && distance > 0) {
                    vehiclechoice = "BIKE";

                    VBike bike1 = new VBike();
                    bike1.countVelocity(distance, time);
                    double velocity = bike1.getVelocity();
                    bike1.countMomentum(mass, velocity);

                } else {
                    throw new IllegalArgumentException("INPUT CAN'T BE 0 OR NEGATIVE");
                }
            } else {
                System.out.println("YOU DIDN'T CHOSE ANY OF CHOICE");
            }
        } catch (InputMismatchException | ArithmeticException e) {
            err = 1;
            System.out.println("PROGRAM CAN NOT RUN, BECAUSE OF " + e);
        }

    }

}
