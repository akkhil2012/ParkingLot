package com.model;

public abstract class Vehicle {

	private final int registrationNumber;

	public Vehicle(final int registrationNumber) {
		super();
		this.registrationNumber = registrationNumber;
	}

	public int getRegistrationNumber() {
		return registrationNumber;
	}

}
