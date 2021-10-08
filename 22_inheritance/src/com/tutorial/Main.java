package com.tutorial;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Sniper", 10,100);
        HeroStrength hero2 = new HeroStrength("Johnson",50,10);
        
        hero1.display();
		hero2.display();

		hero1.attack(hero2);
		hero2.attack(hero1);

		hero1.display();
		hero2.display();
    }
}