# ANGGOTA KELOMPOK:
# - Naufal Fahrezi            (140810200035)
# - Amalia Nur Fitri          (140810200045)
# - Calvin Calfi Montolalu    (140810200053)
# - Deani Puteri Virdiana     (140810200059)

from LinkedList import LinkedList
from Node import Node

def header() :
    print("=========================================================================================================================")
    print("| NPM\t\t| Nama\t\t\t| N Penguji 1\t| N Penguji 2\t| N Pembimbing\t| Nilai Sidang\t| Huruf Mutu\t|")
    print("=========================================================================================================================")

def menu() :
    print("===========================")
    print("       NILAI SIDANG")
    print("===========================")
    print(" 1. Insert Data (first)")
    print(" 2. Insert Data (last)")
    print(" 3. Delete Data (first)")
    print(" 4. Delete Data (last)")
    print(" 5. Search Mahasiswa")
    print(" 6. Search Nilai")
    print(" 7. Search Huruf Mutu")
    print(" 8. Tampil Data")
    print(" 9. Keluar")
    print("===========================")

def menuSearchMahasiswa(list) :
    stringDicari=" "
    dataDicari=" "

    print("Cari berdasarkan: ")
    print("1. Nama")
    print("2. NPM")
    print("0. Kembali")
    pil=int(input())

    if pil==1 : stringDicari="Nama"
    elif pil==2 : stringDicari="NPM"
    elif pil==0 : return
    else :
        print("Ada kesalahan dalam memilih")
        menuSearchMahasiswa(list)
        return
    
    dataDicari=input("Masukkan " + stringDicari + ": ")

    header()
    list.searchString(stringDicari, dataDicari)
    print("=========================================================================================================================")

def menuSearchNilai(list) :
    nilaiDicari=""

    nilai=float(input("Nilai yang dicari: "))
    
    print("Cari berdasarkan: ")
    print("1. Nilai Penguji 1      3. Nilai Pembimbing")
    print("2. Nilai Penguji 2      4. Nilai Sidang")
    print("0. Kembali")
    pil=int(input("Pilihan: "))
    if pil==1 : nilaiDicari="Penguji 1"
    elif pil==2 : nilaiDicari="Penguji 2"
    elif pil==3 : nilaiDicari="Pembimbing"
    elif pil==4 : nilaiDicari="Nilai Sidang"
    elif pil==0 : return
    else :
        print("Ada kesalahan dalam memilih, silahkan kembali ke menu utama")
        menuSearchNilai(list)
    header()
    list.searchNilai(nilaiDicari, nilai)
    print("=========================================================================================================================")

def menuSearchHurufMutu(list) :
    nilaiDicari=""

    huruf=input("Huruf yang dicari: ")

    print("Cari berdasarkan: ")
    print("1. Nilai Penguji 1      3. Nilai Pembimbing")
    print("2. Nilai Penguji 2      4. Nilai Sidang")
    print("0. Kembali ")
    pil=int(input("Pilihan: "))

    if pil==1 : nilaiDicari="Penguji 1"
    elif pil==2 : nilaiDicari="Penguji 2"
    elif pil==3 : nilaiDicari="Pembimbing"
    elif pil==4 : nilaiDicari="Nilai Sidang"
    elif pil==0 : return
    else :
        print("Ada yang salah dalam memilih, silahkan coba lagi")
        menuSearchHurufMutu(list)

    header()
    list.searchHurufMutu(nilaiDicari, huruf)
    print("=========================================================================================================================")

myNilai = LinkedList()
newElement = Node()
programRunning=bool(1)

while(programRunning) :
    menu()
    inMenu = int(input(" Pilih : "))

    def switch (inMenu) {
        case 1:
            System.out.println("===========================")
            newElement = myNilai.createElement()
            myNilai.insertFirst(newElement)
            break

        case 2:
            System.out.println("===========================")
            newElement = myNilai.createElement()
            myNilai.insertLast(newElement)
            break

        case 3:
            System.out.println("===========================")
            myNilai.deleteFirst()
            break

        case 4:
            System.out.println("===========================")
            myNilai.deleteLast()
            break

        case 5:
            System.out.println("===========================")
            menuSearchMahasiswa(myNilai)
            break

        case 6:
            System.out.println("===========================")
            menuSearchNilai(myNilai)
            break

        case 7:
            System.out.println("===========================")
            menuSearchHurufMutu(myNilai)
            break

        case 8:
            System.out.println()
            header()
            myNilai.printList()
            System.out.println("=========================================================================================================================")
            break

        case 9:
            programRunning=false
            System.exit(0)
            break

        default:
            System.out.println("Ada kesalahan dalam memilih, silahkan coba lagi")
            break
    }
}