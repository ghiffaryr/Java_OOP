package com.tutorial;

public class Main {
    public static void main(String[] args) {
        //overloading constructor
        Hero hero1 = new Hero();
        hero1.name = "Ucok";
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Acong";
        hero2.display();

        HeroIntelligent hero3 = new HeroIntelligent();
        hero3.name = "Ujang";
        hero3.display();
    }
}