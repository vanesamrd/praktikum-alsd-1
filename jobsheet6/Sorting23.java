package jobsheet6;

public class Sorting23 {

    int [] data23;
    int jumData23;

    Sorting23 (int data[], int jmlDat) {
        jumData23=jmlDat;
        data23=new int [jmlDat];
        for (int i=0; i<jumData23; i++) {
            data23[i]= data[i];
        }
    } 

    void bubbleSort() {
        int temp = 0;
        for (int i=0; i<jumData23-1; i++){
            for (int j=1; j<jumData23-i; j++) {
                if (data23[j-1]>data23[j]){
                    temp=data23[j];
                    data23[j]=data23[j-1];
                    data23[j-1]=temp;
                }
            }
        }
    }

    void tampil() {
        for (int i=0; i<jumData23; i++) {
            System.out.print(data23[i]+" ");
        }
        System.out.println();
    }

    void SelectionSort(){
        for (int i=0; i<jumData23; i++){
            int min=i;
            for (int j=i+1; j<jumData23; j++){
                if(data23[j]<data23[min]){
                    min=j;
                }
            }
            int temp=data23[i];
            data23[i]=data23[min];
            data23[min]=temp;
        }
    }
    void insertionSort(){
        for (int i=1; i<=data23.length-1; i++){
            int temp=data23[i];
            int j=i-1;
            while (j>=0 && data23[j]>temp){
                data23[j+1]=data23[j];
                j--;
            }
        }
    }
}
