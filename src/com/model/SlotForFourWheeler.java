package com.model;

public class SlotForFourWheeler extends Slot{

	
	public SlotForFourWheeler(String slotNumber) {
		super(slotNumber);
		// TODO Auto-generated constructor stub
	}

	private Vehicle fourWheeler;
	
	public Vehicle getFourWheeler() {
		return fourWheeler;
	}

	public void setFourWheeler(Vehicle fourWheeler) {
		this.fourWheeler = fourWheeler;
	}

	@Override
	public Slot assignSlot(Vehicle vehicle) {
		this.setFourWheeler(vehicle);
		return this;
	}

}
