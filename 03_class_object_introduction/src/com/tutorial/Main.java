package com.tutorial;

class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "ucok";
        mahasiswa1.NIM = "112117001";
        mahasiswa1.jurusan = "ternak lele";
        mahasiswa1.IPK = 4.0;
        mahasiswa1.umur = 21;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "acong";
        mahasiswa2.NIM = "112117002";
        mahasiswa2.jurusan = "ternak babi";
        mahasiswa2.IPK = 3.5;
        mahasiswa2.umur = 23;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);
    }
}