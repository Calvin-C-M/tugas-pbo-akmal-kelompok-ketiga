class Nilai :
    def __init__(self) :
        self.__nilai=0.0
    
    def input(self,penilai) :
        self.__nilai=input("Masukkan nilai " + penilai + ": ")
    
    def setNilai(self,nilai) : self.__nilai=nilai

    def getNilai(self) : return self.__nilai