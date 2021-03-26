package com.Project.org.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Parallel_Test {
	@Test
private void amazon() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");

}
	@Test(groups = "l")
	private void twitter() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/?lang=en");
		
	}
	@Test(groups = "l")
	private void facebook() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test(groups = "l")
		private void Flipkart() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");

		}
		
	
	
}
