package jobsheet3;
import java.util.Scanner;

public class DosenDemo23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen23[] arrayDosen = new Dosen23[3];

        for (int i = 0; i < 3; i++) {
            String kode, nama, jk;
            int usia;
            boolean jenisKelamin = true;

            System.out.printf("Masukkan Data Dosen ke-%d %n", i + 1);
            System.out.print("Kode          : "); kode = sc.nextLine();
            System.out.print("Nama          : "); nama = sc.nextLine();
            System.out.print("Jenis Kelamin : "); jk = sc.nextLine();
            System.out.print("Usia          : "); usia = sc.nextInt();
            sc.nextLine();

            System.out.println("------------------------------");

            if (jk.equalsIgnoreCase("wanita")) {
                jenisKelamin = false;
            }

            arrayDosen[i] = new Dosen23(kode, nama, jenisKelamin, usia);
        }

        for (Dosen23 dosen : arrayDosen) {
            System.out.println("Data Dosen yang telah dimasukkan:");
            System.out.printf("Kode          : %s %n", dosen.kode);
            System.out.printf("Nama          : %s %n", dosen.nama);
            System.out.printf("Jenis Kelamin : %s %n", (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.printf("Usia          : %d %n", dosen.usia);
            System.out.println("------------------------");
        }

        DataDosen23 dataDosen = new DataDosen23();
        dataDosen.dataSemuaDosen(arrayDosen);
        dataDosen.jumlahDosenPerJenisKelamin(arrayDosen);
        System.out.println("------------------------");
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayDosen);
        System.out.println("------------------------");
        dataDosen.infoDosenPalingTua(arrayDosen);
        System.out.println("------------------------");
        dataDosen.infoDosenPalingMuda(arrayDosen);
        System.out.println("------------------------");
    
    }
}