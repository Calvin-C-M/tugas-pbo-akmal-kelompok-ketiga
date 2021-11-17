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
                break;

            case 9:
                programRunning=false;
                break;

            default:
                cout << "Ada kesalahan dalam memilih, silahkan coba lagi";
                system("pause");
                break;
        }
    }
}