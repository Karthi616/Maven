package com.Project.org.MavenProject;

import org.testng.annotations.Test;

public class Multiple_Time {
	@Test
	private void browser() {
		System.out.println("Browser Launch");

	}
		@Test
		private void login() {
			System.out.println("login");
		}
		@Test
		private void searchMobile() {
			System.out.println("searchMobile");
		}
		@Test(invocationCount = 6)
		private void laptop() {
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
