public class Test {
    public static void main(String[] args) {
    System.out.println("=== TEST ANTRIAN ===");

    Antrian antrian = new Antrian(3);

    System.out.println("\n[TEST 1] Tambah Mahasiswa ke Antrian");
    antrian.insert(new MahasiswaAntri("Ani", "123", "1B"));
    antrian.insert(new MahasiswaAntri("Budi", "124", "2A"));
    antrian.print();

    System.out.println("\n[TEST 2] Tampilkan Mahasiswa Terdepan dan Terakhir");
    antrian.tampilTerdepan();
    antrian.tampilTerakhir();

    System.out.println("\n[TEST 3] Cek apakah antrian penuh?");
    System.out.println(antrian.isFull() ? "Antrian penuh" : "Antrian belum penuh");

    System.out.println("\n[TEST 4] Menambahkan mahasiswa untuk memenuhi antrian");
    antrian.insert(new MahasiswaAntri("Citra", "125", "2A"));
    antrian.print();
    System.out.println("Apakah antrian penuh? " + (antrian.isFull() ? "Ya" : "Tidak"));

    System.out.println("\n[TEST 5] Tambah Mahasiswa saat penuh");
    antrian.insert(new MahasiswaAntri("Dina", "126", "1D"));

    System.out.println("\n[TEST 6] Proses (pop) Mahasiswa dari Antrian");
    antrian.pop();
    antrian.print();

    System.out.println("\n[TEST 7] Tampilkan Mahasiswa Terdepan setelah pop");
    antrian.tampilTerdepan();

    System.out.println("\n[TEST 8] Cek ukuran antrian saat ini");
    System.out.println("Jumlah: " + antrian.getCurrentSize());

    System.out.println("\n[TEST 9] Kosongkan antrian");
    antrian.clear();

    System.out.println("\n[TEST 10] Cek apakah antrian kosong?");
    System.out.println(antrian.isEmpty() ? "Antrian kosong" : "Antrian tidak kosong");

    System.out.println("\n[TEST 11] Cetak antrian yang sudah dikosongkan");
    antrian.print();
  }
}
