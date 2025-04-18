package in.ashokit;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	public Integer empId;
	
	public String empGender;
	public String empName;
	public String empCountry;
	public Double empSalary;
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpCountry(String empCountry) {
		this.empCountry = empCountry;
	}
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empGender=" + empGender + ", empName=" + empName + ", empCountry="
				+ empCountry + ", empSalary=" + empSalary + "]";
	}
	
	

}
