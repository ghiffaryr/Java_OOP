package com.tutorial;

public class Hero {
    String name;
    double defensePower;
    double attackPower;

    Hero(String name, double defensePower, double attackPower){
        this.name = name;
        this.defensePower = defensePower;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("Name \t\t: " + this.name);
        System.out.println("Attack Power \t: " + this.attackPower);
        System.out.println("Defence Power \t: " + this.defensePower);
    }
}