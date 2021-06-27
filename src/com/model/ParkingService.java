package com.model;

import java.util.List;

public class ParkingService {

	
	public Vehicle parkVehicle(ParkingLot parkingLot,Vehicle vehicle) {
		int occupied = parkingLot.getOccupiedTwoWheeler();
		if(occupied+1>=parkingLot.getMax_slots()) {
			System.out.println(" All slots occupied.........");
		}
		SlotForTwoWheeler slot = parkingLot.getTwoWheelerSlots().
			       get(occupied+1);
		slot.assignSlot(vehicle);
		slot.setSlotStatus(SlotStatus.OCCUPIED);
		System.out.println(" Assigned slot " + slot.getSlotNumber() +" for vehicle " + vehicle.getRegistrationNumber());
		parkingLot.setOccupiedTwoWheeler(occupied+1);
		parkingLot.getTwoWheelerSlots().add(slot);
		
		List<SlotForTwoWheeler> totalSlot = parkingLot.getTwoWheelerSlots();
		int count = 0;
		for(SlotForTwoWheeler twoWheeler : totalSlot){
			if(twoWheeler.getSlotStatus()==SlotStatus.EMPTY)
				count++;
		}
		System.out.println(" total avialbale: " + count);
		
		return vehicle;
		
	}
	
	/*public Ticket generateTicket(Vehicle vehicle) {
		
	}
	
	public Vehicle UnParkvehicle(Vehicle vehicle) {
		
	}
	
	public Payment payCharges(Ticket ticket) {
		
	}
	*/
	
	
}
