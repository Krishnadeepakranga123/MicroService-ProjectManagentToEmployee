package org.mk.Employeemicroservices.serviceImpl;

import org.mk.Employeemicroservices.Entity.Employee;
import org.mk.Employeemicroservices.feignclient.Projectfeign;
import org.mk.Employeemicroservices.payload.EmployeeDto;
import org.mk.Employeemicroservices.payload.Project;
import org.mk.Employeemicroservices.repository.EmployeeRepository;
import org.mk.Employeemicroservices.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import feign.Response;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private Projectfeign projectfeign;

	@Override
	public EmployeeDto saveEmployee(Employee employee) {
		Employee savedEmployee=employeeRepository.save(employee);
		Response response=projectfeign.getProjectByCode(savedEmployee.getEmployeeAssignedProject());
		String body=response.body().toString();
		Gson g=new Gson();
		Project project=g.fromJson(body, Project.class);
		EmployeeDto employeeDto=new EmployeeDto();
		employeeDto.setId(savedEmployee.getId());
		employeeDto.setEmployeeName(savedEmployee.getEmployeeName());
		employeeDto.setEmployeeEmail(savedEmployee.getEmployeeEmail());
		employeeDto.setEmployeeBaseLocation(savedEmployee.getEmployeeBaseLocation());
		employeeDto.setProjectCode(project.getProjectCode());
		employeeDto.setProjectName(project.getProjectName());
		return employeeDto;
	}

	@Override
	public EmployeeDto getEmployeeById(long id) {
		
		Employee foundEmployee=employeeRepository.findById(id).get();
		Response response=projectfeign.getProjectByCode(foundEmployee.getEmployeeAssignedProject());
		String body=response.body().toString();
		Gson g=new Gson();
		Project project=g.fromJson(body, Project.class);
		EmployeeDto employeeDto=new EmployeeDto();
		employeeDto.setId(foundEmployee.getId());
		employeeDto.setEmployeeName(foundEmployee.getEmployeeName());
		employeeDto.setEmployeeEmail(foundEmployee.getEmployeeEmail());
		employeeDto.setEmployeeBaseLocation(foundEmployee.getEmployeeBaseLocation());
		employeeDto.setProjectCode(project.getProjectCode());
		employeeDto.setProjectName(project.getProjectName());
		
		return employeeDto;
	}

}
