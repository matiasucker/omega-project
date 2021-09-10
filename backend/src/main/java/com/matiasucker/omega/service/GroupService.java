package com.matiasucker.omega.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.matiasucker.omega.dto.GroupDTO;
import com.matiasucker.omega.entities.Group;
import com.matiasucker.omega.repositories.GroupRepository;
import com.matiasucker.omega.service.exceptions.ResourceNotFoundException;

@Service
public class GroupService {
	
	@Autowired
	private GroupRepository repository;
	
	@Transactional(readOnly = true)
	public GroupDTO findById(Long id) {
		Optional<Group> obj = repository.findById(id);
		Group entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new GroupDTO(entity, entity.getFibers());
	}

}
