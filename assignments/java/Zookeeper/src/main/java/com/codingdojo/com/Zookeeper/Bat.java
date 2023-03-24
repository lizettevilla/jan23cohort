package com.codingdojo.com.Zookeeper;

public class Bat extends Mammal {
	
	// Bat will inherit Mammal(parent) attribute methods
	Bat() {
		this.energyLevel = 300;
	}
	
	public void canFly() {
		this.energyLevel -= 50;
		System.out.println("OH NOOOO A Flying Bat!!! Decreased Energy By 50: " + this.energyLevel);
	}
	
	
	public void eatHumans() {
		this.energyLevel += 25;
		System.out.println("MMMM YUMMY! Increased Energy By 25: " + this.energyLevel);
	}
	
	
	
	public void attackTown() {
		this.energyLevel -= 100;
		System.out.println("BURNING TOWN!! Decreased Energy By 100: " + this.energyLevel);
	}
	

}
