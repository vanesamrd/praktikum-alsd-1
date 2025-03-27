package jobsheet6;

public class DataDosen23 {
    Dosen23[] dataDosen = new Dosen23[10];
    int idx = 0;

    void tambah(Dosen23 dsn){
        if (idx < dataDosen.length){
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data Dosen Sudah penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++){
            dataDosen[i].tampil();
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen23 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIndex].usia) {
                    maxIndex = j;
                }
            }
            Dosen23 temp = dataDosen[maxIndex];
            dataDosen[maxIndex] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }
}
