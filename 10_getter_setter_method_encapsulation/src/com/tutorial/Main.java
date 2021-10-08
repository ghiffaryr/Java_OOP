package com.tutorial;

class Data{
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    public Data(){
        this.intPublic = 0;
        this.intPrivate = 5;
    }

    void Display(){
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
        System.out.println(this.doublePrivate);
    }

    //getter
    public int getIntPrivate(){
        return this.intPrivate;
    }

    //setter
    public void setDoublePrivate(double value){
        this.doublePrivate = value;
    }
}

class Circle{
    private double diameter;

    Circle(double diameter){
        this.diameter = diameter;
    }

    //setter
    public void setRadius(double radius){
        this.diameter = radius;
    }

    //getter
    public double getRadius(){
        return this.diameter/2;
    }

    //getter
    public double getArea(){
        return 3.14*this.diameter*this.diameter;
    }
}

public class Main {
    public static void main(String[] args) {
        Data object = new Data();

        //rw public
        object.intPublic = 5; //Write
        System.out.println("Public : " + object.intPublic); //read

        //read only (using getter)
        int number = object.getIntPrivate();
        System.out.println("Getter : " + number);

        //write only
        object.setDoublePrivate(0.05);
        object.Display();


        //use rw with setter and getter
        Circle object2 = new Circle(5);
        System.out.println("Radius : " + object2.getRadius());
        object2.setRadius(14);
        System.out.println("Radius : " + object2.getRadius());
        System.out.println("Area : " + object2.getRadius());
    }
}