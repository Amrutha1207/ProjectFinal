package com.virtusa.vcarpoool.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userregister1")

public class Employee {
	/**
	 *
	 */
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeEmailId="
				+ employeeEmailId + ", passkey=" + passkey + ", employeeOccupation=" + employeeOccupation
				+ ", employeeCountry=" + employeeCountry + ", employeeCity=" + employeeCity + ", employeeGender="
				+ employeeGender + ", employeeMobileNo=" + employeeMobileNo + ", securityQuestion=" + securityQuestion
				+ ", securityAnswer=" + securityAnswer + "]";
	}
	@Id
	@Column(name="employeeid")
	private int employeeId;
	@Column(name = "name")
	private String employeeName;
	@Column(name = "emailid")
	private String employeeEmailId; 
	@Column(name = "password")
	private String passkey;
	@Column(name = "occupation")
	private String employeeOccupation;
	@Column(name = "country")
	private String employeeCountry;
	@Column(name = "city")
	private String employeeCity;
	@Column(name = "gender")
	private String employeeGender;
	@Column(name = "mobile")
	private long employeeMobileNo;
	@Column(name = "sq")
	private String securityQuestion;
	@Column(name = "sa")
	private String securityAnswer;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeEmailId() {
		return employeeEmailId;
	}
	public void setEmployeeEmailId(String employeeEmailId) {
		this.employeeEmailId = employeeEmailId;
	}
	public String getPasskey() {
		return passkey;
	}
	public void setPasskey(String passkey) {
		this.passkey = passkey;
	}
	public String getEmployeeOccupation() {
		return employeeOccupation;
	}
	public void setEmployeeOccupation(String employeeOccupation) {
		this.employeeOccupation = employeeOccupation;
	}
	public String getEmployeeCountry() {
		return employeeCountry;
	}
	public void setEmployeeCountry(String employeeCountry) {
		this.employeeCountry = employeeCountry;
	}
	public String getEmployeeCity() {
		return employeeCity;
	}
	public void setEmployeeCity(String employeeCity) {
		this.employeeCity = employeeCity;
	}
	public String getEmployeeGender() {
		return employeeGender;
	}
	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}
	public long getEmployeeMobileNo() {
		return employeeMobileNo;
	}
	public void setEmployeeMobileNo(long employeeMobileNo) {
		this.employeeMobileNo = employeeMobileNo;
	}
	public String getSecurityQuestion() {
		return securityQuestion;
	}
	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}
	public String getSecurityAnswer() {
		return securityAnswer;
	}
	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}
	
			
}
	