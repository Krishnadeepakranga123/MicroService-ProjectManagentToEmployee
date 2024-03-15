package org.mk.projectmicroservices.service;

import org.mk.projectmicroservices.Entity.Project;

public interface ProjectService {
	
	public Project saveProject(Project project);
	public Project getProjectByCode(long projectCode);

}
