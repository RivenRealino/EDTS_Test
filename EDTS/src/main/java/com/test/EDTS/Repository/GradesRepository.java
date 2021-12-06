package com.test.EDTS.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.EDTS.Entity.Grades;

public interface GradesRepository extends JpaRepository<Grades,String>{
	
	public Optional<Grades> findByRecid(String recid);

}
