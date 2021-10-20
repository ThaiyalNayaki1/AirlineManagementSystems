package com.demos.entities;

import java.math.BigInteger;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Booking {
	@Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	private BigInteger bookingId;
	private String bookingDate;
	private int noOfPassengers;

	/*
	 * @ManyToOne private Passenger passenger;
	 * 
	 * @ManyToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	 * 
	 * @JoinTable(name = "booking_flights", joinColumns = @JoinColumn(name =
	 * "booking_id"), inverseJoinColumns = @JoinColumn(name = "flight_id")) private
	 * Set<Flight> flights;
	 */
	
	/*
	 * public Passenger getPassenger() { return passenger; }
	 * 
	 * public void setPassenger(Passenger passenger) { this.passenger = passenger; }
	 * 
	 * public Set<Flight> getFlights() { return flights; }
	 * 
	 * public void setFlights(Set<Flight> flights) { this.flights = flights; }
	 */

	 public Booking(BigInteger bookingId2, String string, int i) {
		 this.bookingId=bookingId2;
		 this.bookingDate=string;
		 this.noOfPassengers=i;
		 // TODO Auto-generated constructor stub 
		 }
	 public Booking()
	 {
		 
	 }

	public BigInteger getBookingId() {
		return bookingId;
	}

	public void setBookingId(BigInteger bookingId) {
		this.bookingId = bookingId;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	@Override
	public String toString() {
		return "FlightBooking [id=" + bookingId + ", passenger=" + noOfPassengers + "]";
	}
}
