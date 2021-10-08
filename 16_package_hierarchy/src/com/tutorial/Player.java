package com.tutorial;

import com.terminal.Console;

class Player {
    private String name;

    Player(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    void show(){
        //System.out.println("Player name = " + this.name);
        Console.log("Using console");
        Console.log("Player name : " + this.name);
    }
}