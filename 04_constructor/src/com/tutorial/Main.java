package com.tutorial;

//class without constructor
class Innocent{
    String dataString;
    int dataInteger;
}

//class with constructor
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    
    Mahasiswa(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("ucok", "11217001", "ternak lele");
        Mahasiswa mahasiswa2 = new Mahasiswa("acong", "11217002", "ternak babi");

        //test the innocent class
        Innocent innocentClass = new Innocent();
        innocentClass.dataString = "innocent";
        innocentClass.dataInteger = 0;

        System.out.println(innocentClass.dataString);
        System.out.println(innocentClass.dataInteger);
        
    }
}