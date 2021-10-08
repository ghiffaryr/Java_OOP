package com.tutorial;

// visibility
// 1. Public: If a method or attribute is explicitly public,
// then subclasses must not reduce visibility
// 2. Private: If the method or attribute in private is explicitly,
// then even subclasses can't access
// 3. Final: method or attribute with final keyword will be herited,
// but can't be overrided. in the same class can be overloaded

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("ucok", 100);
		HeroIntel hero2 = new HeroIntel("acong", 50);

		hero1.display();
		hero2.display();

		System.out.println(hero1.getHealth());
		System.out.println(hero2.getHealth());
		
		hero1.setHealth(120);
		hero2.setHealth(80);

		hero1.display();
		hero2.display();
		
		hero1.setHealth("reset");
		hero1.display();

		hero2.setHealth("reset");
		hero2.display();
    }
}