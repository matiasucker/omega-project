package com.matiasucker.omega.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matiasucker.omega.entities.Fiber;

@Repository
public interface FiberRepository extends JpaRepository<Fiber, Long>{

}
