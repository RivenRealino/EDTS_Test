package com.test.EDTS.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "grades")//DEFINE TABLE NAME IN DB
public class Grades {
	
	@Id
	@Column(name = "recid",nullable = false)
	private String recid;
	
	@Column(name = "grades")
	private String grades;
	
	@Column(name = "bonus_percent")
	private double bonus;

	public String getRecid() {
		return recid;
	}

	public void setRecid(String recid) {
		this.recid = recid;
	}

	public String getGrades() {
		return grades;
	}

	public void setGrades(String grades) {
		this.grades = grades;
	}
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}


}
