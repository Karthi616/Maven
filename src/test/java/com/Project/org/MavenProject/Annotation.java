package com.Project.org.MavenProject;

import org.testng.annotations.*;


public class Annotation {
	@BeforeSuite
	private void setup() {
		// TODO Auto-generated method stub
		System.out.println("set up");
	}
	@BeforeTest
	private void launch() {
		// TODO Auto-generated method stub
		System.out.println("launch");
	}
	@BeforeClass
	private void url() {
		// TODO Auto-generated method stub
		System.out.println("url");
	}
	@BeforeMethod
	private void login() {
		// TODO Auto-generated method stub
		System.out.println("login");
	}
	@Test
	private void train() {
		// TODO Auto-generated method stub
		System.out.println("search train");
	}
	@Test
	private void boy() {
		// TODO Auto-generated method stub
System.out.println("Dinesh");
	}
	@Test
	private void laptop() {
		// TODO Auto-generated method stub
		System.out.println("search laptop");
	}
	@AfterMethod
	private void logout() {
		// TODO Auto-generated method stub
		System.out.println("logout");
	}
	@AfterClass
	private void verfication() {
		// TODO Auto-generated method stub
		System.out.println("verification");
	}
	@AfterTest
	private void browser_close() {
		// TODO Auto-generated method stub
		System.out.println("close");
	}
	@AfterSuite
	private void delete_cookies() {
		// TODO Auto-generated method stub
System.out.println("sucessfully deleted");
	}
	
	
	
}
