package org.mk.Employeemicroservices.Controller;

import org.mk.Employeemicroservices.Entity.Employee;
import org.mk.Employeemicroservices.payload.EmployeeDto;
import org.mk.Employeemicroservices.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	//save the employee
	@PostMapping
	public EmployeeDto createEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
	//get the employee
	@GetMapping("/{employee_id}")
	public EmployeeDto getEmployeeById(@PathVariable long employee_id) {
		return employeeService.getEmployeeById(employee_id);
		
	}

}
