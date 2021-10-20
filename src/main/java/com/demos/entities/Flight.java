package com.demos.entities;

import java.math.BigInteger;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Flight {

	@Id
	private BigInteger flightcode;
	private String carrierName;
	private String flightModel;
	private int seatCapacity;

	/*
	 * @OneToOne(mappedBy = "flightObj", cascade = CascadeType.ALL) private
	 * ScheduledFlight sfObj;
	 */

	public Flight() {
	}

	/**
	 * @param flightNo
	 * @param carrierName
	 * @param flightModel
	 * @param seatCapacity
	 */
	public Flight(BigInteger flightNo, String carrierName, String flightModel, int seatCapacity) {
		super();
		this.flightcode = flightNo;
		this.carrierName = carrierName;
		this.flightModel = flightModel;
		this.seatCapacity = seatCapacity;
	}

	/**
	 * @return the flightNo
	 */
	public BigInteger getFlightcode() {
		return flightcode;
	}

	/**
	 * @param flightNo
	 *            the flightNo to set
	 */
	public void setFlightcode(BigInteger flightNo) {
		this.flightcode = flightNo;
	}

	/**
	 * @return the carrierName
	 */
	public String getCarrierName() {
		return carrierName;
	}

	/**
	 * @param carrierName
	 *            the carrierName to set
	 */
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	/**
	 * @return the flightModel
	 */
	public String getFlightModel() {
		return flightModel;
	}

	/**
	 * @param flightModel
	 *            the flightModel to set
	 */
	public void setFlightModel(String flightModel) {
		this.flightModel = flightModel;
	}

	/**
	 * @return the seatCapacity
	 */
	public int getSeatCapacity() {
		return seatCapacity;
	}

	/**
	 * @param seatCapacity
	 *            the seatCapacity to set
	 */
	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	@Override
	public String toString() {
		return "Flight [flightCode=" + flightcode + ",carrierName=" + carrierName + ",flightModel=" + flightModel
				+ ",seatCapacity=" + seatCapacity + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carrierName == null) ? 0 : carrierName.hashCode());
		result = prime * result + ((flightModel == null) ? 0 : flightModel.hashCode());
		result = prime * result + ((flightcode == null) ? 0 : flightcode.hashCode());
		result = prime * result + seatCapacity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		if (carrierName == null) {
			if (other.carrierName != null)
				return false;
		} else if (!carrierName.equals(other.carrierName))
			return false;
		if (flightModel == null) {
			if (other.flightModel != null)
				return false;
		} else if (!flightModel.equals(other.flightModel))
			return false;
		if (flightcode == null) {
			if (other.flightcode != null)
				return false;
		} else if (!flightcode.equals(other.flightcode))
			return false;
		if (seatCapacity != other.seatCapacity)
			return false;
		return true;
	}

	

}