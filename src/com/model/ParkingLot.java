package com.model;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

	private int max_slots = 100;

    private int occupiedTwoWheeler = 0;

	

	private List<SlotForTwoWheeler> twoWheelerSlots;
	private List<SlotForFourWheeler> fourWheelerSlots;

	public ParkingLot() {
		setUpParking();
	}

	ParkingLot setUpParking() {
		twoWheelerSlots = new ArrayList<SlotForTwoWheeler>();
		fourWheelerSlots = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			twoWheelerSlots.add(new SlotForTwoWheeler("TwoWheeler_ " + i));
			fourWheelerSlots.add(new SlotForFourWheeler("FourWheeler_ " + i));
		}
		return this;

	}
	
	
	
	
	public int getMax_slots() {
		return max_slots;
	}

	public void setMax_slots(int max_slots) {
		this.max_slots = max_slots;
	}

	public List<SlotForTwoWheeler> getTwoWheelerSlots() {
		return twoWheelerSlots;
	}

	public void setTwoWheelerSlots(List<SlotForTwoWheeler> twoWheelerSlots) {
		this.twoWheelerSlots = twoWheelerSlots;
	}

	public List<SlotForFourWheeler> getFourWheelerSlots() {
		return fourWheelerSlots;
	}

	public void setFourWheelerSlots(List<SlotForFourWheeler> fourWheelerSlots) {
		this.fourWheelerSlots = fourWheelerSlots;
	}
	
	
	public int getOccupiedTwoWheeler() {
		return occupiedTwoWheeler;
	}

	public void setOccupiedTwoWheeler(int occupiedTwoWheeler) {
		this.occupiedTwoWheeler = occupiedTwoWheeler;
	}

}
