package com.dhyan.SampleProject;

import java.util.List;
import java.util.ArrayList;

public class Building implements Infrastructure {
	
	private String name; 
	private List<Floor> floors;
	
	Building(String name){
		this.setName(name);
		floors=new ArrayList<Floor>();
	}
	
	public void addFloor(Floor newFloor) {
		floors.add(newFloor);
	}
	
	public Floor getFloor(String floorId) {
		for(int i=0;i<floors.size();i++) {
			if(floors.get(i).getFloorName().equals(floorId))return floors.get(i);
		}
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
