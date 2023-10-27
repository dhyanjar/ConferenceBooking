package com.dhyan.SampleProject;

public class Booking {
	private String bookingId;
	private String buildingId;
	private String floorId;
	private String confId;
	private int slot;
	private String userId;
	
	Booking(String bookingId, String buildingId, String floorId,int slot, String userId,String confId){
		this.setBookingId(bookingId);
		this.buildingId = buildingId;
		this.floorId = floorId;
		this.slot = slot;
		this.userId = userId;
		this.confId=confId;
	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	
	public String toString() {
		String bookingStr= "";
		bookingStr+= Integer.toString(slot) + "-" + Integer.toString(slot+1);
		bookingStr += " " +  buildingId + " " + floorId + " " + confId;
		return bookingStr;
	}
}
