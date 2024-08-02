package com.cg.EO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
@Entity
public class EmpEO {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String emp_Name;
	private String emp_EmailId;
	@Max(60)
	@Min(18)
	private int emp_Age;
	
	
	public EmpEO() {
		super();
		this.id = id;
		this.emp_Name = emp_Name;
		this.emp_EmailId = emp_EmailId;
		this.emp_Age = emp_Age;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmp_Name() {
		return emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}
	public String getEmp_EmailId() {
		return emp_EmailId;
	}
	public void setEmp_EmailId(String emp_EmailId) {
		this.emp_EmailId = emp_EmailId;
	}
	public int getEmp_Age() {
		return emp_Age;
	}
	public void setEmp_Age(int emp_Age) {
		this.emp_Age = emp_Age;
	}
	
	
	
	
	
	
	
	
}