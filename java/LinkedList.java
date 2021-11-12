public class LinkedList {
    Node head;

    LinkedList() {
        this.head=null;
    }

    LinkedList(Node head) {
        this.head=head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
    
    public Node getHead() {
        return head;
    }

    public void insertFirst() {
        Node newElement=new Node();
        newElement.getMahasiswa().input();

        if(this.head==null) {
            this.head=newElement;
        } else {
            newElement.setNext(this.head);
            this.head=newElement;
        }
    }

    public void insertLast() {
        Node newElement=new Node();
        newElement.getMahasiswa().input();

        if(this.head==null) {
            this.head=newElement;
        } else {
            Node curr=this.head;
            while(curr.getNext() != null) {
                curr=curr.getNext();
            }
            curr.setNext(newElement);
        }
    }

    public void deleteFirst() {
        Node del=null;
        del=this.head;
        this.head=this.head.getNext();
    }

    public void deleteLast() {
        Node del=null;
        Node curr=this.head;
        while(curr.getNext().getNext() != null) {
            curr=curr.getNext();
        }
        del=curr.getNext();
        curr.setNext(null);
    }

    public void printList() {
        Node curr=this.head;
        while(curr != null) {
            curr.getMahasiswa().print();
            curr=curr.getNext();
        }
    }
}
