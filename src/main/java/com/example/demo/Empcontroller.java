package com.example.demo;

import java.net.URI;
import org.springframework.beans
	.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.Emps;
import com.example.demo.Empd;
import com.example.demo.Emp;


@RestController
@RequestMapping(path = "/employees")
public class Empcontroller {

	@Autowired
 private Empd empd;
	 

 @GetMapping(
		path = "/",
		produces = "application/json")

	public Emps getEmps()
	{

		return empd
			.getAllEmps();
	}

	 

 @PostMapping(
		path = "/",
		consumes = "application/json",
		produces = "application/json")

	public ResponseEntity<Object> addEmp(
		@RequestBody Emp emp)
	{


		Integer id
			= empd
				.getAllEmps()
				.getEmpList()
				.size()
			+ 1;

		emp.setId(id);

		empd
			.addEmp(emp);

		URI location
			= ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(
					emp.getId())
				.toUri();

		   return ResponseEntity
			.created(location)
			.build();
	}
}
