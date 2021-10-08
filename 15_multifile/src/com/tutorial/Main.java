package com.tutorial;

import com.terminal.Console;

class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Ucok");
        Player player2 = new Player("Acong");
        Player player3 = new Player("Penok");
        player1.show();
        player2.show();
        player3.show();

        Console.log("hallo");
        Console.log("hi");
    }
}