package com.codingdojo.com.zookeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZookeeperApplication {

	public static void main(String[] args) {
		
		Mammal mammal01 = new Mammal("something");
		mammal01.setEnergyLevel(25);
		System.out.println(mammal01.displayEnergy());
		Gorilla gorilla01 = new Gorilla("Big Guy");
		System.out.println(gorilla01.throwSomething(mammal01));
		
		SpringApplication.run(ZookeeperApplication.class, args);
	}

}
