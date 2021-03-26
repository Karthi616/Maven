package com.Project.org.MavenProject;

import org.testng.annotations.Test;

public class TimeOut {
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
		@Test(invocationCount = 8)
		private void searchlaptop() {
			System.out.println("laptop");
		}
		@Test(timeOut = 3000)
		private void logout() throws InterruptedException {
			//Thread.sleep(5000);
			System.out.println("logout");
		}
		@Test
		private void browserClose() {
			System.out.println("Browser Close");

		}
}
