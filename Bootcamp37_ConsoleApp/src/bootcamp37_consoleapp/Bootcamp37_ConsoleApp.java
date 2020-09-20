/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootcamp37_consoleapp;

/**
 *
 * @author aqira
 */
public class Bootcamp37_ConsoleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            int choice = 10;
            switch(choice) {
                case 1:
                  // Orange
                    Orange Orange1 = new Orange();
                    Orange1.setVolume(4);
                    Orange1.setWeight(60);
                    Orange1.Description();
                  break;
                case 2:
                  // Apple
                    Apple Apple1 = new Apple();
                    Apple1.setVolume(5);
                    Apple1.setWeight(80);
                    Apple1.Description();
                  break;
                case 3:
                  // Tomato
                    Tomato Tomato1 = new Tomato();
                    Tomato1.setVolume(3);
                    Tomato1.setWeight(40);
                    Tomato1.Description();
                  break;
                case 4:
                  // Melon
                    Melon Melon1 = new Melon();
                    Melon1.setVolume(25);
                    Melon1.setWeight(1500);
                    Melon1.Description();
                  break;
                case 5:
                  // Kiwi
                    Kiwi Kiwi1 = new Kiwi();
                    Kiwi1.setVolume(3);
                    Kiwi1.setWeight(70);
                    Kiwi1.Description();
                  break;
                case 6:
                  // Rambutan
                    Rambutan Rambutan1 = new Rambutan();
                    Rambutan1.setVolume(20);
                    Rambutan1.setWeight(33);
                    Rambutan1.Description();
                  break; 
                case 7:
                  // Water Melon
                    WaterMelon WaterMelon1 = new WaterMelon();
                    WaterMelon1.setVolume(80);
                    WaterMelon1.setWeight(3500);
                    WaterMelon1.Description();
                  break;
                case 8:
                  // Grape
                    Grape Grape1 = new Grape();
                    Grape1.setVolume(1.5);
                    Grape1.setWeight(8);
                    Grape1.Description();
                  break;
                case 9:
                  // Papaya
                    Papaya Papaya1 = new Papaya();
                    Papaya1.setVolume(25,62);
                    Papaya1.setWeight(2200);
                    Papaya1.Description();
                  break;
                case 10:
                  // Eggplant
                    Eggplant Eggplant1 = new Eggplant();
                    Eggplant1.setVolume(5,20);
                    Eggplant1.setWeight(200);
                    Eggplant1.Description();
                  break;
                default:
                    System.out.println("Please entry value 1 to 10");
            }
        }catch(Exception e){
            System.out.println("Error !! Description: "+ e.getMessage());
        }
    }
    
}
