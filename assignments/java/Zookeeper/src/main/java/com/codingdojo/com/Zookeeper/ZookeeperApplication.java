package com.codingdojo.com.Zookeeper;

public class ZookeeperApplication {

	public static void main(String[] args) {
		
		// instantiate instance from each class
		Gorilla g = new Gorilla();
		Bat b = new Bat();
		
		System.out.println("==== Track Gorilla Energy Below ====");
		g.displayEnergy();
		g.throwSomething();
		g.throwSomething();
		g.throwSomething();
		g.eatBananas();
		g.eatBananas();
		g.climb();
		g.displayEnergy();
		
		System.out.println("==== Track Bat Energy Below ====");
		b.displayEnergy();
		b.canFly();
		b.canFly();
		b.eatHumans();
		b.eatHumans();
		b.attackTown();
		b.attackTown();
		b.attackTown();
		b.displayEnergy();
		
	}
}

