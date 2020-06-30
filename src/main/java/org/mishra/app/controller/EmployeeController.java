package org.mishra.app.controller;
import java.util.List;

import org.mishra.app.model.Employee;
import org.mishra.app.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	
	
	@Autowired
	private EmployeeServiceImpl empservice;
	//dipsly list of employee
	/*
	 * @GetMapping("/") public String viewHomePage(Model model) {
	 * model.addAttribute("Listemployees", empservice.getAllEmployees()); return
	 * "index"; }
	 */	@PostMapping("/empSave")
		public boolean addEmployee(@RequestBody Employee emp) {
			empservice.addEmployee(emp);
			return true;
		}
		@GetMapping("/display")
		public List<Employee>display() {
           List<Employee> emp =empservice.getAllEmployees();
           return emp;
			}
		@PutMapping("/update/{id}")	
		public boolean update(@RequestBody Employee emp,@PathVariable long id) {
			empservice.update(emp,id);
			return true;
		}
		@DeleteMapping("/delete/{id}")
		public String delete(@PathVariable long id) {
		  empservice.delete(id);
			
			
			return "Delete Successfully  id = :" +id;
		}

		
}
