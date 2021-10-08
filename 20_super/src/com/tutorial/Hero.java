package com.tutorial;

public class Hero {
    String name = "Hero class";
    
    void display(){
        System.out.println("This is " + this.name);
    }

    void dummyMethod(){
        System.out.println("This method is in superclass");
    }
}