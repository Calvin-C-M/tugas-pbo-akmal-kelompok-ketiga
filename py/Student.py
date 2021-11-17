from Nilai import Nilai

class Student :
    def __init__(self) :
        self.__nama=""
        self.__npm=""
        self.__penguji1=Nilai()
        self.__penguji2=Nilai()
        self.__pembimbing=Nilai()

    def input(self) :
        self.__nama=input("Masukkan nama: ")
        self.__npm=input("Masukkan NPM: ")
        self.__penguji1.input("Penguji 1")
        self.__penguji2.input("Penguji 2")
        self.__pembimbing.input("Pembimbing")

    def print(self) :
        print("| " + self.__npm + "\t| " 
             + self.__nama + " \t\t| " 
             + str(self.__penguji1.getNilai()) + "\t\t| " 
             + str(self.__penguji2.getNilai()) + "\t\t| " 
             + str(self.__pembimbing.getNilai()) + "\t\t| " 
             + str(self.getNilaiSidang().getNilai()) + "\t\t| " 
             + self.getHurufMutu() + "\t\t|"
        )

    def setNama(self,nama) : self.__nama=nama
    def setNpm(self,npm) : self.__npm=npm
    def setPenguji1(self,penguji1) : self.__penguji1=penguji1
    def setPenguji2(self,penguji2) : self.__penguji2=penguji2
    def setPembimbing(self, pembimbing) : self.__pembimbing=pembimbing

    def getNama(self) : return self.__nama
    def getNpm(self) : return self.__npm
    def getPenguji1(self) : return self.__penguji1
    def getPenguji2(self) : return self.__penguji2
    def getPembimbing(self) : return self.__pembimbing

    def getNilaiSidang(self) :
        nilai1=self.__penguji1.getNilai()
        nilai2=self.__penguji2.getNilai()
        nilai3=self.__pembimbing.getNilai()
        sidang=Nilai()
        sidang.setNilai(nilai1+nilai2+nilai3)
        return sidang

    def getHurufMutu(self,nilai) :
        if nilai > 80 and nilai <= 100 :
            return 'A'
        elif nilai > 70 and nilai <= 80 :
            return 'B'
        elif nilai > 60 and nilai <= 70 :
            return 'C'
        return 'T'