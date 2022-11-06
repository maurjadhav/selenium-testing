package com.itview.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EducationLoan_PageObj extends TestBase
{
	@FindBy(id="educ_loan")
	public WebElement loanAmountEducationLoan;
	
	@FindBy(id="interest_rate")
	public WebElement intrestRate;
	
	@FindBy(id="loan_period")
	public WebElement lonePeriod;
	
	@FindBy(id="emi_start_from")
	public WebElement emi_startsAfter;
	
	@FindBy(linkText="Submit")
	public WebElement SubmitLink;
	
	@FindBy(id="total_payment")
	public WebElement totalPaymentCalculated;
	
	
	@FindBy(id="emi")
	public WebElement emi_Value_edu;
	
	@FindBy(id="wzrk-cancel")
	public WebElement no_Thanks_Window;
	
	public void call_EducationLoan_PageObj()
	{		
		PageFactory.initElements(w, this); 
	}

}
