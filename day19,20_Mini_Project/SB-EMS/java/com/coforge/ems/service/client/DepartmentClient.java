package com.coforge.ems.service.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.coforge.ems.dto.DepartmentDTO;


//package name can be .client or .feign //this interacts with another micro service
@FeignClient(name="SB-DMS-SERVICE/api/v1/dms")//enabling the request to communicate with the micro service menctioned in the path combined with what ever the mapping matches inside 
public interface DepartmentClient {
	@GetMapping("/departments/{dno}")
	public DepartmentDTO findDepartmentById(@PathVariable("dno") int dno);
	
	@GetMapping("/departments")
	public List<DepartmentDTO> findAllDepartments();
	
}
