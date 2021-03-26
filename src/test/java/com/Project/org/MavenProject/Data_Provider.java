package com.Project.org.MavenProject;

import org.testng.annotations.*;

public class Data_Provider {
	@Test(dataProvider= "tes")
private void detail(String username, String password) {
	System.out.println("Username  = "+ username+  " Password  =  "+ password );
	

}
	@DataProvider
private Object[][] tes() {
	return new Object[][] {   {"Karthi", "jjjjdjiuu4848fdbv"}, 
	                          {"Arun", "ugok8u4ur84904i8dug"},
	                          {"Madhan", "iruuru859r8ughjmmq2@"},
	                          {"Yahesh", "kiridirmvm9iu87kjinhunuj{;;p;-0"},
	                          {"Sampath", "orirrjmvijgdff0904844i95;prgidjc"},
	                          {"Bala", "KOCCKIV0-0985858U5]"}
	                          

};
}
}