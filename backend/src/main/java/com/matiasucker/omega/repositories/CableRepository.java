package com.matiasucker.omega.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matiasucker.omega.entities.Cable;

@Repository
public interface CableRepository extends JpaRepository<Cable, Long>{

}
