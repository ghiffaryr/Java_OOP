package com.tutorial;

// subclass, child class, derived class
class HeroStrength extends Hero{
    String attribute = "Strength";

    HeroStrength(String name, double defense, double attack){
        super(name, defense, attack);
    }

    void display(){
        System.out.println("Hero " + this.attribute);
        super.display();
    }
}