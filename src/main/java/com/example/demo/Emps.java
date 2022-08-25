package com.example.demo;

import java.util.ArrayList;
import java.util.List;


public class Emps {

	private List<Emp> empList;


	public List<Emp> getEmpList()
	{

		if (empList == null) {

			empList
				= new ArrayList<>();

			   
		}

		return empList;

		 
	}

	public void
	setEmpList(
		List<Emp> empList)
	{
		this.empList
			= empList;
	}
}
