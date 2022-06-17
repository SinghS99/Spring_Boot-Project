package com.zensar.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.Entity.Department;
import com.zensar.Service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private  DepartmentService departmentService;
	
	@PostMapping("/departments")
	 public Department saveDepartment(@RequestBody Department department) {
		 return departmentService.saveDepartment(department);
	 }
	
@GetMapping("/departments")
	public List<Department> fetchDepartmentList(){
		return departmentService.fetchDepartmentList();
	}

 
@GetMapping("/departments/{Id}")
public Department fetchDepartmentById(@PathVariable("Id") Long departmentId) {
	return departmentService.fetchDepartmentById(departmentId);
	

}
}
