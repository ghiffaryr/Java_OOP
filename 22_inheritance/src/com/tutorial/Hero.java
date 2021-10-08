package com.tutorial;

class Hero {
    //attribute
    String name;
    double attackPower, health;

    //constructor
    Hero(String nameInput, double attackInput, double healthInput){
        this.name = nameInput;
        this.attackPower = attackInput;
        this.health = healthInput;
    }

    //attack method
    void attack(Hero enemy){
        System.out.println("\n" + this.name + " is attacking  " + enemy.name);
		enemy.takeDamage(this.attackPower);
	}

	void takeDamage(double damage){
		System.out.println(this.name + " received " + damage + " damage");
		this.health = this.health - damage;
	}

	void display(){
		System.out.println("\nName: " + this.name);
		System.out.println("Health: " + this.health);
		System.out.println("Power: " + this.attackPower);
    }
}