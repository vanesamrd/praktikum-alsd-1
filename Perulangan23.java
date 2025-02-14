import java.util.Scanner;

public class Perulangan23 {
    
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
    
            System.out.print("Masukkan NIM : ");
            long nim = input.nextLong();
    
            int duaDigitTerakhir = (int) (nim % 100);
    
            if (duaDigitTerakhir < 10) {
                duaDigitTerakhir += 10;
            }
    
            for (int i = 1; i <= duaDigitTerakhir; i++) {
                if (i != 6 && i != 10) {
                    if (i % 2 == 0) {
                        System.out.print(i + " ");
                    } else {
                        System.out.print("* ");
                    }
                }
            }
        }
    }
    

