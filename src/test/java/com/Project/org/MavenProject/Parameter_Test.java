package com.Project.org.MavenProject;

import org.testng.annotations.*;

public class Parameter_Test {
@Test
	
@Parameters ({"username", "password"})
private void details(String username, int password) {
		System.out.println("Username= "+ username+"Password= "+ password);

	}
}
