/*package com.example.SpringBootProject.demo.Budget;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="income")
public class IncomeEntity {

	@Id
	@Column(name = "income_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id ; 
	
	@Column(name = "price")
	private long income ;
	
	public IncomeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IncomeEntity(int id, long income) {
		super();
		this.id = id;
		this.income = income;
	}

	public IncomeEntity(long income) {
		super();
		this.income = income;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getIncome() {
		return income;
	}

	public void setIncome(long income) {
		this.income = income;
	}

	@Override
	public String toString() {
		return "IncomeEntity [id=" + id + ", income=" + income + "]";
	} 
	
	
	
	
}*/
