package com.itview.testing;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;

public class LoginTestScenario 
{
	WebDriver w;
	
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  w=new ChromeDriver();  
  }
  
  // priority			: It gives the priority which test case should run first and starts with the 0,1,2,3....
  // description		: It gives the information of the test case
  // group				: Creates the group of the test cases of the same functionality
  // dependsOnMethods	: If it is given then if the test case is failed then the depending test cases are not executed
  // invocationCount	: It runs the test multiple times
  
  @Test(priority = 0, description = "Verify Login functionality using 'Admin' user", groups="Login", invocationCount = 2, enabled = true)
  public void loginAdmin() throws Exception
  {
	  w.get("http://altoromutual.com:8080/login.jsp");	
	  w.findElement(By.id("uid")).sendKeys("admin");
	  w.findElement(By.id("passw")).sendKeys("admin");
	  w.findElement(By.name("btnSubmit")).click();
	  Thread.sleep(3000); 		
	  w.findElement(By.linkText("Sign Off")).click();
  }
  
  @Test(priority = 1, description = "Verify Login functionality using 'Tuser' user",groups="Login",  dependsOnMethods = "loginAdmin", enabled = true)
  public void loginTuser() throws Exception
  {
	  w.get("http://altoromutual.com:8080/login.jsp");	
	  w.findElement(By.id("uid")).sendKeys("tuser");
	  w.findElement(By.id("passw")).sendKeys("tuser");
	  w.findElement(By.name("btnSubmit")).click();
	  Thread.sleep(3000); 		
	  w.findElement(By.linkText("Sign Off")).click();
  }
  
  @Test(priority = 2, description = "Verify Login functionality using 'Jsmith' user", groups="Login", dependsOnMethods = "loginAdmin")
  public void loginJsmith() throws Exception
  {
	  w.get("http://altoromutual.com:8080/login.jsp");	
	  w.findElement(By.id("uid")).sendKeys("jsmith");
	  w.findElement(By.id("passw")).sendKeys("Demo1234");
	  w.findElement(By.name("btnSubmit")).click();
	  Thread.sleep(3000); 		
	  w.findElement(By.linkText("Sign Off")).click();
  }
  
  @Test(priority = 3, description = "Verify Login functionality using 'Sspeed' user", groups="Login", dependsOnMethods = "loginAdmin")
  public void loginSspeed() throws Exception
  {
	  w.get("http://altoromutual.com:8080/login.jsp");	
	  w.findElement(By.id("uid")).sendKeys("sspeed");
	  w.findElement(By.id("passw")).sendKeys("Demo1234");
	  w.findElement(By.name("btnSubmit")).click();
	  Thread.sleep(3000); 		
	  w.findElement(By.linkText("Sign Off")).click();
  }
  
  @Test(priority = 4, description = "Verify Login functionality using 'Invalid' user", groups="Login",  dependsOnMethods = "loginAdmin")
  public void loginInvalid() throws Exception
  {
	  w.get("http://altoromutual.com:8080/login.jsp");	
	  w.findElement(By.id("uid")).sendKeys("invalid");
	  w.findElement(By.id("passw")).sendKeys("invalid");
	  w.findElement(By.name("btnSubmit")).click();
  }
  
  @AfterTest
  public void afterTest() 
  {
	  w.quit();	  
  }

}
