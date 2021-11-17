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
programRunning=True

while(programRunning) :
    menu()
    inMenu = int(input(" Pilih : "))

    if inMenu==1:
        print("===========================")
        myNilai.insertFirst()

    elif inMenu==2:
        print("===========================")
        myNilai.insertLast()

    elif inMenu==3:
        print("===========================")
        myNilai.deleteFirst()

    elif inMenu==4:
        print("===========================")
        myNilai.deleteLast()

    elif inMenu==5:
        print("===========================")
        menuSearchMahasiswa(myNilai)

    elif inMenu==6:
        print("===========================")
        menuSearchNilai(myNilai)

    elif inMenu==7:
        print("===========================")
        menuSearchHurufMutu(myNilai)

    elif inMenu==8:
        print()
        header()
        myNilai.printList()
        print("=========================================================================================================================")

    elif inMenu==9:
        programRunning=False
        exit(0)

    else:
        print("Ada kesalahan dalam memilih, silahkan coba lagi")