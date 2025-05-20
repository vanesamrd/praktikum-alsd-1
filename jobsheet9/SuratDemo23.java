import java.util.Scanner;

public class SuratDemo23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackSurat23 stack = new StackSurat23(5);
        int pilih;

        do {
            System.out.println("Pilihan Menu :");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("Pilih : ");
            pilih = input.nextInt();

            switch (pilih) {
                 case 1:
                    System.out.println("Masukkan data Surat Izin");
                    System.out.print("Masukkan ID Surat Izin: ");
                    String idSurat = input.next();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String namaMahasiswa = input.next();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = input.next();
                    System.out.print("Masukkan Jenis Izin: ");
                    char jenisIzin = input.next().charAt(0);
                    if (jenisIzin != 'S' && jenisIzin != 'I') {
                        System.out.println("Jenis Izin tidak valid.");
                        break;
                    }
                    System.out.print("Masukkan Durasi Surat: ");
                    int durasi = input.nextInt();
                    Surat23 surat = new Surat23(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    break;
                case 2:
                    if (stack.IsEmpty()) {
                        System.out.println("Tidak ada Surat Izin yang dikumpulkan.");
                        break;
                    }
                    Surat23 suratDiproses = stack.pop();
                    System.out.println("Memproses Surat Izin Dari " + suratDiproses.namaMahasiswa);
                    suratDiproses.cetakSurat();
                    break;
                case 3:
                    if (stack.IsEmpty()) {
                        System.out.println("Tidak ada Surat Izin yang dikumpulkan.");
                        break;
                    }
                    Surat23 suratTerakhir = stack.peek();
                    System.out.println("Surat Izin Terakhir : " + suratTerakhir.namaMahasiswa);
                    suratTerakhir.cetakSurat();
                    break;
                case 4:
                    System.out.println("Cari Surat Berdasarkan Nama Mahasiswa");
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String cari = input.next();
                    stack.cariSurat(cari);
                    break;
                    default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
