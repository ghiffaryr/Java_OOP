package com.tutorial;

class HeroAgility extends Hero{
    String type = "Agility";

    HeroAgility(String name){
        super(name);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type \t: " + this.type);
    }

    void showOff(){
        System.out.println("I'm agilty hero!");
    }
}