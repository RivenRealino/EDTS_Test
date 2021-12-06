package com.test.EDTS.Entity;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "employee")//DEFINE TABLE NAME IN DB
public class Employee {
	
	@Id
	@Column(name = "ID",nullable = false)
	private int id;
	
	@Column(name = "Nama")
	private String nama;
	
	@Column(name = "Salary")
	private int salary;
	
	@Column(name = "Grade")
	private String grade;
	
	@Column(name = "Total_salary")
	private double total_salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public double getTotal_salary() {
		return total_salary;
	}

	public void setTotal_salary(double total_salary) {
		this.total_salary = total_salary;
	}

}
