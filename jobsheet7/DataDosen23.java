package jobsheet7;
import java.util.Scanner;

public class DataDosen23 {
    Dosen23[] dataDosen = new Dosen23[10];
    int idx = 0;

    void tambah(Dosen23 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data Dosen Sudah penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen23 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIndex].usia) {
                    maxIndex = j;
                }
            }
            Dosen23 temp = dataDosen[maxIndex];
            dataDosen[maxIndex] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }

    void PencarianDataSequential23() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama dosen yang ingin dicari: ");
        String nama = input.nextLine();
        
        boolean found = false;
        int count = 0;
        
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equals(nama)) {
                found = true;
                count++;
                System.out.println("Dosen ditemukan!");
                System.out.println("Kode: " + dataDosen[i].kode);
                System.out.println("Nama: " + dataDosen[i].nama);
                System.out.println("Jenis Kelamin: " + dataDosen[i].jenisKelamin);
                System.out.println("Usia: " + dataDosen[i].usia);
                System.out.println("---------------------");
            }
        }

        if (!found) {
            System.out.println("Dosen dengan nama " + nama + " tidak ditemukan.");
        } else if (count > 1) {
            System.out.println("Peringatan! Ditemukan " + count + " dosen dengan nama " + nama + ".");
        }
    }

    void PencarianDataBinary23() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama dosen yang ingin dicari: ");
        String nama = input.nextLine();
        
        
        sortingASC();
        
        int left = 0;
        int right = idx - 1;
        boolean found = false;
        int count = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compare = dataDosen[mid].nama.compareTo(nama);
            
            if (compare == 0) {
                found = true;
                count++;
                
               
                System.out.println("Dosen ditemukan!");
                System.out.println("Kode: " + dataDosen[mid].kode);
                System.out.println("Nama: " + dataDosen[mid].nama);
                System.out.println("Jenis Kelamin: " + dataDosen[mid].jenisKelamin);
                System.out.println("Usia: " + dataDosen[mid].usia);
                System.out.println("---------------------");
                
        
                int temp = mid - 1;
                while (temp >= left && dataDosen[temp].nama.equals(nama)) {
                    count++;
                    System.out.println("Dosen ditemukan!");
                    System.out.println("Kode: " + dataDosen[temp].kode);
                    System.out.println("Nama: " + dataDosen[temp].nama);
                    System.out.println("Jenis Kelamin: " + dataDosen[temp].jenisKelamin);
                    System.out.println("Usia: " + dataDosen[temp].usia);
                    System.out.println("---------------------");
                    temp--;
                }
                
 
                temp = mid + 1;
                while (temp <= right && dataDosen[temp].nama.equals(nama)) {
                    count++;
                    System.out.println("Dosen ditemukan!");
                    System.out.println("Kode: " + dataDosen[temp].kode);
                    System.out.println("Nama: " + dataDosen[temp].nama);
                    System.out.println("Jenis Kelamin: " + dataDosen[temp].jenisKelamin);
                    System.out.println("Usia: " + dataDosen[temp].usia);
                    System.out.println("---------------------");
                    temp++;
                }
                break;
            } else if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Dosen dengan nama " + nama + " tidak ditemukan.");
        } else if (count > 1) {
            System.out.println("Peringatan! Ditemukan " + count + " dosen dengan nama " + nama + ".");
        }
    }
}
