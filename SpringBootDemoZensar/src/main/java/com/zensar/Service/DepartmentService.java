package com.zensar.Service;

import java.util.List;

import com.zensar.Entity.Department;
public interface DepartmentService {

	
	public Department saveDepartment (Department department);

	public List<Department> fetchDepartmentList();

	public Department fetchDepartmentById(Long departmentId);

	

}
