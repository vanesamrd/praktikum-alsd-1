public class NodeMahasiswa {
    MahasiswaAntri data;
    NodeMahasiswa next;

  public NodeMahasiswa() {}

  public NodeMahasiswa(MahasiswaAntri data, NodeMahasiswa next) {
    this.data = data;
    this.next = next;
  }
}
