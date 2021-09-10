package com.matiasucker.omega.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.matiasucker.omega.entities.Cable;
import com.matiasucker.omega.entities.Fiber;
import com.matiasucker.omega.entities.Group;

public class GroupDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Integer numGroup;
	
	private Cable cable;
	
	private Set<FiberDTO> fibers = new HashSet<>();
	
	public GroupDTO() {
	}

	public GroupDTO(Long id, Integer numGroup, Cable cable) {
		this.id = id;
		this.numGroup = numGroup;
		this.cable = cable;
	}
	
	public GroupDTO(Group entity) {
		this.id = entity.getId();
		this.numGroup = entity.getNumGroup();
		this.cable = entity.getCable();
	}
	
	public GroupDTO(Group entity, Set<Fiber> fibers) {
		this(entity);
		fibers.forEach(fib -> this.fibers.add(new FiberDTO(fib)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNumGroup() {
		return numGroup;
	}

	public void setNumGroup(Integer numGroup) {
		this.numGroup = numGroup;
	}

	public Cable getCable() {
		return cable;
	}

	public void setCable(Cable cable) {
		this.cable = cable;
	}

	public Set<FiberDTO> getFibers() {
		return fibers;
	}

	public void setFibers(Set<FiberDTO> fibers) {
		this.fibers = fibers;
	}
	
}
