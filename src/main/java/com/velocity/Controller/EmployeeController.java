package com.velocity.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.Model.Employee;
import com.velocity.Service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/saveEmployee")
	public Employee saveEmployee( @RequestBody Employee employee) {
	Employee emp1=	employeeService.saveEmployee(employee);
		return emp1;
		
	}
}
