package com.tutorial;

class Hero {
    public String name;
	private double health;

	Hero(String name, double health){
		this.name = name;
		this.health = health;
	}

	//getter
	public double getHealth(){
		return this.health;
	}

	//setter
	final void setHealth(double newHealth){
		this.health = newHealth;
	}

	//it still can be overloaded
	void setHealth(String mode){
		if(mode.equals("reset")){
			this.health = 100;
		}
	}

	public void display(){
		System.out.println(this.name + " have " + this.health + " hp");
	}
}