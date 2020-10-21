/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal4;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Soal4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Program Perhitungan Nilai Ulangan
        Scanner input = new Scanner(System.in);
        System.out.println("<<Ulangan Harian 1>>");
        System.out.println("20 soal\t: Soal Benar * 5 = 100");
        System.out.println("-- Masukan Jumlah Soal Benar --");
        System.out.print("Soal Benar\t: ");
        int soal = input.nextInt();
        double Nilai = soal * 5;
        System.out.println("Nilai yang diperoleh :" + Nilai);

        System.out.println("\n<<Ulangan Harian 2>>");
        System.out.println("25 soal\t: Soal Benar * 4 = 100");
        System.out.println("-- Masukan Jumlah Soal Benar --");
        System.out.print("Soal Benar\t: ");
        soal = input.nextInt();
        Nilai = soal * 4;
        System.out.println("Nilai yang diperoleh :" + Nilai);
        
        System.out.println("\n<<Rata-rata>>");
        System.out.println("- Masukan Nilai-nilai Ulangan");
        System.out.print("Nilau Ulangang Harian 1\t\t:");
        int uh1 = input.nextInt();
        System.out.print("Nilau Ulangang Harian 2\t\t:");
        int uh2 =input.nextInt();
        System.out.print("Berapa Kali Jumlah Ulangan\t:");
        int ulangan =input.nextInt();
        Nilai = (uh1+uh2)/ulangan;
        System.out.println("Hasil Rata-rata Nilai\t\t:"+Nilai);
        
        if (90 <= Nilai && Nilai <= 100) {
            System.out.println("Grade\t: A");

        }
        else if (80<=Nilai && Nilai<90 ){
            System.out.println("Grade\t: B+");
        }
        else if (70<=Nilai && Nilai<=80){
            System.out.println("Grade\t: B");
        }
        else {System.out.println("Grade\t: C");}
    }

}
