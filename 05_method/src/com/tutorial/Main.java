package com.tutorial;

class Mahasiswa{
    //Data anggota
    String nama;
    String NIM;

    //constructor
    Mahasiswa(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }

    //method without return and parameter
    void show(){
        System.out.println("Name : " + this.nama);
        System.out.println("NIM  : " + this.NIM);
    }

    //method without return, with parameter
    void setNama(String nama){
        this.nama = nama;
    }

    //method with return, no parameter
    String getNama(){
        return this.nama;
    }

    String getNIM(){
        return this.NIM;
    }

    ///method with return and parameter
    String sayHi(String message){
        return message + ", my name is " + this.nama;
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("ucok", "11217001");
        //method
        mahasiswa1.show();
        mahasiswa1.setNama("pendi");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());
        
        String data = mahasiswa1.sayHi("shhhhh");
        System.out.println(data);
        
    }
}