package com.tutorial;

// subclass, child class, derived class
class HeroStrength extends Hero{
    double defensePower;
    
    void display(){
        System.out.println("\nHero Strength");
        System.out.println("Hero name : " + this.name);
        System.out.println("Defense power : " + this.defensePower);
    }
}