package jobsheet6;

public class Sorting23 {

    int [] data20;
    int jumData20;

    Sorting23 (int Data[], int jmlDat) {
        jumData20=jmlDat;
        data20=new int [jmlDat];
        for (int i=0; i<jumData20; i++) {
            data20[i]= Data[i];
        }
    } 

    void bubbleSort() {
        int temp = 0;
        for (int i=0; i<jumData20-1; i++){
            for (int j=1; j<jumData20-i; j++) {
                if (data20[j-1]>data20[j]){
                    temp=data20[j];
                    data20[j]=data20[j-1];
                    data20[j-1]=temp;
                }
            }
        }
    }

    void tampil() {
        for (int i=0; i<jumData20; i++) {
            System.out.print(data20[i]+" ");
        }
        System.out.println();
    }
}
