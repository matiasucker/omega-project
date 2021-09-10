package com.matiasucker.omega.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matiasucker.omega.dto.CableDTO;
import com.matiasucker.omega.service.CableService;

@RestController
@RequestMapping(value = "/cables")
public class CableResource {
	
	@Autowired
	private CableService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<CableDTO> findById(@PathVariable Long id) {
		CableDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}

}
