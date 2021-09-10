package com.matiasucker.omega.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matiasucker.omega.entities.SpliceBox;

@Repository
public interface SpliceBoxRepository extends JpaRepository<SpliceBox, Long>{

}
