package com.tutorial;

//import class console
import com.terminal.Console;

//import static method from console;
import static com.terminal.Console.log;

class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Ucok");
        player1.show();

        Console.log("Showing data with console.log");
        Console.log(player1.getName());

        log("Showing data with log only");
        log(player1.getName());
    }
}
//private doesn't allowed
//private class Test{

//}