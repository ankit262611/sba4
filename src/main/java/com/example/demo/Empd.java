package com.example.demo;

import org.springframework
	.stereotype
	.Repository;

@Repository


public class Empd {

	private static Emps list
		= new Emps();


	static
	{

		list.getEmpList().add(
			new Emp(
				1,
				"Employee1",
				1000));

		list.getEmpList().add(
			new Emp(
				2, "Employee2",
				2000));
		list.getEmpList().add(
				new Emp(
					3, "Employee3",
					3000));
		list.getEmpList().add(
				new Emp(
					4, "Employee4",
					4000));
		list.getEmpList().add(
				new Emp(
					5, "Employee5",
					5000));
		list.getEmpList().add(
				new Emp(
					6, "Employee6",
					6000));
		list.getEmpList().add(
				new Emp(
					7, "Employee7",
					7000));
		list.getEmpList().add(
				new Emp(
					8, "Employee8",
					8000));
		list.getEmpList().add(
				new Emp(
					9, "Employee9",
					9000));
		list.getEmpList().add(
				new Emp(
					10, "Employee10",
					10000));

		 
	}


	public Emps getAllEmps()
	{

		return list;
	}


		public void
		addEmp(Emp emp)
	{
		list.getEmpList()
			.add(emp);
		 
	}
}
