#include <iostream>
#include "Nilai.cpp"
using namespace std;

class Student {
    private:
        string nama;
        string npm;
        Nilai penguji1;
        Nilai penguji2;
        Nilai pembimbing;

    public:
        Student() {
            this->nama="";
            this->npm="";
            this->penguji1=NULL;
            this->penguji2=NULL;
            this->pembimbing=NULL;
        }

        Student(string nama, string npm, Nilai penguji1, Nilai penguji2, Nilai pembimbing) {
            this->nama=nama;
            this->npm=npm;
            this->penguji1=penguji1;
            this->penguji2=penguji2;
            this->pembimbing=pembimbing;
        }

        void setNama(string nama) { this->nama=nama; }
        void setNpm(string npm) { this->npm=npm; }

        string getNama() { return this->nama; }
        string getNpm() { return this->npm; }

        float getNilaiSidang() {
            float nilai1=this->penguji1.getNilai();
            float nilai2=this->penguji2.getNilai();
            float nilai3=this->pembimbing.getNilai();
            return nilai1+nilai2+nilai3;
        }

        char getHurufMutu(float nilai) {
            if(nilai > 80 && nilai <= 100) {
                return 'A';
            } else if(nilai > 70 && nilai <= 80) {
                return 'B';
            } else if(nilai > 60 && nilai <= 70) {
                return 'C';
            }
            return 'T';
        }

        void input() {
            cout << "Masukkan nama: "; cin >> this->nama;
            cout << "Masukkan NPM: "; cin >> this->npm;

            penguji1.input("Penguji 1");
            penguji2.input("Penguji 2");
            pembimbing.input("Pembimbing");
        }

        void print() {
            cout << "\nNama = " << this->nama
                 << "\nNPM = " << this->npm
                 << "\nNilai Penguji 1 = " << this->penguji1.getNilai()
                 << "\nNilai Penguji 2 = " << this->penguji2.getNilai()
                 << "\nNilai Pembimbing = " << this->pembimbing.getNilai()
                 << "\nNilai Sidang = " << this->getNilaiSidang()
                 << "\nHuruf Mutu = " << this->getHurufMutu(this->getNilaiSidang());
        }
};