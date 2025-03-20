package jobsheet5;

import java.util.Scanner;
public class MainFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai: ");
        int nilai = input.nextInt();

        faktorial fk = new faktorial();
        System.out.println("Nilai Faktorial " + nilai + " Menggunakan BF : " + fk.faktorialBF(nilai));
        System.out.println("Nilai Faktorial " + nilai + " Menggunakan DC " + fk.faktorialDC(nilai));
    }
}
