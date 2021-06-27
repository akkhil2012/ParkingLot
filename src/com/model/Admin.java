package com.model;

public class Admin {

	// setup the parking

	public static void main(String args[]) {

		ParkingLot parkingLot = new ParkingLot();

		ParkingService parkingService = new ParkingService();

		System.out.println(" Slots available before parked  :: " + parkingLot.getTwoWheelerSlots().size());
		Vehicle car = new Car(111);
		parkingService.parkVehicle(parkingLot, car);

		car = new Car(222);
		parkingService.parkVehicle(parkingLot, car);

		car = new Car(333);
		parkingService.parkVehicle(parkingLot, car);

		System.out.println(" Slots available after parked  :: " + parkingLot.getTwoWheelerSlots().size());

		System.out.println(" Vehicle parked.................");

	}

}
