package com.codingdojo.com.caresoftinterfaces;

public class User {
	
    protected Integer id;
    protected int pin;
    
	public Integer getId() {
		return id;
	}
	
	public User(Integer id) {
		this.id = id;
		this.pin = pin;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public int getPin() {
		return pin;
	}
	
	public void setPin(int pin) {
		this.pin = pin;
	}
    
    // TO DO: Getters and setters
	// Implement a constructor that takes an ID
}

