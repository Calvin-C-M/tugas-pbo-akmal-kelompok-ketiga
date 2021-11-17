#include <iostream>
#include "Node.cpp"

using namespace std;

class LinkedList {
    private:
        Node *head;

    public:
        LinkedList() {
            this->head=nullptr;
        }

        LinkedList(Node *head) {
            this->head=head;
        }

        void setHead(Node *head) { this->head=head; }

        Node *getHead() { return this->head; }

        Node *createElement() {
            Node *newElement=new Node();
            newElement->getMahasiswa()->input();
            return newElement;
        }

        Node *createElement(Student *mhs) {
            Node *newElement=new Node(mhs);
            return newElement;
        }

        void insertFirst(Node *newElement) {
            if(this->head==nullptr) {
                this->head=newElement;
            } else {
                newElement->setNext(this->head);
                this->head=newElement;
            }
        }

        void insertLast(Node *newElement) {
            if(this->head==nullptr) {
                this->head=newElement;
            } else {
                Node *curr=this->head;
                while(curr->getNext() != nullptr) {
                    curr=curr->getNext();
                }
                curr->setNext(newElement);
            }
        }

        void deleteFirst() {
            Node *del=new Node();
            del=this->head;
            this->head=this->head->getNext();
            delete del;
        }

        void deleteLast() {
            Node *del=new Node();
            Node *curr=this->head;
            while(curr->getNext()->getNext() != nullptr) {
                curr=curr->getNext();
            }
            del=curr->getNext();
            curr->setNext(nullptr);
            delete del;
        }

        void printList() {
            Node *curr=this->head;
            while(curr != nullptr) {
                curr->getMahasiswa()->print();
                curr=curr->getNext();
            }
        }

        void searchString(int cari, string data) {
            /*

            cari = 1; Mencari Nama
            cari = 2; Mencari NPM

            */

            bool found=false;
            Node *curr=this->head;
            string dicari="";
            while(curr != nullptr) {
                switch(cari) {
                    case 1 : dicari=curr->getMahasiswa()->getNama();
                        break;
                    case 2 : dicari=curr->getMahasiswa()->getNpm();
                        break;
                }

                if(dicari==data) {
                    found=true;
                    curr->getMahasiswa()->print();
                }

                curr=curr->getNext();
            }

            if(!found) {
                cout << "Data yang anda cari tidak dapat ditemukan" << endl;
            }
        }

        void searchNilai(int cari, float nilai) {
            /*
            
            cari = 1; Mencari nilai penguji 1
            cari = 2; Mencari nilai penguji 2
            cari = 3; Mencari nilai pembimbing
            cari = 4; Mencari nilai sidang

            */

            bool found=false;
            Node *curr=this->head;
            float dicari=0;

            while(curr != nullptr) {
                switch(cari) {
                    case 1 : dicari=curr->getMahasiswa()->getPenguji1().getNilai();
                        break;
                    case 2 : dicari=curr->getMahasiswa()->getPenguji2().getNilai();
                        break;
                    case 3 : dicari=curr->getMahasiswa()->getPembimbing().getNilai();
                        break;
                    case 4 : dicari=curr->getMahasiswa()->getNilaiSidang().getNilai();
                        break;
                }

                if(dicari==nilai) {
                    found=true;
                    curr->getMahasiswa()->print();
                }

                curr=curr->getNext();
            }

            if(!found) {
                cout << "Data yang anda cari tidak dapat ditemukan" << endl;
            }
        }

        void searchHurufMutu(int cari, char karakter) {
            /*

            cari = 1; Mencari huruf mutu

            */
            bool found=false;
            Node *curr=this->head;
            char dicari='A';

            while(curr != nullptr) {
                switch(cari) {
                    case 1 : dicari=curr->getMahasiswa()->getHurufMutu(curr->getMahasiswa()->getNilaiSidang().getNilai());
                        break;
                }

                if(dicari==karakter) {
                    found=true;
                    curr->getMahasiswa()->print();
                }

                curr=curr->getNext();
            }

            if(!found) {
                cout << "Data yang anda cari tidak dapat ditemukan" << endl;
            }
        }
};