package com.zensar.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data 
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long departmentId;
//Hibernate Validation  On Api Below
//@Length(max=5,min=1)
//@Size(max=10,min=0)
//@Email
//@Positive
//@Negative
//@NegativeOrZero
//@PositiveOrZero
//@Future
//@Past
//@FutureOrPresent
//@PastOrPresent

@NotBlank(message="Please Add the Department name")
private String departmentName;
private String departmentAddress;
private String departmentCode;
public long getDepartmentId() {
	return departmentId;
}
public void setDepartmentId(long departmentId) {
	this.departmentId = departmentId;
}
public String getDepartmentName() {
	return departmentName;
}
public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}
public String getDepartmentAddress() {
	return departmentAddress;
}
public void setDepartmentAddress(String departmentAddress) {
	this.departmentAddress = departmentAddress;
}
public String getDepartmentCode() {
	return departmentCode;
}
public void setDepartmentCode(String departmentCode) {
	this.departmentCode = departmentCode;
}


}
