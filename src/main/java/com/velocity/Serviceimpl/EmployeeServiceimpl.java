package com.velocity.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.Model.Employee;
import com.velocity.Repository.EmployeeRepository;
import com.velocity.Service.EmployeeService;

@Service
public class EmployeeServiceimpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		Employee employee2 = employeeRepository.save(employee);
		return employee2;
	}

}
