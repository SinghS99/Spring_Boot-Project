package com.zensar.Service;

import java.util.List;

import com.zensar.Entity.Department;
import com.zensar.error.DepartmentNotFoundException;
public interface DepartmentService {

	
	public Department saveDepartment (Department department);

	public List<Department> fetchDepartmentList();

	public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

	public void deleteDepartmentById(Long departmentId);

	public Department updateDepartment(Long departmentId, Department department);

	public Department fetchDepartmentById(String departmentName);

	

}
