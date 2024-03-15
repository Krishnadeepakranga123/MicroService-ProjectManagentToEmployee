package org.mk.Employeemicroservices.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import feign.Response;

@FeignClient(url = "http://localhost:8081",value = "project-feign-client",path = "/api/project")
public interface Projectfeign {
	
	@GetMapping("/{project_code}")
	feign.Response  getProjectByCode(@PathVariable long project_code) ;


}
