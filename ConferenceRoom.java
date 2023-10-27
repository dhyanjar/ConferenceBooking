package com.dhyan.SampleProject;

import java.util.HashMap;
import java.util.Map;

public class ConferenceRoom implements Infrastructure{
	private String roomId;
	private int capacity;
	private Map<Integer, Booking> bookMap;
	
	ConferenceRoom(String roomId, int capacity){
		this.capacity = capacity;
		this.setRoomId(roomId);
		bookMap= new HashMap<Integer, Booking>();
	}
	
	public void book(int capacity, String userId, int slot, Booking booking) throws Exception {
		if(capacity>this.capacity) {
			throw new Exception("Invalid capacity");
		}
		if(bookMap.containsKey(slot)) {
			throw new Exception("Room already booked");
		}
		bookMap.put(slot, booking);
	}
	
	public void cancelBooking(int slot) throws Exception {
		if(!bookMap.containsKey(slot)) {
			throw new Exception("Conference room not booked!!");
		}
		bookMap.remove(slot);
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
}
