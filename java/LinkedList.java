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
    
    public void searchString(String cari, String data) {
        boolean found=false;
        Node curr=this.head;
        String dicari=new String();

        while(curr != null) {
            switch(cari) {
                case "Nama" : dicari=curr.getMahasiswa().getNama();
                case "NPM" : dicari=curr.getMahasiswa().getNpm();
            }

            if(dicari==data) {
                found=true;
                curr.getMahasiswa().print();
            }

            curr=curr.getNext();
        }

        if(!found) {
            System.out.println("Data tidak ada yang ditemukan");
        }
    }

    public void searchNilai(String cari, float nilai) {
        boolean found=false;
        Node curr=this.head;
        float dicari=0;
        
        while(curr != null) {
            switch(cari) {
                case "Penguji 1" : dicari=curr.getMahasiswa().getPenguji1().getNilai();
                case "Penguji 2" : dicari=curr.getMahasiswa().getPenguji2().getNilai();
                case "Pembimbing" : dicari=curr.getMahasiswa().getPembimbing().getNilai();
                case "Nilai Sidang" : dicari=curr.getMahasiswa().getNilaiSidang().getNilai();
            }
            
            if(dicari==nilai) {
                found=true;
                curr.getMahasiswa().print();
            }

            curr=curr.getNext();
        }

        if(!found) {
            System.out.println("Data tidak ada yang ditemukan");
        }
    }

    public void searchChar(String cari, char karakter) {
        boolean found=false;
        Node curr=this.head;
        char dicari='A';

        while(curr != null) {
            switch(cari) {
                case "Huruf Mutu" : dicari=curr.getMahasiswa().getHurufMutu(curr.getMahasiswa().getNilaiSidang().getNilai());
            }

            if(dicari==karakter) {
                found=true;
                curr.getMahasiswa().print();
            }
        }

        if(!found) {
            System.out.println("Data tidak ada yang ditemukan");
        }
    }
}
