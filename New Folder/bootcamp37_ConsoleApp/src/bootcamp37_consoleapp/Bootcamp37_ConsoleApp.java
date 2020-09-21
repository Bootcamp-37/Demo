package bootcamp37_consoleapp;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Deo Lahara
 */
public class Bootcamp37_ConsoleApp {
    static String pilihshape;
   
    
    public static void showAll (Shape S, double radius, double sisi, double panjang, double lebar, double tinggi){
        S.setRadius(radius);
        S.setSisi(sisi);
        S.setPanjang(panjang);
        S.setLebar(lebar);
        S.setTinggi(tinggi);
    }
    
    public static void main(String[] args) {
        Scanner pilihan1 = new Scanner(System.in);
        
        double radius = 0;
        double sisi = 0;
        double panjang = 0;
        double lebar = 0;
        double tinggi = 0;
        int err = 0;
        try{
            System.out.println("Welcome to Console App Shape");
            System.out.println("Created By: Iqwal Akmar");
            System.out.println("Mau menghitung apa ?");
            System.out.println("1. Lingkaran");
            System.out.println("2. Persegi");
            System.out.println("3. Persegi Panjang");
            System.out.println("4. Kubus");
            System.out.println("5. Tabung");
            System.out.println("6. Kerucut");
            System.out.println("7. Bola");
            System.out.println("Masukkan Pilihan Anda ? (1/2/3/4/5/6/7)");
            int pilihan = pilihan1.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Lingkaran");
                    System.out.println("Parameter yang harus anda isi adalah Jari-jari");
                    System.out.println("Input Jari-jari: ");
                    radius = pilihan1.nextDouble();
                    if (radius > 0){
                        pilihshape = "Lingkaran";
                        Lingkaran lingkaran1 = new Lingkaran(radius);
                        System.out.println(lingkaran1);}
                    else {
                        throw new IllegalArgumentException("Besarnya Jari-jari harus lebih besar dari sama dengan 0");
                    }   break;
                case 2:
                    System.out.println("Persegi");
                    System.out.println("Parameter yang harus anda isi adalah Sisi");
                    System.out.println("Input Sisi: ");
                    sisi = pilihan1.nextDouble();
                    if (sisi > 0){
                        pilihshape = "Persegi";
                        Persegi persegi1 = new Persegi(sisi);
                        System.out.println(persegi1);}
                    else {
                        throw new IllegalArgumentException("Besarnya Sisi harus lebih besar dari sama dengan 0");
                    }   break;
                case 3:
                    System.out.println("Persegi Panjang");
                    System.out.println("Parameter yang harus anda isi adalah Panjang dan Lebar");
                    System.out.println("Input Panjang: ");
                    panjang = pilihan1.nextDouble();
                    System.out.println("Input Lebar: ");
                    lebar = pilihan1.nextDouble();
                    if (panjang > 0 && lebar >0){
                        pilihshape = "Persegi Panjang";
                        Persegipanjang pp1 = new Persegipanjang(panjang,lebar);
                        System.out.println(pp1);}
                    else {
                        throw new IllegalArgumentException("Besarnya Panjang dan Lebar harus lebih besar dari sama dengan 0");
                    }   break;
                case 4:
                    System.out.println("Kubus");
                    System.out.println("Parameter yang harus anda isi adalah Sisi");
                    System.out.println("Input Sisi: ");
                    sisi = pilihan1.nextDouble();
                    if (sisi > 0){
                        pilihshape = "Kubus";
                        Kubus kubus1 = new Kubus(sisi);
                        System.out.println(kubus1);}
                    else {
                        throw new IllegalArgumentException("Besarnya Sisi harus lebih besar dari sama dengan 0");
                    }   break;
                case 5:
                    System.out.println("Tabung");
                    System.out.println("Parameter yang harus anda isi adalah Radius dan Tinggi");
                    System.out.println("Input Jari-jari: ");
                    radius = pilihan1.nextDouble();
                    System.out.println("Input Tinggi: ");
                    tinggi = pilihan1.nextDouble();
                    if (radius > 0 && tinggi > 0){
                        pilihshape = "Tabung";
                        Tabung tabung1 = new Tabung(radius,tinggi);
                        System.out.println(tabung1);}
                    else {
                        throw new IllegalArgumentException("Besarnya Jari-jari dan Tinggi harus lebih besar dari sama dengan 0");
                    }   break;
                case 6:
                    System.out.println("Kerucut");
                    System.out.println("Parameter yang harus anda isi adalah Jari-jari dan Tinggi");
                    System.out.println("Input Jari-jari : ");
                    radius = pilihan1.nextDouble();
                    System.out.println("Input Tinggi : ");
                    tinggi = pilihan1.nextDouble();
                    if (radius > 0 && tinggi > 0){
                        pilihshape = "Tabung";
                        Kerucut kerucut1 = new Kerucut(radius,tinggi);
                        System.out.println(kerucut1);}
                    else {
                        throw new IllegalArgumentException("Besarnya Jari-jari dan Tinggi harus lebih besar dari sama dengan 0");
                    }   break;
                case 7:
                    System.out.println("Bola");
                    System.out.println("Parameter yang harus anda isi adalah Jari-jari ");
                    System.out.println("Input Jari-jari : ");
                    radius = pilihan1.nextDouble();
                    System.out.println("Input Tinggi : ");
                    if (radius > 0 ){
                        pilihshape = "Bola";
                        Bola bola1 = new Bola(radius);
                        System.out.println(bola1);}
                    else {
                        throw new IllegalArgumentException("Besarnya Jari-jari harus lebih besar dari sama dengan 0");
                    }   break;
                default:
                    System.out.println("List Menu (1/2/3/4/5/6/7)");
                    break;
            }
        } catch (InputMismatchException | ArithmeticException e) {
            err = 1;
            System.out.println("Program Tidak Dapat Dijalankan, karena " + e);
        }

    }

}