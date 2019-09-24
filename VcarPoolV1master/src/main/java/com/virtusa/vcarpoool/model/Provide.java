package com.virtusa.vcarpoool.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="provide2")
public class Provide {
	@Id
	@Column(name="poolid")
	private int poolId;
	@Column(name = "employeeId")
	private int employeeId;
	@Column(name = "source")
	private String source;
	@Column(name = "destination")
	private String destination;
	@Column(name = "startTime")
	private String startTime;
	@Column(name = "returnTime")
	private String returnTime;
	@Column(name = "noOfSeats")
	private int noOfSeats;
	@Column(name = "status")
	private String status;
	
	@Column(name ="currentDate")
	private String currentDate;

	public int getPoolId() {
		return poolId;
	}

	public void setPoolId(int poolId) {
		this.poolId = poolId;
	}

	@Override
	public String toString() {
		return "Provide [poolId=" + poolId + ", employeeId=" + employeeId + ", source=" + source + ", destination="
				+ destination + ", startTime=" + startTime + ", returnTime=" + returnTime + ", noOfSeats=" + noOfSeats
				+ ", status=" + status + ", currentDate=" + currentDate + "]";
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(String returnTime) {
		this.returnTime = returnTime;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}


	
}
