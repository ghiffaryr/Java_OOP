package com.tutorial;

// subclass, child class, derived class
class HeroStrength extends Hero{
    String name =  "Strength class";
    
    void display(){
        System.out.println("This is " + this.name);
        this.dummyMethod();
    }

    void displaySuper(){
        System.out.println("This is " + super.name);
        super.dummyMethod();
    }

    void dummyMethod(){
        System.out.println("This method is in subclass");
    }
}