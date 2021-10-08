package com.tutorial;

// subclass, child class, derived class
class HeroStrength extends Hero{
    String type = "Strength";

    HeroStrength(String nameInput, double attackInput, double healthInput){
        super(nameInput, attackInput, healthInput);
    }

    @Override //menimpa dan menjadi prioritas 1 dibanding superclass
    void display(){
        super.display();
        System.out.println("Type : " + this.type);
    }

    @Override
    void takeDamage(double damage){
        System.out.println(this.name + " received half damage " + damage + " -> " + 0.5*damage);
		this.health = this.health - 0.5*damage;
    }
}