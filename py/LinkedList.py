from Node import Node

class LinkedList :
    def __init__(self) :
        self.__head=Node()

    def setHead(self,head) : self.__head=head

    def getHead(self) : return self.__head

    def insertFirst(self) :
        newElement=Node()
        newElement.getMahasiswa().input()

        if self.__head is None :
            self.__head=newElement
        else :
            newElement.setNext(self.__head)
            self.__head=newElement

    def insertLast(self) :
        newElement=Node()
        newElement.getMahasiswa().input()

        if self.__head is None :
            self.__head=newElement
        else :
            curr=self.__head
            while curr.getNext() is not None :
                curr=curr.getNext()
            curr.setNext(newElement)

    def deleteFirst(self) :
        delete=Node()
        delete=self.__head
        self.__head=self.__head.getNext()
        del delete

    def deleteLast(self) :
        delete=Node()
        curr=self.__head
        while curr.getNext().getNext() is not None :
            curr=curr.getNext()
        delete=curr.getNext()
        curr.setNext(None)
        del delete
    
    def printList(self) :
        curr=self.__head
        while curr.getNext() is not None :
            curr.getMahasiswa().print()
            curr=curr.getNext()

    def searchString(self,cari,data) :
        found=False
        curr=self.__head
        dicari=""

        while curr.getNext() is not None :
            if(cari is "Nama") :
                dicari=curr.getMahasiswa().getNama()
            elif(cari is "NPM") :
                dicari=curr.getMahasiswa().getNpm()
            
            if(dicari is data) :
                found=True
                curr.getMahasiswa().print()
            
            curr=curr.getNext()

        if(found is False) :
            print("Data tidak ada yang ditemukan")

    def searchNilai(self,cari,nilai) :
        found=False
        curr=self.__head
        dicari=0.0

        while curr.getNext() is not None :
            if(cari is "Penguji 1") :
                dicari=curr.getMahasiswa().getPenguji1().getNilai()
            elif(cari is "Penguji 2") :
                dicari=curr.getMahasiswa().getPenguji2().getNilai()
            elif(cari is "Pembimbing") :
                dicari=curr.getMahasiswa().getPembimbing().getNilai()
            elif(cari is "Nilai Sidang") :
                dicari=curr.getMahasiswa().getNilaiSidang().getNilai()
            
            if(dicari is nilai) :
                found=True
                curr.getMahasiswa().print()

            curr=curr.getNext()

        if(found is False) :
            print("Data tidak ada yang ditemukan")

    def searchChar(self,cari,karakter) :
        found=False
        curr=self.__head
        dicari=''

        while curr.getNext() is not None :
            if(cari is "Huruf Mutu") : 
                dicari=curr.getMahasiswa().getHurufMutu()

            if(dicari is karakter) :
                found=True
                curr.getMahasiswa().print()
            
            curr=curr.getNext()
        
        if(found is False) :
            print("Data tidak ada yang ditemukan")
