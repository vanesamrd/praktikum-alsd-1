public class StackSurat23 {
    Surat23[] stack;
    int top, size;

    public StackSurat23(int size) {
        this.size = size;
        stack = new Surat23[size];
        top = -1;
    }

    public boolean IsEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean IsFull() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat23 surat) {
        if (!IsFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Isi Stack Penuh! Tidak bisa menambahkan data lagi");
        }
    }

    public Surat23 pop() {
        if (!IsEmpty()) {
            Surat23 n = stack[top];
            top--;
            return n;
        } else {
            System.out.println("Stack masih kosong! Tidak ada surat yang bisa diverifikasi");
            return null;
        }
    }

    public Surat23 peek() {
        if (!IsEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack masih kosong! Tidak ada surat yang dikumpulkan");
            return null;
        }
    }

     public void cariSurat(String cari) {
        if (IsEmpty()) {
            System.out.println("Stack kosong! Tidak ada surat yang dikumpulkan.");
            return;
        } else {
            boolean found = false;
            for (int i = 0; i <= top; i++) {
                if (stack[i].namaMahasiswa.equalsIgnoreCase(cari)) {
                System.out.println(
                    "--------------------------------------------------------------------------------");
                System.out.println("Surat yang ditemukan: " + stack[i].namaMahasiswa);
                stack[i].cetakSurat();
                found = true;
                }
            }
            if (!found) {
                System.out.printf("Surat dengan nama %s tidak ditemukan.", cari);
            }
        }
    }
}
