package com.matiasucker.omega.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.matiasucker.omega.dto.FiberDTO;
import com.matiasucker.omega.entities.Fiber;
import com.matiasucker.omega.repositories.FiberRepository;
import com.matiasucker.omega.service.exceptions.ResourceNotFoundException;

@Service
public class FiberService {
	
	@Autowired
	private FiberRepository repository;
	
	@Transactional(readOnly = true)
	public FiberDTO findById(Long id) {
		Optional<Fiber> obj = repository.findById(id);
		Fiber entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new FiberDTO(entity, entity.getGroup());
	}

}
