package com.tutorial;

class Main {
    public static void main(String[] args) {
        //overloading constructor
        Player player1 = new Player("Ucok");
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player("Acong");

        player1.show();
        player2.show();
        player3.show();
        player4.show();

        //overloading methods
        int a = Matematika.tambah(1, 12);
        System.out.println(a);
        double b = Matematika.tambah(1, 0.21);
        System.out.println(b);
    }
}