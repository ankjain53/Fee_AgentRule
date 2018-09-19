//Rule 116 : Single high amount bill payment at an agent. [Alert]
//Rule 118 : Agent transaction count over monthly limit [Alert Limit].
//rule 119 : Agent cumulative transaction amount over monthly limit [Alert Limit].
//Rule 120 : Agent's cumulative amount of bill payments is over daily limit [Alert Limit]. This is a possible commission revenue leakage.
//Rule 121 : Large number of load-money operations from an agent to a particular account during the last 28 days [Alert Limit]. This is a possible commission revenue leakage.
//Rule 019 : Cumulative amount of loadmoney transactions from agent to customer in a calendar month above the limit [Decline Limit].

package com.ril.FeedzaiTestScript;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Utility.Agent_Services;
import com.ril.Feedzai.Utility.Agent_BillPayment;
import com.ril.Feedzai.Utility.Agent_LoadMoney;
import com.ril.Feedzai.Utility.Agent_OTP_PP;
import com.ril.Feedzai.Utility.Login_LogOut;
import com.ril.Feedzai.Utility.TakeScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;


public class Feedzai_Rule116_118_119_120_121_019_Agent extends FeedzaiTestBaseClass
{
	
		@Test(priority=1, description="Pulse Changes-Rule 116")
	public void AgentAllRuleTest_116() throws Exception 
	{
		//PULSE PORTAL RULE#116 CHANGE
		logger1 = extent.createTest("Pulse Changes-Rule 116");
		Login_LogOut.Pulse_LogIn();
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("116");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
		Thread.sleep(7000);
		logger.info("Rule#116 Selected");

		//CHECK RULE IS ENABLED
		Login_LogOut.EnableCheckbox();


		//SET RULE VARIABLE
		Login_LogOut.SetRuleVariable("threshold=5.0;");

		driver.findElement(By.xpath(pro.getProperty("pulse_delAction"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("RuleAct"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("pulse_ActionAlert"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).sendKeys(pro.getProperty("ALERTTYPE3"));
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveAlertType"))).click();
		Thread.sleep(4000);
		logger.info("Alert Tye Selected");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
		Thread.sleep(9000);
		logger.info("RULE 116 CHANGES SAVED");
		Thread.sleep(5000);

		//driver.navigate().refresh();
		//   Thread.sleep(5000);
	}

	//PULSE PORTAL RULE#118 CHANGE

	@Test(priority=2, description="Pulse Changes-Rule 118")
	public void AgentAllRuleTest_118() throws Exception 
	{
		// driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).clear();
		//  Thread.sleep(3000);
		logger1 = extent.createTest("Pulse Changes-Rule 118");
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
        Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("118");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
		Thread.sleep(7000);
		logger.info("Rule#118 Selected");

		//CHECK RULE IS ENABLED
		Login_LogOut.EnableCheckbox();

		//SET RULE VARIABLE
		Login_LogOut.SetRuleVariable("limit = 0;");

		driver.findElement(By.xpath(pro.getProperty("pulse_delAction"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("RuleAct"))).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(pro.getProperty("pulse_ActionAlert"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).sendKeys(pro.getProperty("ALERTTYPE3"));
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveAlertType"))).click();
		Thread.sleep(4000);
		logger.info("Alert Tye Selected");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
		Thread.sleep(9000);
		logger.info("RULE 118 CHANGES SAVED");
		Thread.sleep(5000);

		driver.navigate().refresh();
	}

	//PULSE PORTAL RULE#119 CHANGE
	@Test(priority=3, description="Pulse Changes-Rule 119")
	public void AgentAllRuleTest_119() throws Exception 
	{
		logger1 = extent.createTest("Pulse Changes-Rule 119");
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
        Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("119");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
		Thread.sleep(7000);
		logger.info("Rule#119 Selected");

		//CHECK RULE IS ENABLED
		Login_LogOut.EnableCheckbox();

		//SET RULE VARIABLE
		Login_LogOut.SetRuleVariable("threshold=7.0;");

		//SET ALERT TYPE
		driver.findElement(By.xpath(pro.getProperty("pulse_delAction"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("RuleAct"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("pulse_ActionAlert"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).sendKeys(pro.getProperty("ALERTTYPE3"));
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveAlertType"))).click();
		Thread.sleep(4000);
		logger.info("Alert Tye Selected");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
		Thread.sleep(9000);
		logger.info("RULE 119 CHANGES SAVED");
		Thread.sleep(5000);
	}

	//PULSE PORTAL RULE#120 CHANGE
	@Test(priority=4, description="Pulse Changes-Rule 120")
	public void AgentAllRuleTest_120() throws Exception 
	{
		logger1 = extent.createTest("Pulse Changes-Rule 120");
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
        Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("120");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
		Thread.sleep(7000);
		logger.info("Rule#120 Selected");

		//CHECK RULE IS ENABLED
		Login_LogOut.EnableCheckbox();

		//SET RULE VARIABLE
		Login_LogOut.SetRuleVariable("approved_agent_billpay_day_amount = approved_agent_billpay_day[event.agent_id].amount ?? 0.0;threshold = 1.0;");


		//SET ALERT TYPE
		driver.findElement(By.xpath(pro.getProperty("pulse_delAction"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("RuleAct"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("pulse_ActionAlert"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).sendKeys(pro.getProperty("ALERTTYPE3"));
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveAlertType"))).click();
		Thread.sleep(4000);
		logger.info("Alert Tye Selected");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
		Thread.sleep(9000);
		logger.info("RULE 120 CHANGES SAVED");
		Thread.sleep(5000);
	}

	//PULSE PORTAL RULE#121 CHANGE
	@Test(priority=5, description="Pulse Changes-Rule 121")
	public void AgentAllRuleTest_121() throws Exception 
	{
		logger1 = extent.createTest("Pulse Changes-Rule 121");
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
        Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("121");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
		Thread.sleep(7000);
		logger.info("Rule#121 Selected");

		//CHECK RULE IS ENABLED
		Login_LogOut.EnableCheckbox();

		//SET RULE VARIABLE
		Login_LogOut.SetRuleVariable("limit=0;");

		driver.findElement(By.xpath(pro.getProperty("pulse_delAction"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("RuleAct"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("pulse_ActionAlert"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).sendKeys(pro.getProperty("ALERTTYPE3"));
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveAlertType"))).click();
		Thread.sleep(4000);
		logger.info("Alert Tye Selected");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
		Thread.sleep(9000);
		logger.info("RULE 121 CHANGES SAVED");
		Thread.sleep(5000);
	} 

	//PULSE PORTAL RULE#019 CHANGE
	@Test(priority=6, description="Pulse Changes-Rule 019")
	public void AgentAllRuleTest_019() throws Exception 
	{
		logger1 = extent.createTest("Pulse Changes-Rule 019");
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
        Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("019");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
		Thread.sleep(7000);
		logger.info("Rule#019 Selected");

		//CHECK RULE IS ENABLED
		Login_LogOut.EnableCheckbox();

		//SET RULE VARIABLE
		Login_LogOut.ScrollPage();

		driver.findElement(By.xpath(pro.getProperty("pulse_delAction"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("RuleAct"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("pulse_ActionAlert"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).sendKeys(pro.getProperty("ALERTTYPE3"));
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveAlertType"))).click();
		Thread.sleep(4000);
		logger.info("Alert Tye Selected");
		
		Login_LogOut.PublishRule();
		
		logger.info("RULE 019 CHANGES SAVED");
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("019");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklimit"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clickGloballimit"))).click();
		Thread.sleep(6000);
		
		Login_LogOut.EnableLimitCheckbox();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).clear();
		driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).sendKeys("1");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
		Thread.sleep(4000);
		Login_LogOut.Pulse_LogOut();

	}  
	//AGENT BILLPAYMENT

	@Test(priority=7, description="Validate Agent Rules 116_118_119_120_121_019 trigger")
	public void Validate_AgentRules() throws Exception 
	{
		logger1 = extent.createTest("AgentTransaction");
		Login_LogOut.Agent_LogIn(driver,"2000009054","Asdf@1234");
		String otp = Agent_OTP_PP.Agent_BillPaymentTrial(driver, "917040604636");
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
		String TransactionId = Agent_Services.BillPay_ConsumerServices();
		System.out.println("TransactionId" + TransactionId);
	//	driver.findElement(By.xpath(pro.getProperty("Agent_ConsumerServices"))).click();
	  //  Thread.sleep(4000);
		
		
		String LoadMoneyId = Agent_LoadMoney.Perform_Agent_LoadMoney();
		Login_LogOut.Agent_LogOut();
		System.out.println("LoadMoneyId" + LoadMoneyId);


		//RULE VERIFICATION IN ALERT MANAGER
		Login_LogOut.AM_LogIn();
		driver.findElement(By.xpath(pro.getProperty("AM_search"))).click();
		Thread.sleep(4000);
		logger.info("Clicked on Search Page");
		driver.findElement(By.xpath(pro.getProperty("AM_EnterTransactionId"))).click();
		Thread.sleep(4000);
		//Agent_BillPayment.Agent_MobileBillPayment();
		driver.findElement(By.xpath(pro.getProperty("AM_EnterTransactionId"))).sendKeys(TransactionId);
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("AM_SearchTransactionId"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("AM_ViewTransactionId"))).click();
		Thread.sleep(7000);
		logger.info("BillPayment Transaction Viewed");
		String StoreRule = driver.findElement(By.xpath(pro.getProperty("AM_VerifyRuleTriggered"))).getText();
		System.out.println(StoreRule);
		Thread.sleep(3000);

		SoftAssert sa=new SoftAssert();
		TakeScreenshot.captuerScreenshot(driver, "Rules Captured ");
		sa.assertTrue(StoreRule.contains("Rule #116"));
		sa.assertTrue(StoreRule.contains("Rule #118"));
		sa.assertTrue(StoreRule.contains("Rule #119"));

		driver.findElement(By.xpath(pro.getProperty("AM_search"))).click();
		Thread.sleep(4000);
		logger.info("Clicked on Search Page");
		driver.findElement(By.xpath(pro.getProperty("AM_EnterTransactionId"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("AM_EnterTransactionId"))).sendKeys(String.valueOf(LoadMoneyId));
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("AM_SearchTransactionId"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("AM_ViewTransactionId"))).click();
		Thread.sleep(7000);
		logger.info("LoadMoney Transaction Viewed");
		String StoreRule1 = driver.findElement(By.xpath(pro.getProperty("AM_VerifyRuleTriggered"))).getText();
		System.out.println(StoreRule1);
		Thread.sleep(3000);
		TakeScreenshot.captuerScreenshot(driver, "Rules Captured ");
		sa.assertTrue(StoreRule.contains("Rule #120"));
		sa.assertTrue(StoreRule.contains("Rule #121"));
		sa.assertTrue(StoreRule.contains("Rule #019"));
		 Login_LogOut.AM_LogOut();
	} 

	//REVERT RULE IN PULSE

	//REVERT RULE#116 IN PULSE

	@Test(priority=8, description="Pulse Revert changes-116")
	public void PulseRevert_116() throws Exception 
	{
		logger1 = extent.createTest("Pulse Revert changes-116");
		Login_LogOut.Pulse_LogIn();
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("116");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
		Thread.sleep(7000);
		logger.info("Rule#116 Selected");
		Login_LogOut.SetRuleVariable("threshold=500000.0;");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
		Thread.sleep(9000);
	}

	//REVERT RULE#118 IN PULSE
	@Test(priority=8, description="Pulse Revert changes-118")
	public void PulseRevert_118() throws Exception 
	{

		logger1 = extent.createTest("Pulse Revert changes-118");
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("118");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
		Thread.sleep(7000);
		logger.info("Rule#119 Selected");
		Login_LogOut.SetRuleVariable("limit = 100000;");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
		Thread.sleep(9000);
	}

	//REVERT RULE#119 IN PULSE
	@Test(priority=9, description="Pulse Revert changes-119")
	public void PulseRevert_119() throws Exception 
	{
		logger1 = extent.createTest("Pulse Revert changes-119");
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("119");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
		Thread.sleep(7000);
		logger.info("Rule#119 Selected");
		Login_LogOut.SetRuleVariable("threshold=700000.0;");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
		Thread.sleep(9000);
	}

	//REVERT RULE#120 IN PULSE
	@Test(priority=10, description="Pulse Revert changes-120")
	public void PulseRevert_120() throws Exception 
	{
		logger1 = extent.createTest("Pulse Revert changes-120");
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("120");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
		Thread.sleep(7000);
		logger.info("Rule#119 Selected");
		Login_LogOut.SetRuleVariable("approved_agent_billpay_day_amount = approved_agent_billpay_day[event.agent_id].amount ?? 0.0;threshold = 100000.0;");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
		Thread.sleep(9000);
	}

	//REVERT RULE#121 IN PULSE
	@Test(priority=11, description="Pulse Revert changes-121")
	public void PulseRevert_121() throws Exception 
	{
		logger1 = extent.createTest("Pulse Revert changes-121");
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("121");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
		Thread.sleep(7000);
		logger.info("Rule#119 Selected");
		Login_LogOut.SetRuleVariable("limit =100000;");
		Login_LogOut.PublishRule();

	}
	//REVERT RULE#019 IN PULSE
	@Test(priority=12, description="Pulse Revert changes-019")
	public void PulseRevert_019() throws Exception 
	{
		logger1 = extent.createTest("Pulse Revert changes-019");
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("019");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklimit"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clickGloballimit"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).clear();
		driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).sendKeys("50000000");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
		Thread.sleep(4000);
		Login_LogOut.Pulse_LogOut();
		driver.close();

	}

}

