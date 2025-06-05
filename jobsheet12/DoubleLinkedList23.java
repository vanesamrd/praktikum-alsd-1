public class DoubleLinkedList23 {
    Node23 head;
    Node23 tail;

  public DoubleLinkedList23() {
    this.head = null;
    this.tail = null;
  }

  public boolean isEmpty() {
    return head == null;
  }

  public void addFirst(Mahasiswa23 data) {
    Node23 newNode = new Node23(data);
    if (isEmpty()) {
        head = tail = newNode;
    } else {
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
  }

  public void addLast(Mahasiswa23 data) {
    Node23 newNode = new Node23(data);
    if (isEmpty()) {
        head = tail = newNode;
    } else {
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
  }

  public void insertAfter(String keyNim, Mahasiswa23 data) {
    Node23 current = head;

    while (current != null && !current.data.nim.equals(keyNim)) {
        current = current.next;
    }

    if (current == null) {
        System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
        return;
    }

    Node23 newNode = new Node23(data);

    if (current == tail) {
        current.next = newNode;
        newNode.prev = current;
        tail = newNode;
    } else {
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
    }

    System.out.println("Node Berhasil disisipkan setelah NIM " + keyNim);
  }

  public void print() {
    if (isEmpty()) {
        System.out.println("Linked List Kosong");
    } else {
        Node23 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }    
  }

   public void  removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus");
        }
        if (head == tail) {
            Mahasiswa23 data = head.data;
            head = tail = null;
        } else {
            Mahasiswa23 data = head.data;
            head = head.next;
            head.prev = null;            
        }
    }
  
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus");
        } 
        if (head == tail) {
            Mahasiswa23 data = tail.data;
            head = tail = null;
        } else {
            Mahasiswa23 data = tail.data;
            tail = tail.prev;
            tail.next = null;
        }
    }

   public Node23 search(String nim) {
        Node23 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current; 
            }
            current = current.next;
        }
        return null; 
    }

}