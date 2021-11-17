import java.util.Scanner;

public class Main {
    public static Scanner input=new Scanner(System.in);

    public static void header(){
        System.out.println("=========================================================================================================================");
        System.out.println("| NPM\t\t| Nama\t\t\t| N Penguji 1\t| N Penguji 2\t| N Pembimbing\t| Nilai Sidang\t| Huruf Mutu\t|");
        System.out.println("=========================================================================================================================");
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
    }

    public static void menuSearchMahasiswa(LinkedList list) {
        String stringDicari=" ";
        String dataDicari=" ";

        System.out.println("Cari berdasarkan: ");
        System.out.println("1. Nama");
        System.out.println("2. NPM");
        System.out.println("0. Kembali");
        int pil=input.nextInt();

        switch(pil) {
            case 1: stringDicari="Nama";
                break;

            case 2: stringDicari="NPM";
                break;

            case 0: return;

            default:
                System.out.println("Ada kesalahan dalam memilih");
                menuSearchMahasiswa(list);
                return;
        }
        
        System.out.print("Masukkan " + stringDicari + ": ");
        dataDicari=input.nextLine(); //gak muncul inputan (keskip)


        header();
        list.searchString(stringDicari, dataDicari);
        System.out.println("=========================================================================================================================");
    }

    public static void menuSearchNilai(LinkedList list) {
        String nilaiDicari="";

        System.out.print("Nilai yang dicari: ");
        float nilai=input.nextFloat();
        
        System.out.println("Cari berdasarkan: ");
        System.out.println("1. Nilai Penguji 1      3. Nilai Pembimbing");
        System.out.println("2. Nilai Penguji 2      4. Nilai Sidang");
        System.out.println("0. Kembali");
        System.out.print("Pilihan: ");
        int pil=input.nextInt();
        switch(pil) {
            case 1: nilaiDicari="Penguji 1";
                break;

            case 2: nilaiDicari="Penguji 2";
                break;

            case 3: nilaiDicari="Pembimbing";
                break;

            case 4: nilaiDicari="Nilai Sidang";
                break;

            case 0: return;

            default:
                System.out.println("Ada kesalahan dalam memilih, silahkan kembali ke menu utama");
                menuSearchNilai(list);
                break;
        }
        header();
        list.searchNilai(nilaiDicari, nilai);
        System.out.println("=========================================================================================================================");
    }

    public static void menuSearchHurufMutu(LinkedList list) {
        String nilaiDicari="";

        System.out.print("Huruf yang dicari: ");
        char huruf=input.next().charAt(0);

        System.out.println("Cari berdasarkan: ");
        System.out.println("1. Nilai Penguji 1      3. Nilai Pembimbing");
        System.out.println("2. Nilai Penguji 2      4. Nilai Sidang");
        System.out.println("0. Kembali ");
        System.out.print("Pilihan: ");
        int pil=input.nextInt();

        switch(pil) {
            case 1: nilaiDicari="Nilai Penguji 1";
                break;

            case 2: nilaiDicari="Nilai Penguji 2";
                break;

            case 3: nilaiDicari="Nilai Pembimbing";
                break;

            case 4: nilaiDicari="Nilai Sidang";
                break;

            case 0: return;

            default:
                System.out.println("Ada yang salah dalam memilih, silahkan coba lagi");
                menuSearchHurufMutu(list);
                break;
        }

        header();
        list.searchHurufMutu(nilaiDicari, huruf);
        System.out.println("=========================================================================================================================");
    }

    public static void main(String[] args) {
        LinkedList myNilai = new LinkedList();
        Element newElement = new Element();
        boolean programRunning=true;

        while(programRunning) {
            menu();
            System.out.print(" Pilih : ");
            int inMenu = input.nextInt();

            switch (inMenu) {
                case 1:
                    System.out.println("===========================");
                    newElement = myNilai.createElement();
                    myNilai.insertFirst(newElement);
                    break;

                case 2:
                    System.out.println("===========================");
                    newElement = myNilai.createElement();
                    myNilai.insertLast(newElement);
                    break;

                case 3:
                    System.out.println("===========================");
                    myNilai.deleteFirst();
                    break;

                case 4:
                    System.out.println("===========================");
                    myNilai.deleteLast();
                    break;

                case 5:
                    System.out.println("===========================");
                    menuSearchMahasiswa(myNilai);
                    break;

                case 6:
                    System.out.println("===========================");
                    menuSearchNilai(myNilai);
                    break;

                case 7:
                    System.out.println("===========================");
                    menuSearchHurufMutu(myNilai);
                    break;

                case 8:
                    System.out.println();
                    header();
                    myNilai.printList();
                    System.out.println("=========================================================================================================================");
                    break;

                case 9:
                    programRunning=false;
                    System.exit(0);
                    break;

                default:
                    System.out.println("Ada kesalahan dalam memilih, silahkan coba lagi");
                    break;
            }
        }
    }
}