package jobsheet3;
import java.util.Scanner;

public class MataKuliahDemo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah23[] arrayOfMataKuliah23 = new MataKuliah23[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode\t\t: ");
            kode = sc.nextLine();
            System.out.println("Nama\t\t: ");
            nama = sc.nextLine();
            System.out.println("sks\t\t: ");
            dummy = sc.nextLine(); 
            sks = Integer.parseInt(dummy);
            System.out.println("Jumlah Jam\t: ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-------------------------------------");
            
            arrayOfMataKuliah23[i] = new MataKuliah23(kode, nama, sks, jumlahJam);
        }
    }   
    
}
