package org.mishra.app.service;

import java.util.List;

import org.mishra.app.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	public boolean addEmployee(Employee emp);
	public boolean  update(Employee emp ,long id);
	public String  delete(long id);

}
