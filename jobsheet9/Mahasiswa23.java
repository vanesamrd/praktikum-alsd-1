public class Mahasiswa23 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    public Mahasiswa23(String nim, String nama, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1; 
    }

    public void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
    
}
