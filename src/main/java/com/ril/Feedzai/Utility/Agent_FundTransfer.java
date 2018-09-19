package com.ril.Feedzai.Utility;

import org.openqa.selenium.By;

public class Agent_FundTransfer extends Login_LogOut
{
	public static String Perform_Agent_NEFTTransfer() throws Exception
	{
		Login_LogOut.Agent_LogIn(driver,"2000003446","Ascii@369");
		String otp = Agent_OTP_PP.Agent_BillPaymentTrial(driver, "919769956830");
		driver.findElement(By.xpath(pro.getProperty("Agent_OTP"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("Agent_EnterOtp"))).sendKeys(otp);
		Thread.sleep(2000);                               
		logger.info("OTP Entered");
		driver.findElement(By.xpath(pro.getProperty("Agent_EnteredOtp"))).click();
		Thread.sleep(4000);
		logger.info("Welcome to Agent HomePage");
		//TakeScreenshot.captuerScreenshot(driver, "Agent HomePage");
		Thread.sleep(3000);
		//   driver.get("https://test.rpay.co.in/jioagent/faces/oracle/webcenter/portalapp/pages/landingPage.jsp");
		driver.navigate().refresh();
		Thread.sleep(5000);
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("FundTransfer"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("SendersDetails"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("SendersDetails"))).sendKeys("8779673950");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("Continue"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("Amount1"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("Amount1"))).sendKeys("60");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("TransferTypeDropDown"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("JPB_Option"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("MethodDropDown"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("Method_opt_Neft"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("Proceed"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("Saved_Beneficiary"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("accc"))).click();
		Thread.sleep(3000);
		/*driver.findElement(By.xpath(pro.getProperty("BenefMobileNum"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("BenefMobileNum"))).sendKeys("8779673950");
		Thread.sleep(3000);*/
		driver.findElement(By.xpath(pro.getProperty("Proceed2"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("EnableComments"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("ScanFingerprint"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("Proceed3"))).click();
		Thread.sleep(6000);
		
		String abc =driver.findElement(By.xpath(pro.getProperty("RRN_NEFT_IMPS"))).getText();
		String[] b = abc.split(" ");
		String lastWord = b[b.length-1];
		//System.out.println(lastWord);
		
		return lastWord;
	}
	
	public static String Perform_Agent_IMPSTransfer() throws Exception
	{
		Login_LogOut.Agent_LogIn(driver,"2000003446","Ascii@369");
	/*	String otp = Agent_OTP_PP.Agent_BillPaymentTrial(driver, "919769956830");
		driver.findElement(By.xpath(pro.getProperty("Agent_OTP"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("Agent_EnterOtp"))).sendKeys(otp);
		Thread.sleep(2000);
		logger.info("OTP Entered");
		driver.findElement(By.xpath(pro.getProperty("Agent_EnteredOtp"))).click();
		Thread.sleep(4000);
		logger.info("Welcome to Agent HomePage");
		//TakeScreenshot.captuerScreenshot(driver, "Agent HomePage");
		Thread.sleep(3000);
		//   driver.get("https://test.rpay.co.in/jioagent/faces/oracle/webcenter/portalapp/pages/landingPage.jsp");
		driver.navigate().refresh();
		Thread.sleep(5000);*/
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("FundTransfer"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("SendersDetails"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("SendersDetails"))).sendKeys("8779673950");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("Continue"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("Amount1"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("Amount1"))).sendKeys("60");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("TransferTypeDropDown"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("JPB_Option"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("Proceed"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("Saved_Beneficiary"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("accc"))).click();
		Thread.sleep(3000);
		/*driver.findElement(By.xpath(pro.getProperty("BenefMobileNum"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("BenefMobileNum"))).sendKeys("8779673950");
		Thread.sleep(3000);*/
		driver.findElement(By.xpath(pro.getProperty("Proceed2"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("EnableComments"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("ScanFingerprint"))).click();;
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("Proceed3"))).click();
		Thread.sleep(6000);
		
		String abc =driver.findElement(By.xpath(pro.getProperty("RRN_NEFT_IMPS"))).getText();
		String[] b = abc.split(" ");
		String lastWord = b[b.length-1];
		//System.out.println(lastWord);
		
		return lastWord;
	}
	
	public static String Perform_Agent_P2PTransfer() throws Exception
	{
		Login_LogOut.Agent_LogIn(driver,"2000003446","Ascii@369");
	/*	String otp = Agent_OTP_PP.Agent_BillPaymentTrial(driver, "919769956830");
		driver.findElement(By.xpath(pro.getProperty("Agent_OTP"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("Agent_EnterOtp"))).sendKeys(otp);
		Thread.sleep(2000);
		logger.info("OTP Entered");
		driver.findElement(By.xpath(pro.getProperty("Agent_EnteredOtp"))).click();
		Thread.sleep(4000);
		logger.info("Welcome to Agent HomePage");
		//TakeScreenshot.captuerScreenshot(driver, "Agent HomePage");
		Thread.sleep(3000);
		//   driver.get("https://test.rpay.co.in/jioagent/faces/oracle/webcenter/portalapp/pages/landingPage.jsp");
		driver.navigate().refresh();
		Thread.sleep(5000);*/
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("FundTransfer"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("SendersDetails"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("SendersDetails"))).sendKeys("8779673950");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("Continue"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("Amount1"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("Amount1"))).sendKeys("60");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("TransferTypeDropDown"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("JPB"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("Proceed"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("Saved_Beneficiary"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("acc1"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("Proceed2"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("EnableComments"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("ScanFingerprint"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("Proceed3"))).click();
		Thread.sleep(6000);
		
		String abc =driver.findElement(By.xpath(pro.getProperty("RRNText1"))).getText();
		String[] b = abc.split(" ");
		String lastWord = b[b.length-1];
		//System.out.println(lastWord);
		
		return lastWord;
	}
}

