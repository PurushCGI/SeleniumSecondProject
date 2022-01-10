package com.selemium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginLogout{
	
	@Test
	public void LoginLogoutTest() {
		// TODO Auto-generated method stub
		
		 String currentDir = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.findElement(By.name("userName")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		String message=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")).getText();
		Assert.assertEquals("Login Successfully", message, "Login is successful");
		System.out.println("Login and Logout successfully");
		driver.quit();
		}
}
				
		

	


