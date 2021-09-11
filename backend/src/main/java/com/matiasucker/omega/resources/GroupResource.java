package com.matiasucker.omega.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matiasucker.omega.dto.FiberDTO;
import com.matiasucker.omega.service.FiberService;

@RestController
@RequestMapping(value = "/fibers")
public class GroupResource {
	
	@Autowired
	private FiberService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<FiberDTO> findById(@PathVariable Long id) {
		FiberDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}

}
