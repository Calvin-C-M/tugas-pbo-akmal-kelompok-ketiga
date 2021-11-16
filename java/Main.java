import java.util.Scanner;

public class Main {
    public static Scanner input=new Scanner(System.in);

    public static void header(){
        System.out.println("=============================================================================================================================");
        System.out.println("| NPM\t\t| Nama\t\t\t| Nilai Penguji 1 | Nilai Penguji 2 | Nilai Pembimbing | Nilai Sidang | Huruf Mutu |");
        System.out.println("=============================================================================================================================");
    }

    public static void menu(){
        System.out.println("===========================");
        System.out.println("       NILAI SIDANG");
        System.out.println("===========================");
        System.out.println(" 1. Insert Data (first)");
        System.out.println(" 2. Insert Data (last)");
        System.out.println(" 3. Delete Data (first)");
        System.out.println(" 4. Delete Data (last)");
        System.out.println(" 5. Search Mahasiswa");
        System.out.println(" 6. Search Nilai");
        System.out.println(" 7. Search Huruf Mutu");
        System.out.println(" 8. Tampil Data");
        System.out.println(" 9. Keluar");
        System.out.println("===========================");
        System.out.print(" Pilih : ");
    }

    public static void backToMenu(){
        System.out.println("===========================");
        System.out.println(" Kembali ke menu?");
        System.out.println(" 1. Yes");
        System.out.println(" 2. No");
        System.out.println("===========================");
        System.out.print(" Pilih : ");
        int pilih = input.nextInt();
        if(pilih == 1){
            //continue ;
        } else {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        LinkedList myNilai = new LinkedList();
        Element newElement = new Element();
        int inMenu, inBack;
        menu();
        inMenu = input.nextInt();

        switch (inMenu) {
            case 1:
                System.out.println("===========================");
                newElement = myNilai.createElmt();
                myNilai.insertFirst(newElement);
                backToMenu();
                break;

            case 2:
                System.out.println("===========================");
                newElement = myNilai.createElmt();
                myNilai.insertLast(newElement);
                backToMenu();
                break;

            case 3:
                System.out.println("===========================");
                myNilai.deleteFirst();
                backToMenu();
                break;

            case 4:
                System.out.println("===========================");
                myNilai.deleteLast();
                backToMenu();
                break;

            case 5:
                System.out.println("===========================");
                System.out.print("Cari mahasiswa dengan Nama/NPM : ");
                String mhs = input.nextLine();
                System.out.print("Masukkan " + mhs + " : ");
                String data = input.nextLine();
                header();
                myNilai.searchString(mhs, data);
                backToMenu();
                break;

            case 6:
                System.out.println("===========================");
                System.out.print("Cari nilai apa : ");
                String jns = input.nextLine();
                System.out.print("Masukkan nilai " + jns + " : ");
                float nilai = input.nextFloat();
                header();
                myNilai.searchNilai(jns, nilai);
                backToMenu();
                break;

            case 7:
                System.out.println("===========================");
                System.out.print("Masukkan huruf : ");
                char huruf = input.next().charAt(0);
                header();
                myNilai.searchNilai("Huruf Mutu", huruf);
                backToMenu();
                break;

            case 8:
                System.out.println();
                header();
                myNilai.printList();
                System.out.println("=============================================================================================================================");
                backToMenu();
                break;

            case 9:
                System.exit(0);
                break;

            default:
                break;
        }
    }
}