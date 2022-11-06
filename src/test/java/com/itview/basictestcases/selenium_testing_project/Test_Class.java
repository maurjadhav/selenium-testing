package com.itview.basictestcases.selenium_testing_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Class 
{

	public static void main(String[] args) throws Exception
	{
		
		//interfaceName instance=new implementClass();
		
				WebDriverManager.chromedriver().setup();
				WebDriver w=new ChromeDriver(); // open blank chrome browser
				
			
	// For the admin user
				
			//	Step 1 : Open application with url
				
				w.get("http://altoromutual.com:8080/login.jsp");
						
			//	Step 2 : Enter username
						
				w.findElement(By.id("uid")).sendKeys("admin");		// uid is the id for the username on the site
				
			//	Step 3 : Enter Password
				
				w.findElement(By.id("passw")).sendKeys("admin");	// passw is the id for the password on the site
				
			//	Step 4: Click login
				
				w.findElement(By.name("btnSubmit")).click();		// btnSubmit is the name of the that button on the website
				
			//	Step 5: Click Logout
				
				Thread.sleep(3000); 								// 3000 millisec = 3 sec		this gives you the 3 sec wating period on the site
				
				w.findElement(By.linkText("Sign Off")).click();		// Sign Off is the linkText for the sign off on the wite
				
			//	Step 6 : Close 
				
				w.quit();											// if some plugins does not work then use close / quit 
				
				System.out.println("Admin test cases passed !!!");

				
	// For test user
				
				WebDriver w1=new ChromeDriver();
				
				w1.get("http://altoromutual.com:8080/login.jsp");
				
				w1.findElement(By.id("uid")).sendKeys("tuser");
				
				w1.findElement(By.id("passw")).sendKeys("tuser");
				
				w1.findElement(By.name("btnSubmit")).click();
				
				Thread.sleep(3000);
				w1.findElement(By.linkText("Sign Off")).click();
				
				w1.quit();
				
				System.out.println("Test user test cases passed !!!");
	}

}
