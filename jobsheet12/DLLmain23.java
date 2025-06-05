import java.util.Scanner;

public class DLLmain23 {
    static Mahasiswa23 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = scan.nextDouble();
        return new Mahasiswa23(nama, nim, kelas, ipk);
    }
  public static void main(String[] args) {
    DoubleLinkedList23 list = new DoubleLinkedList23();
    Scanner scan = new Scanner(System.in);
    int pilihan;

    do {
      System.out.println("\nMenu Double Linked List Mahasiswa");
      System.out.println("1 Tambah berdasarkan index");
      System.out.println("2. Tambah di awal");
      System.out.println("3. Tambah di akhir");
      System.out.println("4. Hapus di awal");
      System.out.println("5. Hapus di akhir");
      System.out.println("6. Tampilkan data");
      System.out.println("7. Cari mahasiswa berdasarkan NIM");
      System.out.println("0. Keluar");
      System.out.print("Pilih Menu : ");
      pilihan = scan.nextInt();
      scan.nextLine();
        
      switch (pilihan) {
        case 1 -> {
            Mahasiswa23 mhs = inputMahasiswa(scan);
            list.addFirst(mhs);
        }
        case 2 -> {
            Mahasiswa23 mhs = inputMahasiswa(scan);
            list.addLast(mhs);
        }
        case 3 -> list.removeFirst();
        case 4 -> list.removeLast();
        case 5 -> list.print();
        case 6 -> {
            System.out.print("Masukkan NIM yang dicari: ");
            String nim = scan.nextLine();
            Node23 found = list.search(nim);
            if (found != null) {
                System.out.println("Data ditemukan:");
                found.data.tampil();
            } else {
                System.out.println("Data tidak ditemukan.");
            }
        }
        case 7 -> {
            System.out.print("Masukkan NIM: ");
            String kyeNim = scan.nextLine();
            Mahasiswa23 mhs = inputMahasiswa(scan);
            list.insertAfter(kyeNim, mhs);
        }
      }
      
    } while(pilihan !=0);
    scan.close();
  }
}