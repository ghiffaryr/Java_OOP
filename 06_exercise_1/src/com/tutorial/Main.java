package com.tutorial;

class Player{
    String name;
    double health;
    int level;
    //object member
    Weapon weapon;
    Armor armor;
    
    Player(String name, double health){
        this.name = name;
        this.health = health;
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nName   : " + this.name);
        System.out.println("Health : " + this.health + " hp");
        this.weapon.display();
        this.armor.display();
    }
}

class Weapon{
    double attackPower;
    String name;

    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("Weapon : " + this.name + " , attack : " + this.attackPower);
    }

}

class Armor{
    double defensePower;
    String name;

    Armor(String name, double defensePower){
        this.name = name;
        this.defensePower = defensePower;
    }

    void display(){
        System.out.println("Armor : " + this.name + " , defense : " + this.defensePower);
    }
}

public class Main {
    public static void main(String[] args) {
        //create object player
        Player player1 = new Player("ucok", 100);
        Player player2 = new Player("acong", 50);

        //create object weapon
        Weapon sword = new Weapon("sword", 10);
        Weapon catapult = new Weapon("catapult", 1);

        //create object armor
        Armor habergeon = new Armor("habergeon", 10);
        Armor shirt = new Armor("shirt", 0);

        //display player 1
        player1.equipWeapon(sword);
        player1.equipArmor(habergeon);
        player1.display();

        //display player 2
        player2.equipWeapon(catapult);
        player2.equipArmor(shirt);
        player2.display();
    }
}