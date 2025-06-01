public class MahasiswaAntri {
    String nama;
    String nim;
    String kelas;

  public MahasiswaAntri(String nama, String nim, String kelas) {
    this.nama = nama;
    this.nim = nim;
    this.kelas = kelas;
  }

  public void tampilInformasi() {
    System.out.println(nama + "\t" + nim + "\t" + kelas);
  }
}
