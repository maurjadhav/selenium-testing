package com.selenium.Web_Object;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;

public class Code_For_navigate_4 
{

	WebDriver w;

	@BeforeTest
	public void beforeTest() 
	{

		WebDriverManager.chromedriver().setup();
		w = new ChromeDriver();
		w.manage().window().maximize();
		
	}

	@Test
	public void Code_For_navigate() throws Exception 
	{
		
	//	w.get("https://www.selenium.dev/");
		  
		 //OR
		
		w.navigate().to("https://www.selenium.dev/");

		Thread.sleep(3000);
		
		w.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span")).click();
		
		Thread.sleep(3000);

		w.navigate().back();
		
		Thread.sleep(3000);

		w.navigate().forward();
		
		Thread.sleep(3000);		
		
		w.navigate().back();


		Thread.sleep(3000);		
		
		w.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[5]/a/span")).click();
		
		Thread.sleep(3000);

		w.navigate().refresh();
		
		Thread.sleep(3000);
        
       
	}

	@AfterTest
	public void afterTest() 
	{

		w.quit();
	}

}
