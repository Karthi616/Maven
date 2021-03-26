package com.Project.org.MavenProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertValid {
	@Test
private void user() {
String actual="Gopi";
String exp="GOPI";
Assert.assertEquals(actual, exp);
Assert.assertTrue(8==9);
}
}
