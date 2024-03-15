package org.mk.Employeemicroservices.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private String employeeName;
	@Column(nullable = false, unique = true)
	private String employeeEmail;
	@Column(nullable = false)
	private long employeeAssignedProject;
	@Column(nullable = false)
	private String employeeBaseLocation;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public long getEmployeeAssignedProject() {
		return employeeAssignedProject;
	}
	public void setEmployeeAssignedProject(long employeeAssignedProject) {
		this.employeeAssignedProject = employeeAssignedProject;
	}
	public String getEmployeeBaseLocation() {
		return employeeBaseLocation;
	}
	public void setEmployeeBaseLocation(String employeeBaseLocation) {
		this.employeeBaseLocation = employeeBaseLocation;
	}



}
