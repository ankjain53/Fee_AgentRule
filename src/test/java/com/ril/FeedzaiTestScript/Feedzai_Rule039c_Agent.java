//Rule 039c : Agent on negative list [Decline].

package com.ril.FeedzaiTestScript;

import org.openqa.selenium.By;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Utility.Agent_BillPayment;
import com.ril.Feedzai.Utility.Agent_LoadMoney;
import com.ril.Feedzai.Utility.Agent_OTP_PP;
import com.ril.Feedzai.Utility.Agent_Services;
import com.ril.Feedzai.Utility.Login_LogOut;
import com.ril.Feedzai.Utility.TakeScreenshot;


//@Test(groups = "AgentRule")
public class Feedzai_Rule039c_Agent extends FeedzaiTestBaseClass
{
	
	@Test(priority=13, description="Pulse Changes-Rule 039c")
	public void PulseChange_039c() throws Exception 
	{
		//******************PULSE PORTAL RULE 039c CHANGES
		   logger1 = extent.createTest("Pulse Changes-Rule 039c");
		   logger.info("Rule1");
		   Login_LogOut.Pulse_LogIn();
		   logger.info("Rule2");
			driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).click();
	        Thread.sleep(5000);
			driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("39c");
			Thread.sleep(2000);
			driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
			Thread.sleep(7000);
			logger.info("RuleSelected");	

			//CHECK RULE IS ENABLED
			Login_LogOut.EnableCheckbox();

			Login_LogOut.ScrollPage();
			driver.findElement(By.xpath(pro.getProperty("pulse_delAction"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(pro.getProperty("RuleAct"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(pro.getProperty("pulse_ActionBlock"))).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).sendKeys(pro.getProperty("ALERTTYPE3"));
			Thread.sleep(4000);
			driver.findElement(By.xpath(pro.getProperty("pulse_SaveAlertType"))).click();
			Thread.sleep(8000);
			logger.info("Alert Type Selected");
			driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
			Thread.sleep(10000);
		
			//list

			driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
	        Thread.sleep(5000);
	        
			driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("agent_negative");
			Thread.sleep(4000);
			driver.findElement(By.xpath(pro.getProperty("ClickonList"))).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath(pro.getProperty("AddButton"))).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath(pro.getProperty("NewItemValue"))).sendKeys("1000001973");
			Thread.sleep(4000);
			driver.findElement(By.xpath(pro.getProperty("Comment"))).sendKeys("Test");
			Thread.sleep(4000);
			//CHECK LIMIT IS ENABLED
			driver.findElement(By.xpath(pro.getProperty("pulse_RuleEnabled"))).click();
			logger.info("CheckBox is Selected for 39c");
			driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
			Thread.sleep(10000);
			Login_LogOut.Pulse_LogOut();
	
	} 
		
	//RULE VERIFICATION IN ALERT MANAGER
	
	@Test(priority=14, description="Validate Agent 039c rule trigger" )
	public void Validate_39c() throws Exception 
	{
		logger1 = extent.createTest("AgentTransaction");
		Login_LogOut.Agent_LogIn(driver,"2000003446","Ascii@369");
		String otp = Agent_OTP_PP.Agent_BillPaymentTrial(driver,"919769956830");
		driver.findElement(By.xpath(pro.getProperty("Agent_OTP"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("Agent_EnterOtp"))).sendKeys(otp);
		Thread.sleep(2000);
		logger.info("OTP Entered");
		driver.findElement(By.xpath(pro.getProperty("Agent_EnteredOtp"))).click();
		Thread.sleep(4000);
		logger.info("Welcome to Agent HomePage");
		TakeScreenshot.captuerScreenshot(driver, "Agent HomePage");
		Thread.sleep(3000);
	
     /*  String CashWithdrawal = Agent_Services.CashWithdrawal_BCServices();
        System.out.println(CashWithdrawal);
         logger.info("RRN Captured"); */
	
		 driver.findElement(By.xpath(pro.getProperty("Agent_ConsumerServices"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("Agent_LoadJioMoney"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("Agent_LoadJioMoneyMobilNumber"))).sendKeys("9746986974"); //7880000052
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(pro.getProperty("AGN_LoadJioMoneyAmount"))).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(pro.getProperty("AGN_LoadJioMoneyEnterAmount"))).sendKeys("1");
	        //driver.findElement(By.xpath(pro.getProperty("AGN_LoadJioMoneyEnterAmount"))).sendKeys("1");

	        Thread.sleep(5000);
	        driver.findElement(By.xpath(pro.getProperty("AGN_Tabout"))).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(pro.getProperty("AGN_LoadJioMoney"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("AGN_ConfirmLoadMoney"))).click();
	        Thread.sleep(7000);
	       // String status = driver.findElement(By.xpath(pro.getProperty("AGN_CheckTranStatus"))).getText();
	       // Assert.assertEquals(status, "Successful", "LoadMoney Transaction Failed");
	        driver.findElement(By.xpath(pro.getProperty("click_Agentok"))).click();
	        Thread.sleep(6000);
	        logger.info("Transaction Completed");
	        driver.findElement(By.xpath(pro.getProperty("Agent_Reports_ss"))).click(); 
		    Thread.sleep(4000);
		    driver.findElement(By.xpath(pro.getProperty("AGN_TransactionHistory"))).click(); 
	        Thread.sleep(5000);
		    Select sa= new Select(driver.findElement(By.xpath(pro.getProperty("AGN_SelectTransHistory"))));
		    sa.selectByVisibleText("Today");
		    Thread.sleep(1000);
		    driver.findElement(By.xpath(pro.getProperty("AGN_SelectTransDate_ss"))).click(); 
	        Thread.sleep(5000);
	        String LoadMoneyId = driver.findElement(By.xpath(pro.getProperty("AGN_TransactionID"))).getText();
	        System.out.println(LoadMoneyId);
	        logger.info("RRN Captured");
	        driver.findElement(By.xpath(pro.getProperty("AGN_SelectHome_ss"))).click(); 
	        Thread.sleep(5000);
		
	
		Login_LogOut.Agent_LogOut();
		//System.out.println("LoadMoneyId" + LoadMoneyId);
		

		//RULE VERIFICATION IN ALERT MANAGER
		Login_LogOut.AM_LogIn();
		driver.findElement(By.xpath(pro.getProperty("AM_search"))).click();
		Thread.sleep(4000);
		logger.info("Clicked on Search Page");
		driver.findElement(By.xpath(pro.getProperty("AM_EnterTransactionId"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("AM_EnterTransactionId"))).sendKeys(LoadMoneyId);
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("AM_SearchTransactionId"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("AM_ViewTransactionId"))).click();
		Thread.sleep(7000);
		logger.info("LoadMoney Transaction Viewed");
		String StoreRule1 = driver.findElement(By.xpath(pro.getProperty("AM_VerifyRuleTriggered"))).getText();
		System.out.println(StoreRule1);
		Thread.sleep(3000);
		SoftAssert sa1=new SoftAssert();
		TakeScreenshot.captuerScreenshot(driver, "Rules Captured ");
		sa1.assertTrue(StoreRule1.contains("Rule #39c"));
		Login_LogOut.AM_LogOut();
	}   
	
	
	//REVERT RULE IN PULSE

		//REVERT RULE#039c IN PULSE

		@Test(priority=15, description="Pulse Revert changes-039c")
		public void PulseRevert_039c() throws Exception 
		{
			logger1 = extent.createTest("Pulse Revert changes-039c");
			Login_LogOut.Pulse_LogIn();
			
			driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("agent_negative");
			Thread.sleep(4000);
			driver.findElement(By.xpath(pro.getProperty("ClickonList"))).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath(pro.getProperty("ListItemEntry"))).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath(pro.getProperty("ListItemEntry"))).sendKeys("1000001973");
			Thread.sleep(4000);
			driver.findElement(By.xpath(pro.getProperty("DeleteFromTrash"))).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath(pro.getProperty("DeleteButton"))).click();
			Thread.sleep(4000);
			Login_LogOut.Pulse_LogOut();
			
			
		}
	
}

