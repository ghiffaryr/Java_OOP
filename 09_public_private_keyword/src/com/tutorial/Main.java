package com.tutorial;

class Player{
    String name;
    public int exp;
    private int health;

    Player(String name, int exp, int health){
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    void display(){
        addExp();
        System.out.println("\nName\t: " + this.name);
        System.out.println("Exp\t: " + this.exp);
        System.out.println("Health\t: " + this.health);
    }

    public void changeName(String newName){
        this.name = newName;
    }

    private void addExp(){
        this.exp += 100;
    }
}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Cuk", 0, 100);

        //default access
        System.out.println(player1.name);
        player1.name = "Sun";
        System.out.println(player1.name); 
        
        //public access
        System.out.println(player1.exp);
        player1.exp = 100;
        System.out.println(player1.exp);

        //private access (not working, can only be edited inside)
        // System.out.println(player1.health);
        // player1.health = 200;
        // System.out.println(player1.health);
        
        //methods
        //default
        player1.display();

        //public
        player1.changeName("Cak");
        player1.display();

        ///private
        //player1.addExp();
    }
}