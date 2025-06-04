import java.util.Scanner;

public class DLLmain23 {
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
      }
    } while
  }
}