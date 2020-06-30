package org.mishra.app.service;

import java.util.List;
import org.mishra.app.model.Employee;
import org.mishra.app.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
     @Autowired
	private EmployeeRepository emprepository;
     
	@Override
	public List<Employee> getAllEmployees() {
		 return emprepository.findAll();
	}
	@Override
	public boolean addEmployee(Employee emp) {
		 emprepository.save( emp);
		return true;
	}
	@Override
	public boolean update(Employee emp ,long id) {
		emp.setId(id);
		emprepository.save(emp);
		return true;
	}
	@Override
	public String delete(long id) {
		emprepository.deleteById(id);
		return "data is deleted";
	}

}
 