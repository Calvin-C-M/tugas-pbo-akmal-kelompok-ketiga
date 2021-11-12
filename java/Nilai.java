import java.util.Scanner;

public class Nilai {
    private float nilai;

    Nilai() {
        this.nilai=0;
    }

    Nilai(float nilai) {
        this.nilai=nilai;
    }

    public void input(String penilai) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan nilai " + penilai + ": ");
        this.nilai=Float.parseFloat(input.nextLine());
    }

    public void setNilai(float nilai) {
        this.nilai = nilai;
    }

    public float getNilai() {
        return this.nilai;
    }
}
