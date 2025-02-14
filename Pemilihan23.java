import java.util.Scanner;

public class Pemilihan23 {

    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);

        System.out.println(" =======================================");
        System.out.println("|     Program Menghitung Nilai Akhir    |");
        System.out.println(" =======================================");

         System.out.print("Masukkan nilai tugas  : ");
         int nilaiTugas = input23.nextInt();
 
         System.out.print("Masukkan nilai kuis   : ");
         int nilaiKuis = input23.nextInt();
 
         System.out.print("Masukkan nilai UTS    : ");
         int nilaiUTS = input23.nextInt();
 
         System.out.print("Masukkan nilai UAS    : ");
         int nilaiUAS = input23.nextInt();
 
         String nilaiHuruf = " ";
         String keterangan = " ";
 
         double nilaiAkhir = 0.2 * nilaiTugas + 0.2 * nilaiKuis + 0.3 * nilaiUTS + 0.3 * nilaiUAS;
 
         
         System.out.println("========================================");
         System.out.println("========================================");
 
         System.out.println("Nilai Akhir: " + nilaiAkhir);
 
         if (nilaiTugas >= 0 && nilaiTugas <= 100 &&
                 nilaiKuis >= 0 && nilaiKuis <= 100 &&
                 nilaiUTS >= 0 && nilaiUTS <= 100 &&
                 nilaiUAS >= 0 && nilaiUAS <= 100) {
 
             if (nilaiAkhir > 80 && nilaiAkhir <= 00) {
                 nilaiHuruf = "A";
                 keterangan = "LULUS";
             } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                 nilaiHuruf = "B+";
                 keterangan = "LULUS";
             } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                 nilaiHuruf = "B";
                 keterangan = "LULUS";
             } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                 nilaiHuruf = "C+";
                 keterangan = "LULUS";
             } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                 nilaiHuruf = "C";
                 keterangan = "LULUS";
             } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                 nilaiHuruf = "D";
                 keterangan = "TIDAK LULUS";
             } else if (nilaiAkhir <= 39) {
                 nilaiHuruf = "E";
                 keterangan = "TIDAK LULUS";
             }
 
             System.out.println("Nilai Huruf: " + nilaiHuruf);
             System.out.println("Keterangan: " + keterangan);
 
         } else {
             System.out.println("Nilai tidak valid");
         }

     }
 }
    