package com.matiasucker.omega.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.matiasucker.omega.entities.Cable;
import com.matiasucker.omega.entities.Group;

public class CableDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Integer number;
	private String code;
	private String description;
	private Integer amountFiber;
	private Integer amountGroup;
	
	private Set<GroupDTO> groups = new HashSet<>();
	
	public CableDTO() {
	}

	public CableDTO(Long id, Integer number, String code, String description, Integer amountFiber,
			Integer amountGroup) {
		this.id = id;
		this.number = number;
		this.code = code;
		this.description = description;
		this.amountFiber = amountFiber;
		this.amountGroup = amountGroup;
	}
	
	public CableDTO(Cable entity) {
		this.id = entity.getId();
		this.number = entity.getNumber();
		this.code = entity.getCode();
		this.description = entity.getDescription();
		this.amountFiber = entity.getAmountFiber();
		this.amountGroup = entity.getAmountGroup();
	}
	
	public CableDTO(Cable entity, Set<Group> groups) {
		this(entity);
		groups.forEach(gro -> this.groups.add(new GroupDTO(gro)));
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getAmountFiber() {
		return amountFiber;
	}

	public void setAmountFiber(Integer amountFiber) {
		this.amountFiber = amountFiber;
	}

	public Integer getAmountGroup() {
		return amountGroup;
	}

	public void setAmountGroup(Integer amountGroup) {
		this.amountGroup = amountGroup;
	}

	public Set<GroupDTO> getGroups() {
		return groups;
	}

	public void setGroups(Set<GroupDTO> groups) {
		this.groups = groups;
	}
	
}
