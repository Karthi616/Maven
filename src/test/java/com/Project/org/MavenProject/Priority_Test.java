package com.Project.org.MavenProject;

import org.testng.annotations.*;

public class Priority_Test {
	@Test()
private void browser() {
	System.out.println("Browser Launch");

}
	@Test(priority =4 )
	private void login() {
		System.out.println("login");
	}
	@Test(priority =5 )
	private void searchMobile() {
		System.out.println("searchMobile");
	}
	@Test(priority =1 )
	private void searchlaptop() {
		System.out.println("laptop");
	}
	@Test(priority = 2)
	private void logout() {
		System.out.println("logout");
	}
	@Test(priority = 3)
	private void browserClose() {
		System.out.println("Browser Close");

	}
}
