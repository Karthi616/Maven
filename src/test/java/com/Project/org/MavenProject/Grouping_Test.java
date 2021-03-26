package com.Project.org.MavenProject;

import org.testng.annotations.*;

public class Grouping_Test {
	@Test(groups = "EmployeeDetails")
private void empname() {
	System.out.println("Karthi");

}
	
	@Test
	private void empid() {
		System.out.println("12333");

	}
	@Test(groups = "PersonalDetails")
	private void empSalary() {
		System.out.println("1737777");

	}
	@Test(groups = "PersonalDetails")
	private void empMobileNo() {
		System.out.println("7338940176");

	}
	@Test(groups ="BankDetails")
	private void empAccNo() {
		System.out.println("ABC1337376BHYG");
		
	}
	@Test(groups ="BankDetails" )
	private void IFSCCode() {
		System.out.println("I48747bf487eggdbknvnrgfvnumflmdjd");
	}
}
