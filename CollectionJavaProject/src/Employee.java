import java.util.*;
public class Employee implements Comparable<Employee>{
private int employeeId;
private String employeeName;
private double salary;
private int employeeAge;
private String designation;


public Employee() {}
public Employee(int employeeId,String employeeName,double salary,int employeeAge,String designation) {
this.employeeId=employeeId;
this.employeeName=employeeName;
this.salary=salary;
this.employeeAge=employeeAge;
this.designation=designation;

}
public int getEmployeeID() {
return this.employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId=employeeId;
}
public String getEmployeeName() {
return this.employeeName;
}
public void setEmployeeName(String emlpoyeeName) {
	this.employeeName=employeeName;
}

public double getSalary() {
return this.salary;

}
public void setSalary(double salary) {
	this.salary=salary;
}
public int getEmployeeAge() {
return this.employeeAge;
}
public void setEmployeeAge(int employeeAge) {
	this.employeeAge= employeeAge;
}
public String getdesignation() {
return this.designation;

}
public void setdesignation(String designation) {
	this.designation=designation;
}
@Override
public String toString() {
return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
+ ", employeeAge=" + employeeAge + ", designation=" + designation + "]";
}

@Override
public int compareTo(Employee o) {
return this.employeeId-o.employeeId;
}
}



