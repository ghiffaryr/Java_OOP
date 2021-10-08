package com.tutorial;

public class HeroIntel extends Hero{
	HeroIntel(String name, double health){
		super(name, health);
		//at this point, you can't access the private variable i.e. this.health
	}

	//override
	public void display(){
		System.out.println(this.name + " have a lot of " + this.getHealth() + " health");
	}

	//here we try to override final setter
	//void setHealth(double newHealth){
	//	System.out.println("trying to add health = " + newHealth);
	//}

	//using different class of input will be work
	void setHealth(String newHealth){
		System.out.println("trying to add health = " + newHealth);
	}
}