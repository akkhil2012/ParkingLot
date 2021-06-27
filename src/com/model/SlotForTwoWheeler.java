package com.model;

public class SlotForTwoWheeler extends Slot {

	public SlotForTwoWheeler(String slotNumber) {
		super(slotNumber);
		// TODO Auto-generated constructor stub
	}

	private Vehicle twoWheeler;

	public Vehicle getTwoWheeler() {
		return twoWheeler;
	}

	public void setTwoWheeler(Vehicle twoWheeler) {
		this.twoWheeler = twoWheeler;
	}

	@Override
	public Slot assignSlot(Vehicle vehicle) {
		this.setTwoWheeler(vehicle);
		return this;
	}

}
