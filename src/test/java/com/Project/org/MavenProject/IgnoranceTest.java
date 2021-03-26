package com.Project.org.MavenProject;

import org.testng.annotations.*;

public class IgnoranceTest {
	@Test
private void browser() {
	System.out.println("Browser Launch");

}
	@Test
	private void login() {
		System.out.println("login");
	}
	@Test(enabled = false)
	private void searchMobile() {
		System.out.println("searchMobile");
	}
	@Test
	private void searchlaptop() {
		System.out.println("laptop");
	}
	@Test
	private void logout() {
		System.out.println("logout");
	}
	@Test
	private void browserClose() {
		System.out.println("Browser Close");

	}
}
