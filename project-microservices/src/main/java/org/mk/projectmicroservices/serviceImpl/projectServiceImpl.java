package org.mk.projectmicroservices.serviceImpl;

import org.mk.projectmicroservices.Entity.Project;
import org.mk.projectmicroservices.repository.ProjectRepository;
import org.mk.projectmicroservices.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class projectServiceImpl implements ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public Project saveProject(Project project) {
		Project saveProject=projectRepository.save(project);
		return saveProject;
	}

	@Override
	public Project getProjectByCode(long projectCode) {
		Project foundProject=projectRepository.findByProjectCode(projectCode);
		return foundProject;
	}

}
