package com.matiasucker.omega.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.matiasucker.omega.dto.CableDTO;
import com.matiasucker.omega.entities.Cable;
import com.matiasucker.omega.repositories.CableRepository;
import com.matiasucker.omega.service.exceptions.ResourceNotFoundException;

@Service
public class CableService {
	
	@Autowired
	private CableRepository repository;
	
	@Transactional(readOnly = true)
	public CableDTO findById(Long id) {
		Optional<Cable> obj = repository.findById(id);
		Cable entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new CableDTO(entity);
	}

}
