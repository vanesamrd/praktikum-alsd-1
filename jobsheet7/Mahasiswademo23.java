package jobsheet7;

import java.util.Scanner;

public class Mahasiswademo23 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi23 list = new MahasiswaBerprestasi23();
        int jumMhs=5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            String ip = sc.nextLine();
            double ipk = Double.parseDouble(ip);
            System.out.println("--------------------------------");
            list.tambah (new mahasiswa223(nim, nama,kelas,ipk));
        }

            //list.tampil();
            //System.out.println("--------------------------------");
            //System.out.println("Pencarian data");
            //System.out.println("--------------------------------");
            //System.out.println("Masukkan ipk mahasiswa yang dicari: ");
            //System.out.println("IPK: ");
            //double cari = sc.nextDouble();

            //System.out.println("menggunakan sequential searching");
            //double posisi = list.sequentialSearching(cari);
            //int pss= (int)posisi;
            //list.tampilPosisi(cari, pss);
            //list.tampilDataSearch(cari, pss);

    
      

        //melakukan data binary
        System.out.println("------------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("------------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari: ");
        System.out.println("IPK: ");
        double cari = sc.nextDouble();
        System.out.println("------------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("------------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2= (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}
