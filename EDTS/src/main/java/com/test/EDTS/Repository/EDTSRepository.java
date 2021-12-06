package com.test.EDTS.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.EDTS.Entity.Employee;

public interface EDTSRepository extends JpaRepository<Employee,String>{
	
	public Optional<Employee> findById(int Id);

}
