package com.matiasucker.omega.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matiasucker.omega.entities.Operator;

@Repository
public interface OperatorRepository extends JpaRepository<Operator, Long>{

}
