package com.test.EDTS.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.EDTS.Entity.Employee;
import com.test.EDTS.Entity.Grades;
import com.test.EDTS.Repository.EDTSRepository;
import com.test.EDTS.Repository.GradesRepository;

@Service
public class EDTSService {
	
	@Autowired 
	EDTSRepository edtsRepository;
	
	@Autowired 
	GradesRepository gradesRepository;
	
	public List<Employee> list() {
		return edtsRepository.findAll();
	}
	
	public String create(Employee employee) {
		try {
			
			Optional<Grades> gradeGet = gradesRepository.findByRecid(employee.getGrade());
			
			employee.setGrade(gradeGet.get().getRecid()+":"+gradeGet.get().getGrades());
			
			System.out.println(gradeGet.get().getBonus() / 100);
			
			double total =  employee.getSalary() + (employee.getSalary() * (gradeGet.get().getBonus() / 100));
			
			employee.setTotal_salary(total);
			
			edtsRepository.save(employee);
			return "Record Created";
		} catch (Exception e) {
			e.printStackTrace();
			return "Error Exception : " + e.toString();
		}
	}
	
	public String update(Employee employee) {
		try {
			Optional<Employee> employeeGet = edtsRepository.findById(employee.getId());
			Optional<Grades> gradeGet = gradesRepository.findByRecid(employee.getGrade());

			if (employeeGet.isPresent()) {
				
				employee.setGrade(gradeGet.get().getRecid()+":"+gradeGet.get().getGrades());
				
				System.out.println(gradeGet.get().getBonus() / 100);
				
				double total =  employee.getSalary() + (employee.getSalary() * (gradeGet.get().getBonus() / 100));
				
				employee.setTotal_salary(total);

				edtsRepository.save(employee);
				return "Record Updated";

			} else {
				return "No Record";
			}

		} catch (Exception e) {
			e.printStackTrace();
			return "Error Exception : " + e.toString();
		}
	}

}
