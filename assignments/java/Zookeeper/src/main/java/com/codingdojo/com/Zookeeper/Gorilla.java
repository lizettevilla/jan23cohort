package com.codingdojo.com.Zookeeper;

public class Gorilla extends Mammal {
	
	Gorilla() {
	}

	public void throwSomething() {
		this.energyLevel -= 5;
		String.format("The Gorilla just threw a banana! Decreased energy by 5. New Energy: " + this.energyLevel);
		
	}
	
	
	
	public void eatBananas() {
		this.energyLevel += 10;
		System.out.println("Bananas, yummy! Increased energy by 10! New Energy: " + this.energyLevel);
		
	}
	
	
	
	public void climb() {
		this.energyLevel -= 10;
		System.out.println("The Gorilla just climbed a tree. New Energy: " + this.energyLevel);
	}
	
	
}
