package com.matiasucker.omega.dto;

import java.io.Serializable;

import com.matiasucker.omega.entities.Fiber;
import com.matiasucker.omega.entities.Group;

public class FiberDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Integer number;
	private Boolean occupation;
	private String label;
	
	private GroupDTO group;
	
	public FiberDTO() {
	}

	public FiberDTO(Long id, Integer number, Boolean occupation, String label, GroupDTO group) {
		this.id = id;
		this.number = number;
		this.occupation = occupation;
		this.label = label;
		this.group = group;
	}
	
	public FiberDTO(Fiber entity) {
		this.id = entity.getId();
		this.number = entity.getNumber();
		this.occupation = entity.getOccupation();
		this.label = entity.getLabel();
		this.group = new GroupDTO(entity.getGroup());
	}
	
	public FiberDTO(Fiber entity, Group group) {
		this(entity);
		this.group = new GroupDTO(group);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Boolean getOccupation() {
		return occupation;
	}

	public void setOccupation(Boolean occupation) {
		this.occupation = occupation;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public GroupDTO getGroup() {
		return group;
	}

	public void setGroup(GroupDTO group) {
		this.group = group;
	}
	
}
