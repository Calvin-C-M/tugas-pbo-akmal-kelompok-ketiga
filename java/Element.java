public class Element {
    private Student mahasiswa;
    private Element next;

    Element() {
        this.mahasiswa=new Student();
        this.next=null;
    }

    Element(Student student) {
        this.mahasiswa=student;
        this.next=null;
    }

    public void setMahasiswa(Student mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public Student getMahasiswa() {
        return mahasiswa;
    }
    public Element getNext() {
        return next;
    }
}
