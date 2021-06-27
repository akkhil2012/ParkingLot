package com.model;

public abstract class  Slot {

	private String slotNumber;
	private SlotStatus slotStatus;
	
	public Slot(String slotNumber) {
		super();
		this.slotNumber = slotNumber;
		slotStatus = SlotStatus.EMPTY;
	}

	public SlotStatus getSlotStatus() {
		return slotStatus;
	}

	public void setSlotStatus(SlotStatus slotStatus) {
		this.slotStatus = slotStatus;
	}

	public String getSlotNumber() {
		return slotNumber;
	}

	abstract Slot  assignSlot(Vehicle vehicle);
}
