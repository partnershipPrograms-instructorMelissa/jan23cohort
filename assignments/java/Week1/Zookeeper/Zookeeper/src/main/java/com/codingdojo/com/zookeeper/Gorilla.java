package com.codingdojo.com.zookeeper;

public class Gorilla extends Mammal{
	
	private Mammal mammal;
	
	public String getMammal() {
		return this.mammal.getName();
	}

	public void setMammal(String mammal) {
		this.mammal.setName(mammal);
	}

	public Gorilla(String name) {
		super(name);
	}

	public String throwSomething(Mammal mammal) {
		mammal.energyLevel -= 5;
		return "The Gorilla has thrown a chair and decreased your health to" + " " + mammal.energyLevel;
	}
	
}
