package org.mk.Employeemicroservices.repository;

import org.mk.Employeemicroservices.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
