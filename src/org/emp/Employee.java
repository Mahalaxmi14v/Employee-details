package org.emp;

public class Employee {
public void empId()
{
	System.out.println("employee id is 51722628");
}
public void empName()
{
	System.out.println("employee name Maha");
}
public void empDob()
{
	System.out.println("empoyee dob is 14.1.1993");
}
public void empPhone()
{
	System.out.println("employe phone number is 7550234517");
}
public void empEmail()
{
	System.out.println("employee email id is jovebrave14@gmail.com");
}
public void empAddress()
{
	System.out.println("no:18 natrajar street villupuram");
}
 public static void main (String[] args) {
	Employee emp=new Employee();
	emp.empId();
	emp.empName();
	emp.empDob();
	emp.empPhone();
	emp.empEmail();
	emp.empAddress();
}
}
