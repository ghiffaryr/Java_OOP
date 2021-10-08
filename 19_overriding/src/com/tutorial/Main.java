package com.tutorial;

public class Main {
    public static void main(String[] args) {
        //overloading constructor
        Hero hero1 = new Hero();
        hero1.name = "Saitama";
        //hero1.defensePower = doesn't have;
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Mountain Lady";
        hero2.defensePower = 100;
        hero2.display();
    }
}