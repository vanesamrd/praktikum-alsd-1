public class Mahasiswa23 {
    public String nama;
    public String nim;
    public String kelas;
    public double ipk;

  public Mahasiswa23(String nama, String nim, String kelas, double ipk) {
    this.nama = nama;
    this.nim = nim;
    this.kelas = kelas;
    this.ipk = ipk;
  }

  public void tampil() {
    System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
  }
}
