import java.util.Scanner;

public class MahasiswaDemo23 {
    public static void main(String[] args) {
        StackTugasMahasiswa23 stack = new StackTugasMahasiswa23(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.print("Pilih : ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa23 mhs = new Mahasiswa23(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;

                case 2:
                    Mahasiswa23 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.nilai = nilai;
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas : " + biner);
                    }
                    break;

                case 3:
                    Mahasiswa23 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;

                case 4:
                    System.out.println("Daftar Semua Tugas");
                    System.out.println("Nama\tNim\tKelas");
                    stack.print();
                    break;

                case 5:
                    Mahasiswa23 bawah = stack.bottom();
                    if (bawah != null) {
                        System.out.println("Tugas terbawah:");
                        System.out.println(bawah.nama + " - " + bawah.nim);
                    } else {
                        System.out.println("Stack masih kosong!");
                    }
                    break;
                case 6:
                    System.out.println("Jumlah tugas terkumpul: " + stack.jumlahTugas());
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }

        } while (pilih >= 1 && pilih <= 4);
        
        scan.close();
    }
}


