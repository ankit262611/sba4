
package com.example.demo;


public class Emp {

	public Emp() {}


	public Emp(
		Integer id, String Name, Integer salary)
	{

		super();

		this.id = id;

		this.Name = Name;

		this.salary = salary;

		 
	}

	 private Integer id;

	 private String Name;

	 private Integer salary;


	@Override
public String toString()
	{

		return "Emp [id="
			+ id + ", Name="
			+ Name + ", salary="
			+ salary + "]";

		 
	}

	public Integer getId()
	{

		return id;
	}

	public void setId(Integer id)
	{

		this.id = id;
	}

	public String getName()
	{

		return Name;
	}

	public void setName(
		String Name)
	{

		this.Name = Name;
	}


	public Integer getsalary()
	{

		return salary;
	}

	public void setsalary(Integer salary)
	{

		this.salary = salary;
	}
}
