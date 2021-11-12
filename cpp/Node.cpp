#include <iostream>
#include "Student.cpp"

using namespace std;

class Node {
    private:
        Student *mahasiswa;
        Node *next;

    public:
        Node() {
            this->mahasiswa=nullptr;
            this->next=nullptr;
        }

        Node(Student *mahasiswa) {
            this->mahasiswa=mahasiswa;
            this->next=nullptr;
        }

        void setMahasiswa(Student *mahasiswa) { this->mahasiswa=mahasiswa; }
        void setNext(Node *next) { this->next=next; }

        Student *getMahasiswa() { return this->mahasiswa; }
        Node *getNext() { return this->next; }
};