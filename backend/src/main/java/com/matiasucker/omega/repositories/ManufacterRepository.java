package com.matiasucker.omega.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matiasucker.omega.entities.Manufacter;

@Repository
public interface ManufacterRepository extends JpaRepository<Manufacter, Long>{

}
