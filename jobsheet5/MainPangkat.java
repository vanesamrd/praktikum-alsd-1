package jobsheet5;
import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        pangkat[] png = new pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan Nilai Baris Elemen ke-" + (i+1) + " : ");
            int basis = input.nextInt();

            System.out.print("Masukkan Nilai Pangkat Elemen ke-" + (i+1) + " : ");
            int pangkat = input.nextInt();

            png[i] = new pangkat(basis, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE");
        for (pangkat p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatBF(p.nilai, p.pangkat));
        }
        
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER");
        for (pangkat p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}
