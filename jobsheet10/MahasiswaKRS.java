package jobsheet10;

public class MahasiswaKRS {
     String nim;
    String nama;
    String prodi;
    String kelas;

    public MahasiswaKRS(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }   

    public String tampilkanData() {
        return nim + " - " + nama + " - " + prodi + " - " + kelas;
    }
}
