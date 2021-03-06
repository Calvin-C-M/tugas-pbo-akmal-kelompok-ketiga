#include <iostream>
#include "LinkedList.cpp"

using namespace std;

void header() {
    printf("=============================================================================================================================");
    printf("| NPM\t\t| Nama\t\t\t| Nilai Penguji 1 | Nilai Penguji 2 | Nilai Pembimbing | Nilai Sidang | Huruf Mutu |");
    printf("=============================================================================================================================");
}

void menu() {
    printf("===========================\n");
    printf("       NILAI SIDANG        \n");
    printf("===========================\n");
    printf("1. Insert Data (First)\n");
    printf("2. Insert Data (Last)\n");
    printf("3. Delete Data (First)\n");
    printf("4. Delete Data (Last)\n");
    printf("5. Search Mahasiswa\n");
    printf("6. Search Nilai\n");
    printf("7. Search Huruf Mutu\n");
    printf("8. Tampilkan Semua Data\n");
    printf("9. Keluar\n");
    printf("===========================\n");
}

void menuSearchMahasiswa(LinkedList *list) {
    int stringDicari=-1;
    string dataDicari="";

    int pil;
    printf("Cari berdasarkan: ");
    printf("1. Nama");
    printf("2. NPM");
    printf("0. Kembali");
    cout << "Pilihan: "; cin >> pil;

    switch(pil) {
        case 1:
        case 2: stringDicari=pil;
            break;

        case 0: return;

        default:
            printf("Ada kesalahan dalam memilih, silahkan coba lagi");
            break;
    }

    cout << "Masukkan " << stringDicari << ": "; cin >> dataDicari;

    list->searchString(stringDicari, dataDicari);
}

void menuSearchNilai(LinkedList *list) {
    int nilaiDicari=-1;
    float nilai;

    cout << "Nilai yang dicari: "; cin >> nilai;
}

int main() {
    LinkedList *list=new LinkedList();
    Node *newElement=new Node();
    bool programRunning=true;
    while(programRunning) {
        int inMenu;
        menu();
        cout << "Pilihan: "; cin >> inMenu;
        switch(inMenu) {
            case 1:
                printf("===========================");
                newElement=list->createElement();
                list->insertFirst(newElement);
                break;

            case 2:
                printf("===========================");
                newElement=list->createElement();
                list->insertLast(newElement);
                break;

            case 3:
                printf("===========================");
                list->deleteFirst();
                break;

            case 4:
                printf("===========================");
                list->deleteLast();
                break;

            case 5:
                printf("===========================");

                break;

            case 6:
                printf("===========================");
                break;

            case 7:
                printf("===========================");
                break;

            case 8:
                printf("===========================");
                header();
                list->printList();
                printf("===========================");
void header();
void menu();
void menuSearchMahasiswa(LinkedList list);
void menuSearchNilai(LinkedList list);
void menuSearchHurufMutu(LinkedList list);

int main() {
    LinkedList *myNilai = new LinkedList();
    Node *newElement = new Node();
    bool programRunning=true;

    while(programRunning) {
        menu();
        cout << " Pilih : ";
        int inMenu;
        cin >> inMenu;

        switch (inMenu) {
            case 1:
                cout << "===========================" << endl;
                newElement = myNilai->createElement();
                myNilai->insertFirst(newElement);
                break;

            case 2:
                cout << "===========================" << endl;
                newElement = myNilai->createElement();
                myNilai->insertLast(newElement);
                break;

            case 3:
                cout << "===========================" << endl;
                myNilai->deleteFirst();
                break;

            case 4:
                cout << "===========================" << endl;
                myNilai->deleteLast();
                break;

            case 5:
                cout << "===========================" << endl;
                menuSearchMahasiswa(*myNilai);
                break;

            case 6:
                cout << "===========================" << endl;
                menuSearchNilai(*myNilai);
                break;

            case 7:
                cout << "===========================" << endl;
                menuSearchHurufMutu(*myNilai);
                break;

            case 8:
                cout << endl;
                header();
                myNilai->printList();
                cout << "=========================================================================================================================" << endl;
                break;

            case 9:
                programRunning=false;
<<<<<<< HEAD
                break;

            default:
                cout << "Ada kesalahan dalam memilih, silahkan coba lagi";
                system("pause");
                break;
        }
=======
                exit(0);
                break;

            default:
                cout << "Ada kesalahan dalam memilih, silahkan coba lagi" << endl;
                break;
        }
    }
}

void header(){
    cout << "========================================================================================================================="<< endl;
    cout << "| NPM\t\t| Nama\t\t\t| N Penguji 1\t| N Penguji 2\t| N Pembimbing\t| Nilai Sidang\t| Huruf Mutu\t|"<< endl;
    cout << "========================================================================================================================="<< endl;
}

void menu(){
    cout << "===========================" << endl;
    cout << "       NILAI SIDANG" << endl;
    cout << "===========================" << endl;
    cout << " 1. Insert Data (first)" << endl;
    cout << " 2. Insert Data (last)" << endl;
    cout << " 3. Delete Data (first)" << endl;
    cout << " 4. Delete Data (last)" << endl;
    cout << " 5. Search Mahasiswa" << endl;
    cout << " 6. Search Nilai" << endl;
    cout << " 7. Search Huruf Mutu" << endl;
    cout << " 8. Tampil Data" << endl;
    cout << " 9. Keluar" << endl;
    cout << "===========================" << endl;
}

void menuSearchMahasiswa(LinkedList list) {
    int dicari=0;
    string strDicari;
    string dataDicari=" ";

    cout << "Cari berdasarkan: " << endl;;
    cout << "1. Nama" << endl;;
    cout << "2. NPM" << endl;;
    cout << "0. Kembali" << endl;;
    int pil;
    cin >> pil;

    switch(pil) {
        case 1: dicari=1;
            break;

        case 2: dicari=2;
            break;

        case 0: return;

        default:
            cout << "Ada kesalahan dalam memilih" << endl;
            menuSearchMahasiswa(list);
            return;
    }
    if(dicari==1){
        strDicari = "Nama";
    } else if(dicari==2){
        strDicari = "NPM";
    }
    cout << "Masukkan " << strDicari << ": ";
    cin >> dataDicari;


    header();
    list.searchString(dicari, dataDicari);
    cout << "=========================================================================================================================" << endl;
}

void menuSearchNilai(LinkedList list) {
    float nilai;

    cout <<"Nilai yang dicari: ";
    cin >> nilai;
    
    cout <<"Cari berdasarkan: " << endl;
    cout <<"1. Nilai Penguji 1      3. Nilai Pembimbing" << endl;
    cout <<"2. Nilai Penguji 2      4. Nilai Sidang" << endl;
    cout <<"0. Kembali" << endl;
    cout <<"Pilihan: ";
    int nilaiDicari;
    cin >> nilaiDicari;
    if(nilaiDicari>=1 && nilaiDicari<=4){
        header();
        list.searchNilai(nilaiDicari, nilai);
        cout <<"=========================================================================================================================" << endl;
    } else if(nilaiDicari==0){
        return;
    } else{
        cout <<"Ada kesalahan dalam memilih, silahkan kembali ke menu utama" << endl;
        menuSearchNilai(list);
    }
}

void menuSearchHurufMutu(LinkedList list) {
    int nilaiDicari;
    char huruf;

    cout << "Huruf yang dicari: ";
    cin >> huruf;

    cout << "Cari berdasarkan: " << endl;
    cout << "1. Nilai Penguji 1      3. Nilai Pembimbing" << endl;
    cout << "2. Nilai Penguji 2      4. Nilai Sidang" << endl;
    cout << "0. Kembali " << endl;
    cout << "Pilihan: " << endl;
    cin >> nilaiDicari;

    if(nilaiDicari>=1 && nilaiDicari<=4){
        header();
        list.searchHurufMutu(nilaiDicari, huruf);
        cout <<"=========================================================================================================================" << endl;
    } else if(nilaiDicari==0){
        return;
    } else{
        cout <<"Ada kesalahan dalam memilih, silahkan kembali ke menu utama" << endl;
        menuSearchHurufMutu(list);
>>>>>>> c7c850bea0c7b8c887c3457ed4b695ebf44eaa64
    }
}