package com.Project.org.MavenProject;

import org.testng.annotations.Test;

public class Dependency_Test {
	@Test(dependsOnMethods = "two")
	private void one() {
System.out.println("A");
	}
	
	
	@Test
	private void two() {
System.out.println("b");
	}
	

}
