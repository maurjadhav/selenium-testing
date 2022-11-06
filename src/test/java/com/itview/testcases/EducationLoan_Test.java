package com.itview.testcases;

import org.testng.annotations.Test;

import com.itview.pageobject.EducationLoan_PageObj;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class EducationLoan_Test 
{
	EducationLoan_PageObj eduLoan=new EducationLoan_PageObj();
	
	
  @BeforeTest
  public void openBrowserCode() throws Exception 
  {	  
	  eduLoan.openBrowser(eduLoan.readFromPropertiesFiles("browser"));
	  eduLoan.call_EducationLoan_PageObj();
  }
  
  @Test(priority = 0,description = "Test Case to verify emi on Education Loan of 1000000 ")
  public void loanAmount_100000() throws Exception
  {
	  eduLoan.openApplication(eduLoan.readFromPropertiesFiles("url_education"));
	  eduLoan.handleClickEvent(eduLoan.no_Thanks_Window);
	  
	  eduLoan.waitForSec(2);
	  
	  eduLoan.handleTextBox(eduLoan.loanAmountEducationLoan, "1000000");
	  eduLoan.handleTextBox(eduLoan.intrestRate, "11");
	  
	  eduLoan.waitForSec(2);
	  
	  eduLoan.handleTextBox(eduLoan.lonePeriod, "10");
	  eduLoan.handleTextBox(eduLoan.emi_startsAfter, "12");
	  
	  eduLoan.waitForSec(3);
	  
	  eduLoan.handleClickEvent(eduLoan.SubmitLink);
	  
	  String print_TotalPayment=eduLoan.totalPaymentCalculated.getText();
	  
	  System.out.println("Total Payment on Education Loan : "+print_TotalPayment);

	  String print_EMIValue=eduLoan.emi_Value_edu.getText();
	  
	  System.out.println("EMI on Education Loan : "+print_EMIValue);
	 

  }

  @AfterTest
  public void afterTest() 
  {
	  eduLoan.closeBrowser();
  }

}
