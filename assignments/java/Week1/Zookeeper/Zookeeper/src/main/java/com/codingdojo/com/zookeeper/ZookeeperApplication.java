package com.codingdojo.com.zookeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZookeeperApplication {

	public static void main(String[] args) {
		
		Mammal mammal01 = new Mammal();
		mammal01.setEnergyLevel(25);
		System.out.println(mammal01.displayEnergy());
		
		SpringApplication.run(ZookeeperApplication.class, args);
	}

}
