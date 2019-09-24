package com.virtusa.vcarpoool.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "findride1")
public class FindRide {
	@Id
	@Column(name = "bookingid")
	private int bookingId;
	@Column(name = "source")
	private String rsource;
	@Column(name = "destination")
	private String rdestination;
	@Column(name = "starttime")
	private String rstartTime;
	@Column(name = "returntime")
	private String rreturnTime;
	@Column(name = "noofseats")
	private int rnoOfSeats;
	@Column(name = "status")
	private String rstatus;
	@Column(name = "usertype")
	private String userType;
	
	@Column(name="employeeid")
	private int employeeId;
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getRsource() {
		return rsource;
	}
	public void setRsource(String rsource) {
		this.rsource = rsource;
	}
	public String getRdestination() {
		return rdestination;
	}
	public void setRdestination(String rdestination) {
		this.rdestination = rdestination;
	}
	public String getRstartTime() {
		return rstartTime;
	}
	public void setRstartTime(String rstartTime) {
		this.rstartTime = rstartTime;
	}
	public String getRreturnTime() {
		return rreturnTime;
	}
	public void setRreturnTime(String rreturnTime) {
		this.rreturnTime = rreturnTime;
	}
	public int getRnoOfSeats() {
		return rnoOfSeats;
	}
	public void setRnoOfSeats(int rnoOfSeats) {
		this.rnoOfSeats = rnoOfSeats;
	}
	public String getRstatus() {
		return rstatus;
	}
	public void setRstatus(String rstatus) {
		this.rstatus = rstatus;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	
	//@OneToOne(fetch = FetchType.LAZY)
	//@PrimaryKeyJoinColumn
}
