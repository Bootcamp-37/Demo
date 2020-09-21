/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan;
import java.util.Scanner;
/**
 *
 * @author ZFH
 */
public class Bootcamp37_ConsoleApp {
double panjang;
double lebar;
double luas;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input=new Scanner(System.in);
    
    try{
            int choice = 10;
            switch(choice) {
                case 1:
                  
                    Lemari Lemari1 = new Lemari();
                    Lemari1.setPanjang(90);
                    Lemari1.setLebar(60);
                    Lemari.PakaianIni();
                  break;
                  
                case 2:
                 
                    Tas Tas1 = new Tas();
                    Tas1.setPanjang(50);
                    Tas1.setLebar(20);
                    Tas.TasIni();
                  break;
                  
                case 3:
                    
                    Kulkas Kulkas1 = new Kulkas();
                    Kulkas1.setPanjang(70);
                    Kulkas1.setLebar(50);
                    Kulkas.KulkasIni();
                  break;  
    }
            default:
                    System.out.println("Pilih 1 sampai 3");
            }
        }catch(Exception e){
            System.out.println("Error !! Description: "+ e.getMessage());
        }

    
    public double getPanjang(){
    return panjang;
    }
    
    public double getLebar(){
    return lebar;
    }
    
    public double getLuas() {
    return luas;
    }
    public void Luas(){
    Scanner input=new Scanner(System.in);
    System.out.print("Masukkan panjang : ");
    panjang = input.nextInt();
    System.out.print("Masukkan lebar : ");
    lebar = input.nextInt();
    luas = panjang * lebar;
    System.out.println("Luas adalah " + luas);
    }
   }