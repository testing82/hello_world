package com.Account;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Account {
	

	@Test(priority=2)  // import testNG 
	public void Login() {
		System.out.println("Login Facebook");
				
	}
	
	@Test(priority=1)
	public void openBrowser() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.ixl.com");
}
	
}
