package com.Project.org.MavenProject;

import org.testng.annotations.*;

public class Exception_Test {
	@Test
 private void add() {
	int d=76;
	int e;
	e=d*d;
	System.out.println("Value of E is  "+ e);
	 
}
	@Test(expectedExceptions =ArithmeticException.class )
	private void divide() {
	int r=98;
	int v=0;
	int f;
	f=r/v;
	System.out.println(f);

	}
}
