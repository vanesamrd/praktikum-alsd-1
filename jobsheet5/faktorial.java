package jobsheet5;

public class faktorial {
    int faktorialBF(int n){
        int faktor =1;
        int i =1;
        while (i <= n) {
            faktor *= i;
            i++;
        }
        return faktor;
    }

    int faktorialDC(int n){
        if(n==1){
            return 1;
        }else{
            int faktor = n * faktorialDC(n-1);
            return faktor;
        }
    }
}
