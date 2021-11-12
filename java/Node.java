public class Node {
    private Student mahasiswa;
    private Node next;

    Node() {
        this.mahasiswa=new Student();
        this.next=null;
    }

    Node(Student student) {
        this.mahasiswa=student;
        this.next=null;
    }

    public void setMahasiswa(Student mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Student getMahasiswa() {
        return mahasiswa;
    }
    public Node getNext() {
        return next;
    }
}
