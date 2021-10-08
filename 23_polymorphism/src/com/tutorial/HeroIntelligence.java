package com.tutorial;

class HeroIntelligence extends Hero{
    String type = "Intelligence";

    HeroIntelligence(String name){
        super(name);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type \t: " + this.type);
    }
}
