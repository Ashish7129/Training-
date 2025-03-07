package com.nagarro.model;
import java.util.Date;

public class Flight {
	private String flightNo;
	private String depLoc;
	private String arrLoc;
	private Date validTill;
	private String flightTime;
	private Double flightDuration;
	private int fare;
	private boolean seatAvailability;
	private String flightClass;
	

	public String getFlightNo() {
		return flightNo;
	}

	public String getDepLoc() {
		return depLoc;
	}

	public String getArrLoc() {
		return arrLoc;
	}

	public Date getValidTill() {
		return validTill;
	}

	public String getFlightTime() {
		return flightTime;
	}

	public Double getFlightDuration() {
		return flightDuration;
	}

	public int getFare() {
		return fare;
	}

	public boolean getSeatAvailability() {
		return seatAvailability;
	}

	public String getFlightClass() {
		return flightClass;
	}



	
	

	@Override
	public String toString() {
		return "|" + flightNo + " | " + depLoc + " | " + arrLoc + " | " + validTill
				+ " | " + flightTime + " | " + flightDuration + " | " + fare
				+ " | " + seatAvailability + " | " + flightClass + " |";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arrLoc == null) ? 0 : arrLoc.hashCode());
		result = prime * result + ((depLoc == null) ? 0 : depLoc.hashCode());
		result = prime * result + fare;
		result = prime * result + ((flightClass == null) ? 0 : flightClass.hashCode());
		result = prime * result + ((flightDuration == null) ? 0 : flightDuration.hashCode());
		result = prime * result + ((flightNo == null) ? 0 : flightNo.hashCode());
		result = prime * result + ((flightTime == null) ? 0 : flightTime.hashCode());
		result = prime * result + (seatAvailability ? 1231 : 1237);
		result = prime * result + ((validTill == null) ? 0 : validTill.hashCode());
		return result;
	}

	/**
	 * @param flightNo2
	 * @param depLoc
	 * @param arrLoc
	 * @param fare2
	 * @param validTill2
	 * @param flightTime2
	 * @param flightDuration2
	 * @param seatAvailability2
	 * @param flightClass
	 */
	public Flight(String flightNo2, String depLoc, String arrLoc, int fare2, Date validTill2, String flightTime2,
			Double flightDuration2, boolean seatAvailability2, String flightClass) {
		super();
		this.flightNo = flightNo2;
		this.depLoc = depLoc;
		this.arrLoc = arrLoc;
		this.validTill = validTill2;
		this.flightTime = flightTime2 ;
		this.flightDuration = flightDuration2;
		this.fare = fare2;
		this.seatAvailability = seatAvailability2;
		this.flightClass = flightClass;
		if(this.flightClass.equalsIgnoreCase("eb")) {
			this.fare += 0.4*this.fare;
		}
	}

	public Flight() {
		// TODO Auto-generated constructor stub
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
		if (arrLoc == null) {
			if (other.arrLoc != null)
				return false;
		} else if (!arrLoc.equals(other.arrLoc))
			return false;
		if (depLoc == null) {
			if (other.depLoc != null)
				return false;
		} else if (!depLoc.equals(other.depLoc))
			return false;
		if (fare != other.fare)
			return false;
		if (flightClass == null) {
			if (other.flightClass != null)
				return false;
		} else if (!flightClass.equals(other.flightClass))
			return false;
		if (flightDuration == null) {
			if (other.flightDuration != null)
				return false;
		} else if (!flightDuration.equals(other.flightDuration))
			return false;
		if (flightNo == null) {
			if (other.flightNo != null)
				return false;
		} else if (!flightNo.equals(other.flightNo))
			return false;
		if (flightTime == null) {
			if (other.flightTime != null)
				return false;
		} else if (!flightTime.equals(other.flightTime))
			return false;
		if (seatAvailability != other.seatAvailability)
			return false;
		if (validTill == null) {
			if (other.validTill != null)
				return false;
		} else if (!validTill.equals(other.validTill))
			return false;
		return true;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public void setDepLoc(String depLoc) {
		this.depLoc = depLoc;
	}

	public void setArrLoc(String arrLoc) {
		this.arrLoc = arrLoc;
	}

	public void setValidTill(Date validTill) {
		this.validTill = validTill;
	}

	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}

	public void setFlightDuration(Double flightDuration) {
		this.flightDuration = flightDuration;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public void setSeatAvailability(boolean seatAvailability) {
		this.seatAvailability = seatAvailability;
	}

	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}




}
