package com.tutorial;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Ucok");
		HeroStrength hero2 = new HeroStrength("Johnson");
		hero1.display();
		hero2.display();

		//Polymorphic -> assign subclass object to parent class
		Hero hero3 = new HeroAgility("Layla");
		hero3.display();

		HeroAgility hero4 = new HeroAgility("Kaliang");
		hero4.display();
		hero4.showOff();
		//won't work
		//HeroIntel hero4 = new Hero("Mahmud");
		//hero4.display();

		//Array list
		Hero[] listHero = new Hero[4];
		listHero[0] = hero1;
		listHero[1] = hero2;
		listHero[2] = hero3;
		listHero[3] = hero4; //casting
        
		listHero[0].display();
		listHero[1].display();
		listHero[2].display();

		//method calls
		//listHero[3].showOff(); //this doesn't work because its in hero class array
		hero4.showOff();

		//apps
		hero1.attack(hero2);
		hero1.attack(hero3);
		hero1.attack(hero4);
    }
}