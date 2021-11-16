import java.util.Scanner;

public class Student {
    private String nama;
    private String npm;
    private Nilai penguji1;
    private Nilai penguji2;
    private Nilai pembimbing;

    Student() {
        this.nama="";
        this.npm="";
        this.penguji1=new Nilai();
        this.penguji2=new Nilai();
        this.pembimbing=new Nilai();
    }

    Student(String nama, String npm, Nilai penguji1, Nilai penguji2, Nilai pembimbing) {
        this.nama=nama;
        this.npm=npm;
        this.penguji1=penguji1;
        this.penguji2=penguji2;
        this.pembimbing=pembimbing;
    }

    public void input() {
        Scanner input=new Scanner(System.in);

        System.out.print("Masukkan nama\t\t\t: ");
        this.nama=input.nextLine();

        System.out.print("Masukkan npm\t\t\t: ");
        this.npm=input.nextLine();

        penguji1.input("Penguji 1");
        penguji2.input("Penguji 2");
        pembimbing.input("Pembimbing");
    }

    void print() {
        System.out.print("| " + this.npm + "\t");
        System.out.print("| " + this.nama + "\t");
        System.out.print("| " + this.penguji1.getNilai() + "\t");
        System.out.print("| " + this.penguji2.getNilai() + "\t");
        System.out.print("| " + this.pembimbing.getNilai() + "\t");
        System.out.print("| " + this.getNilaiSidang().getNilai() + "\t");
        System.out.print("| " + this.getHurufMutu(this.getNilaiSidang().getNilai()) + " |");
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public void setPenguji1(Nilai penguji1) {
        this.penguji1 = penguji1;
    }

    public void setPenguji2(Nilai penguji2) {
        this.penguji2 = penguji2;
    }
    
    public void setPembimbing(Nilai pembimbing) {
        this.pembimbing = pembimbing;
    }

    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public Nilai getPenguji1() {
        return penguji1;
    }

    public Nilai getPenguji2() {
        return penguji2;
    }

    public Nilai getPembimbing() {
        return pembimbing;
    }

    public Nilai getNilaiSidang() {
        float nilai1=this.penguji1.getNilai();
        float nilai2=this.penguji2.getNilai();
        float nilai3=this.pembimbing.getNilai();
        Nilai sidang=new Nilai(nilai1+nilai2+nilai3);
        return sidang;
    }

    public char getHurufMutu(float nilai) {
        if(nilai > 80 && nilai <= 100) {
            return 'A';
        } else if(nilai > 70 && nilai <= 80) {
            return 'B';
        } else if(nilai > 60 && nilai <= 70) {
            return 'C';
        }
        return 'T';
    }
}
