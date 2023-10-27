package com.dhyan.SampleProject;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String userId;
	private String age;
	private List<Booking> bookings;
	
	User(String userId, String age){
		this.userId = userId;
		this.age = age;
		bookings= new ArrayList<Booking>();
	}
	
	public void bookRoom(Booking booking) {
		bookings.add(booking);
	}
	
	public void cancelBooking(String bookingId) {
		for(int i=0;i<bookings.size();i++) {
			if(bookings.get(i).getBookingId().equals(bookingId)) {
				bookings.remove(i);
			}
		}
	}
	
	public List<String> listBookings() {
		List<String> bookingStrs = new ArrayList<String>();
		for(int i=0;i<bookings.size();i++) {
			bookingStrs.add(bookings.get(i).toString());
		}
		return bookingStrs;
	}
}
