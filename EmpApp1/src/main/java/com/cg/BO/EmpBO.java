package com.cg.BO;

import lombok.Data;

import lombok.Data;

@Data
public class EmpBO {
	
	private long id;
	private String emp_Name;
	private String emp_EmailId;
	private int emp_Age;
	
	
	public EmpBO() {
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
