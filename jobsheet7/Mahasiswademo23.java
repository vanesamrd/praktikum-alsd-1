package jobsheet7;

import java.util.Scanner;

public class Mahasiswademo23 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi23 list = new MahasiswaBerprestasi23();
    
        mahasiswa223 m1 = new mahasiswa223 ("123", "Zidan", "2A", 3.2);
        mahasiswa223 m2 = new mahasiswa223 ("124", "Ayu", "2A", 3.5);
        mahasiswa223 m3 = new mahasiswa223 ("125", "Sofi", "2A", 3.1);
        mahasiswa223 m4 = new mahasiswa223 ("126", "Sita", "2A", 3.9);
        mahasiswa223 m5 = new mahasiswa223 ("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa Belum Sorting");
        list.tampil();
        System.out.println("Data Mahasiswa Setelah Sorting Berdasarkan IPK (DESC)");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.SelectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();


    }
}

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
        list.tampilDataSearch(cari, pss2);
    }
}
