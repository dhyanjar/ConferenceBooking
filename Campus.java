package com.dhyan.SampleProject;

import java.util.ArrayList;
import java.util.List;

public class Campus implements Infrastructure{
	public List<Building> buildings;
	
	Campus(){
		buildings= new ArrayList<Building>();
	}
	
	public void addBuilding(Building building) {
		buildings.add(building);
	}
}
