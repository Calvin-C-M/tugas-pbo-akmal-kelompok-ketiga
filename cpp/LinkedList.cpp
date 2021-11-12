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

        void insertFirst() {
            Node *newElement=new Node();
            newElement->getMahasiswa()->input();

            if(this->head==nullptr) {
                this->head=newElement;
            } else {
                newElement->setNext(this->head);
                this->head=newElement;
            }
        }

        void insertLast() {
            Node *newElement=new Node();
            newElement->getMahasiswa()->input();

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
};