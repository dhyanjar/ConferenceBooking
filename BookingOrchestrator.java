package com.dhyan.SampleProject;

import java.util.List;

public class BookingOrchestrator {

	private List<Building> buildings;
	private String buildingId;
	private String floorId;
	private String confId;
	private int slot;
	private int capacity;
	
	BookingOrchestrator(String buildingId,String floorId, String confId, List<Building> buildings,int slot,int capacity){
		this.buildingId= buildingId;
		this.floorId = floorId;
		this.buildings = buildings;
		this.confId= confId;
		this.slot=slot;
		this.capacity=capacity;
	}
	
	public void doBooking(String userId) {
		Floor floor = null;
		for(int i=0;i<buildings.size();i++) {
			if(buildings.get(i).getName().equals(buildingId)) {
				floor= buildings.get(i).getFloor(floorId);
			}
		}
		
		if(floor != null) {
			ConferenceRoom conf= floor.getConfRoom(confId);
			conf.book(capacity, userId, slot, new Booking());
		} else {
			throw new Exception("Floor does not exist");
		}
	}
}
