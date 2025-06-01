import java.util.Scanner;

public class SLLMain23 {
     public static void main(String[] args) {
        SingleLinkedList23 sll = new SingleLinkedList23();
        Mahasiswa23 mhs1 = new Mahasiswa23("24212200","Alvaro", "1A", 4.0);
        Mahasiswa23 mhs2 = new Mahasiswa23("23212201","Bimon", "2B", 3.8);
        Mahasiswa23 mhs3 = new Mahasiswa23("22212202","Cintia", "3C", 3.5);
        Mahasiswa23 mhs4 = new Mahasiswa23("21212203","Dirga", "4D", 3.6);

        //Percobaan 1
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
        System.out.println();

        //Percobaan 2
        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

        //Pertanyaan percobaan 1
        Scanner sc = new Scanner(System.in);
        String jawab = "";
        do {
           System.out.println("Seluruh Data: ");
           sll.print();
           System.out.print("Apakah ingin menambah data baru?: ");
           jawab = sc.nextLine();

           System.out.print("Masukkan Nama Mahasiswa : ");
           String nama = sc.nextLine();
           System.out.print("Masukkan NIM Mahasiswa : ");
           String nim = sc.nextLine();
            System.out.print("Masukkan Kelas Mahasiswa : ");
            String kelas = sc.nextLine();
            System.out.print("Masukkan IPK Mahasiswa : ");
            double ipk = sc.nextDouble();

            Mahasiswa23 mhs = new Mahasiswa23(nim, nama, kelas, ipk);

            System.out.println();
            System.out.println("Silahkan pilih menu: ");
            System.out.println("1. Menambahkan data Diawal");
            System.out.println("2. Menambahkan data Setelah Nama Tertentu");
            System.out.println("3. Menambahkan data di Index tertentu");
            System.out.println("4. Menambahkan data di Akhir");
            System.out.print("Masukkan Pilihanmu : ");
            int jwbnMenu = sc.nextInt();
            sc.nextLine();
            switch (jwbnMenu) {
                case 1:
                    sll.addFirst(mhs);
                    sll.print();
                    break;
                case 2:
                    System.out.print("Masukkan Nama yang ingin di cari : ");
                    String dicari = sc.nextLine();
                    sll.insertAfter(dicari, mhs);
                    sll.print();
                    break;
                case 3: 
                    System.out.print("Masukkan Index tempat : ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    sll.insertAt(index, mhs);
                    sll.print();
                    break;
                case 4:
                    sll.addLast(mhs);
                    sll.print();
                    break;
                default:
                    break;
            }
        } while (jawab.equalsIgnoreCase("ya") || jawab.equalsIgnoreCase("y"));
    }
}

