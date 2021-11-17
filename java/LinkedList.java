public class LinkedList {
    Element head;

    LinkedList() {
        this.head=null;
    }

    LinkedList(Element head) {
        this.head=head;
    }

    public void setHead(Element head) {
        this.head = head;
    }
    
    public Element getHead() {
        return head;
    }

    public void createList(){
        this.head = null;
    }

    public Element createElement(){
        Element newElement=new Element();
        newElement.getMahasiswa().input();
        newElement.setNext(null);
        return newElement;
    }

    public Element createElmnt(Student mhs) {
        Element newElement=new Element(mhs);
        return newElement;
    }

    public void insertFirst(Element newElement) {
        if(this.head==null) {
            this.head=newElement;
        } else {
            newElement.setNext(this.head);
            this.head=newElement;
        }
    }

    public void insertLast(Element newElement) {
        if(this.head==null) {
            this.head=newElement;
        } else {
            Element curr=this.head;
            while(curr.getNext() != null) {
                curr=curr.getNext();
            }
            curr.setNext(newElement);
        }
    }

    public void deleteFirst() {
        Element del=null;
        del=this.head;
        this.head=this.head.getNext();
    }

    public void deleteLast() {
        Element del=null;
        Element curr=this.head;
        while(curr.getNext().getNext() != null) {
            curr=curr.getNext();
        }
        del=curr.getNext();
        curr.setNext(null);
    }

    public void printList() {
        Element curr=this.head;
        while(curr != null) {
            curr.getMahasiswa().print();
            curr=curr.getNext();
        }
    }
    
    public void searchString(String cari, String data) {
        boolean found=false;
        Element curr=this.head;
        String dicari=new String();

        while(curr != null) {
            switch(cari) {
                case "Nama" : dicari=curr.getMahasiswa().getNama();
                    break;
                case "NPM" : dicari=curr.getMahasiswa().getNpm();
                    break;
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
        Element curr=this.head;
        float dicari=0;
        
        while(curr != null) {
            switch(cari) {
                case "Penguji 1" : dicari=curr.getMahasiswa().getPenguji1().getNilai();
                    break;
                case "Penguji 2" : dicari=curr.getMahasiswa().getPenguji2().getNilai();
                    break;
                case "Pembimbing" : dicari=curr.getMahasiswa().getPembimbing().getNilai();
                    break;
                case "Nilai Sidang" : dicari=curr.getMahasiswa().getNilaiSidang().getNilai();
                    break;
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

    public void searchHurufMutu(String cari, char karakter) { //infinite loop
        boolean found=false;
        Element curr=this.head;
        char dicari='A';

        while(curr != null) {
            switch(cari) {
                case "Nilai Sidang" : dicari=curr.getMahasiswa().getHurufMutu(curr.getMahasiswa().getNilaiSidang().getNilai());
                    break;

                case "Nilai Penguji 1": dicari=curr.getMahasiswa().getHurufMutu(curr.getMahasiswa().getPenguji1().getNilai());
                    break;

                case "Nilai Penguji 2": dicari=curr.getMahasiswa().getHurufMutu(curr.getMahasiswa().getPenguji2().getNilai());
                    break;

                case "Nilai Pembimbing": dicari=curr.getMahasiswa().getHurufMutu(curr.getMahasiswa().getPembimbing().getNilai());
                    break;
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
