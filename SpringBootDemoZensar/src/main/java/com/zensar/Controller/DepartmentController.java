package com.zensar.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.Entity.Department;
import com.zensar.Service.DepartmentService;
import com.zensar.error.DepartmentNotFoundException;

@RestController
public class DepartmentController {
	
	
	//private final Logger LOGGER=(Logger) LoggerFactory.logger(DepartmentController.class);
	@Autowired
	private  DepartmentService departmentService;
	
	//To Set   Department
@PostMapping("/departments")
	 public Department saveDepartment(@RequestBody Department department) {
	//LOGGER.info("Inside Set   Department i.e Post mapping");
		 return departmentService.saveDepartment(department);
	 }
	//To Get Department
@GetMapping("/departments")
	public List<Department> fetchDepartmentList(){
		return departmentService.fetchDepartmentList();
	}

 //To Get Department By ID
@GetMapping("/departments/{Id}")
public Department fetchDepartmentById(@PathVariable("Id") Long departmentId) throws DepartmentNotFoundException {
	return departmentService.fetchDepartmentById(departmentId);
	
}

//To Delete Department By ID
@DeleteMapping("/departments/{Id}")
public String deleteDepartmentById(@PathVariable("Id") Long departmentId) {
	departmentService.deleteDepartmentById(departmentId);
	return "Department Delted succesfully!!";
}

//TO Get Department & Update Department by Name,Address,code
@PutMapping("/departments/{Id}")
public Department updateDepartment(@PathVariable("Id")Long departmentId,
		                            @RequestBody Department department){
		                            	
	return departmentService.updateDepartment(departmentId,department);
}
//To Get Department By name
@GetMapping("/departments/name/{name}")
public Department fetchDepartmentByNameIgnoreCase(@PathVariable("name") String departmentName) {
	return departmentService.fetchDepartmentById(departmentName);
	
}

}

