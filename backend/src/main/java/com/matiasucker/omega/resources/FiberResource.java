package com.matiasucker.omega.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matiasucker.omega.dto.GroupDTO;
import com.matiasucker.omega.service.GroupService;

@RestController
@RequestMapping(value = "/groups")
public class FiberResource {
	
	@Autowired
	private GroupService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<GroupDTO> findById(@PathVariable Long id) {
		GroupDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}

}
