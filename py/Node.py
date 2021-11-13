from Student import Student

class Node :
    def __init__(self) :
        self.__mahasiswa=Student()
        self.__next=None

    def setMahasiswa(self,mahasiswa) : self.__mahasiswa=mahasiswa
    def setNext(self,next) : self.__next=next

    def getMahasiswa(self) : return self.__mahasiswa
    def getNext(self) : return self.__next