package org.mk.Employeemicroservices.service;

import org.mk.Employeemicroservices.Entity.Employee;
import org.mk.Employeemicroservices.payload.EmployeeDto;

public interface EmployeeService {
	public EmployeeDto saveEmployee(Employee employee);
	public EmployeeDto getEmployeeById(long id);
	

}
