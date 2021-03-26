package com.Project.org.MavenProject;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Pt {
	@Test
	
	@Parameters ({"username", "password"})
	private void details(@Optional("Kali")String username, int password) {
			System.out.println(" Username= "+ username+  "Password= "+ password);

		}
	}


