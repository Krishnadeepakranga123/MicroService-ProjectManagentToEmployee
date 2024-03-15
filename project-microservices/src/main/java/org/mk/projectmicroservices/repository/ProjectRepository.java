package org.mk.projectmicroservices.repository;

import org.mk.projectmicroservices.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
	
	public Project findByProjectCode(long employeeAssignedProject);

}
