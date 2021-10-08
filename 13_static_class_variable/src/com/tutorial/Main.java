package com.tutorial;

class Display{
    static String type = "Display";
    private String name;

    Display(String name){
        this.name = name;
    }

    void setType(String typeInput){
        //type = typeInput; alternative 1
        //this.type = typeInput; alternative 2
        Display.type = typeInput; //alternative 3
    }

    void show(){
        System.out.println("Display name = " + this.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Display display1 = new Display("Monitor");
        display1.show();

        Display display2 = new Display("Smartphone");
        display2.show();

        //show static variable or class variable
        System.out.println("\nShow static variable");
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type);

        //try to change the static variable
        Display.type = "Test";
        //display1.type = "Test";
        //display2.type = "Test";

        System.out.println("\nShowing static variable");
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type);

        //try to change the static variable
        //display2.setType("Monitor");
        display1.setType("Monitor");

        System.out.println("\nShowing static variable");
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type);
    }
}