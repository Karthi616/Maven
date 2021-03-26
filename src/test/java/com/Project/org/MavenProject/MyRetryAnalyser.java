package com.Project.org.MavenProject;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyser  implements IRetryAnalyzer{
	int c=0, l=4;
	public boolean retry(ITestResult result) {
		if(c<l) {
			c++;
			return true;
		}
		return false;
	}

}
