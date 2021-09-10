package com.matiasucker.omega.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matiasucker.omega.entities.Group;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long>{

}
