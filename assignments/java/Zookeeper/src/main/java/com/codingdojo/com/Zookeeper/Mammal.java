package com.codingdojo.com.Zookeeper;

public class Mammal {

	//set member variable so it can be inherited 
	protected int energyLevel = 100;
	
	
	// getters and setters
	public int getEnergyLevel() {
		return energyLevel;
	}
	
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	
	// method to display and return mammal energy
	public int displayEnergy() {
		System.out.println("Current energy level: " + this.energyLevel);
		return this.energyLevel;
	}
	
	
	
}
