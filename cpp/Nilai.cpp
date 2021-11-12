#include <iostream>
using namespace std;

class Nilai {
    private:
        float nilai;

    public:
        Nilai() {
            this->nilai=0;
        }

        Nilai(float val) {
            this->nilai=val;
        }

        void input(string penilai) {
            cout << "Masukkan nilai " << penilai << ": "; cin >> this->nilai;

        }

        void setNilai(float val) { this->nilai=val; }

        float getNilai() { return this->nilai; }
};