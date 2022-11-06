package com.itview.basictestcases.selenium_testing_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM_CSS 
{

	public static void main(String[] args)throws Exception 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver w=new ChromeDriver();
		
		// Step 1 : open the browser
		
		w.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		w.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		
		// Step 3 : Enter the password
		w.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");		
		
		w.findElement(By.cssSelector("button[type='submit']")).click();
		
		Thread.sleep(2000);
		
		w.findElement(By.cssSelector("p.oxd-userdropdown-name")).click();
		
		Thread.sleep(2000);
		
		w.findElement(By.cssSelector("a.oxd-userdropdown-link")).click();
		
		w.quit();
		
		System.out.println("Admin test case Passed!!!");



	}

}
