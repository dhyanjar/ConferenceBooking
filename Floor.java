package com.dhyan.SampleProject;

import java.util.ArrayList;
import java.util.List;

public class Floor implements Infrastructure {
	private String floorName;
	private List<ConferenceRoom> listOfConferenceRoom;
	
	Floor(String floorName){
		this.setFloorName(floorName);
		listOfConferenceRoom= new ArrayList<ConferenceRoom>();
	}
	
	public void addConferenceRoom(ConferenceRoom newRoom) {
		listOfConferenceRoom.add(newRoom);
	}
	
	public ConferenceRoom getConfRoom(String roomId) {
		for(int i=0;i<listOfConferenceRoom.size();i++) {
			if(listOfConferenceRoom.get(i).getRoomId().equals(roomId))return listOfConferenceRoom.get(i);
		}
		return null;
	}

	public String getFloorName() {
		return floorName;
	}

	public void setFloorName(String floorName) {
		this.floorName = floorName;
	}
}
