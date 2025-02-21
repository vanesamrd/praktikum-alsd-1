package praktikum2;

public class MahasiswaMain23 {
    public static void main(String[] args) {
        Mahasiswa23 mhs1 = new Mahasiswa23();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();
        
        Mahasiswa23 mhs2 = new Mahasiswa23("Annisa Nabila","2141720160", 3.25,"TI 2L");
        mhs2.updateIpk(5);
        mhs2.tampilkanInformasi();
        
        Mahasiswa23 mhsVanesa = new Mahasiswa23("Vanesa Mardiana Putri", "242107020129", 3.90, "TI 1B");
        mhsVanesa.tampilkanInformasi();

    }
}
