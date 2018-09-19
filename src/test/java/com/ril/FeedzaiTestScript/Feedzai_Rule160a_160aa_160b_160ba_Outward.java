//Rule 160a : Count of NEFT transactions from the same bank account to same external bank account in a day is over the limit[Alert].
//Rule 160aa : Cumulative amount of NEFT transactions from the same bank account to same external bank account in a day is over the limit[Alert]
//Rule 160b : Multiple NEFT transactions from the same bank account in a day over the limit[Alert].
//Rule 160ba : Count of NEFT transactions from the same bank account to same external bank account in a MONTH is over the limit[Alert].

//count_limit = 0
//amount_limit = 50

package com.ril.FeedzaiTestScript;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Utility.Agent_FundTransfer;
import com.ril.Feedzai.Utility.Login_LogOut;
import com.ril.Feedzai.Utility.Transactions;



public class Feedzai_Rule160a_160aa_160b_160ba_Outward extends FeedzaiTestBaseClass
{
	@Test(priority=40, description="Pulse Changes-Rule 160a")
	public void PulseChange_160a() throws Exception 
	{
		//******************PULSE PORTAL RULE 160a CHANGES
		logger1 = extent.createTest("Pulse Changes-Rule 160a");
		Login_LogOut.Pulse_LogIn();
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("160a");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
		Thread.sleep(7000);
		logger.info("RuleSelected");	

		//CHECK RULE IS ENABLED
		Login_LogOut.EnableCheckbox();


		Login_LogOut.SetRuleVariable("attempted_sender_beneficiary_pan_jpb_neft_day_count = (approved_sender_beneficiary_pan_jpb_neft_day[event.sender_pan,event.beneficiary_pan].count ?? 0) + attempted_count; limit = 0;");


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
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).sendKeys(pro.getProperty("ALERTTYPE4"));
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveAlertType"))).click();
		Thread.sleep(4000);
		logger.info("Alert Type Selected");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
		Thread.sleep(9000);

	}

@Test(priority=41, description="Pulse Changes-Rule 160aa")
	public void PulseChange_160aa() throws Exception 
	{
		//******************PULSE PORTAL RULE 160aa CHANGEs

		logger1 = extent.createTest("Pulse Changes-Rule 160aa");
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("160aa");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
		Thread.sleep(7000);
		logger.info("RuleSelected");	

		//CHECK RULE IS ENABLED
		Login_LogOut.EnableCheckbox();


		Login_LogOut.SetRuleVariable("attempted_sender_beneficiary_pan_jpb_neft_day_amount = (approved_sender_beneficiary_pan_jpb_neft_day[event.sender_pan,event.beneficiary_pan].amount ?? 0) + attempted_amount; limit = 0;");


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
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).sendKeys(pro.getProperty("ALERTTYPE4"));
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveAlertType"))).click();
		Thread.sleep(4000);
		logger.info("Alert Type Selected");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
		Thread.sleep(9000);

	}

@Test(priority=42, description="Pulse Changes-Rule 160b")
	public void PulseChange_160b() throws Exception 
	{
		//******************PULSE PORTAL RULE 160b CHANGEs

		logger1 = extent.createTest("Pulse Changes-Rule 160b");
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("160b");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
		Thread.sleep(7000);
		logger.info("RuleSelected");	

		//CHECK RULE IS ENABLED
		Login_LogOut.EnableCheckbox();


		Login_LogOut.SetRuleVariable("approved_sender_pan_neft_day_cnt = (approved_sender_pan_neft_day[event.sender_pan].count ?? 0); limit = 0;");


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
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).sendKeys(pro.getProperty("ALERTTYPE4"));
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveAlertType"))).click();
		Thread.sleep(4000);
		logger.info("Alert Type Selected");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
		Thread.sleep(9000);

	}

@Test(priority=43, description="Pulse Changes-Rule 160ba")
	public void PulseChange_160ba() throws Exception 
	{
		//******************PULSE PORTAL RULE 160aa CHANGEs

		logger1 = extent.createTest("Pulse Changes-Rule 160ba");
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("160ba");
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
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).sendKeys(pro.getProperty("ALERTTYPE4"));
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveAlertType"))).click();
		Thread.sleep(4000);
		logger.info("Alert Type Selected");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
		Thread.sleep(9000);

		Login_LogOut.PublishRuleSeperate();

	}

	// Count and amount limits for 160ba


@Test(priority=44, description="List Changes-Rule 160ba")
	public void ListChange_160ba() throws Exception 
	{

		logger1 = extent.createTest("List Changes-Rule 160ba");
		//Login_LogOut.Pulse_LogIn();
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("JPB_NEFT_OUTWARDS_LIMIT");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("globalList"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("global_list"))).click();
		Thread.sleep(3000);
		//CHECK LIMIT IS ENABLED
		Login_LogOut.EnableLimitCheckbox();
		driver.findElement(By.xpath(pro.getProperty("Outward_count_month"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("Outward_count_month"))).clear();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("Outward_count_month"))).sendKeys("0");
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("Outward_amount_month"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("Outward_amount_month"))).clear();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("Outward_amount_month"))).sendKeys("50");
		Thread.sleep(6000);

		driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
		Thread.sleep(5000);

		Login_LogOut.Pulse_LogOut();

	}

	@Test(priority=45, description="Validate Rule 160a_160aa_160b_160ba trigger")
	public void AM_Verify_160a_160aa_160b_160ba() throws Exception 
	{

		logger1 = extent.createTest("Validate Rule 160a_160aa_160b_160ba trigger");
		String RRN = Agent_FundTransfer.Perform_Agent_NEFTTransfer();
		System.out.println("-------------------------------------------------------");
		System.out.println("Fund transfer rrn is :" +RRN);
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("Ok_Neft_IMPS"))).click();
		Thread.sleep(5000);
		Login_LogOut.Agent_LogOut();


		//RULE VERIFICATION IN ALERT MANAGER
		Thread.sleep(8000);
		Login_LogOut.AM_LogIn();
		driver.findElement(By.xpath(pro.getProperty("AM_search"))).click();
		Thread.sleep(4000);
		logger.info("Clicked on Search Page");
		driver.findElement(By.xpath(pro.getProperty("AM_EnterTransactionId"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("AM_EnterTransactionId"))).sendKeys(RRN);
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("AM_SearchTransactionId"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("AM_ViewTransactionId"))).click();
		Thread.sleep(7000);
		logger.info("Transaction Viewed");
		String StoreRule=driver.findElement(By.xpath(pro.getProperty("AM_VerifyRuleTriggered"))).getText();
		System.out.println(StoreRule);
		Thread.sleep(3000);
		//TakeScreenshot.captuerScreenshot(driver, "Rules Captured ");
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(StoreRule.contains("160a"));
		logger.info("Rule 160a Triggered");
		sa.assertTrue(StoreRule.contains("160aa"));
		logger.info("Rule 160aa Triggered");
		sa.assertTrue(StoreRule.contains("160b"));
		logger.info("Rule 160b Triggered");
		sa.assertTrue(StoreRule.contains("160ba"));
		logger.info("Rule 160ba Triggered");
		Login_LogOut.AM_LogOut();
	}


	//REVERT RULE IN PULSE

	@Test(priority=46, description="Pulse Revert changes-160a")
	public void PulseRevert_160a() throws Exception 
	{ 

		Login_LogOut.Pulse_LogIn();

		//160a
		logger1 = extent.createTest("Pulse Revert changes-160a");
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("160a");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
		Thread.sleep(7000);
		logger.info("RuleSelected");	

		Login_LogOut.SetRuleVariable("attempted_sender_beneficiary_pan_jpb_neft_day_count = (approved_sender_beneficiary_pan_jpb_neft_day[event.sender_pan,event.beneficiary_pan].count ?? 0) + attempted_count; limit = 5000000;");

		Login_LogOut.ScrollPage();

		driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
		Thread.sleep(9000);


	}


	@Test(priority=47, description="Pulse Revert changes-160aa")
	public void PulseRevert_160aa() throws Exception 
	{

		//160a
		logger1 = extent.createTest("Pulse Revert changes-160aa");
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("160aa");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
		Thread.sleep(7000);
		logger.info("RuleSelected");	

		Login_LogOut.SetRuleVariable("attempted_sender_beneficiary_pan_jpb_neft_day_amount = (approved_sender_beneficiary_pan_jpb_neft_day[event.sender_pan,event.beneficiary_pan].amount ?? 0) + attempted_amount; limit = 5000000;");

		Login_LogOut.ScrollPage();

		driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
		Thread.sleep(9000);

	}


	@Test(priority=48, description="List changes Revert-160ba")
	public void ListChangeRevert_160ba() throws Exception 
	{

		logger1 = extent.createTest("List changes Revert-160ba");
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("JPB_NEFT_OUTWARDS_LIMIT");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("globalList"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("global_list"))).click();
		Thread.sleep(3000);
		//CHECK LIMIT IS ENABLED
		Login_LogOut.EnableLimitCheckbox();
		driver.findElement(By.xpath(pro.getProperty("Outward_count_month"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("Outward_count_month"))).clear();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("Outward_count_month"))).sendKeys("1000");
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("Outward_amount_month"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("Outward_amount_month"))).clear();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("Outward_amount_month"))).sendKeys("5000000");
		Thread.sleep(6000);

		driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
		Thread.sleep(5000);
	}

	@Test(priority=49, description="List changes Revert-160b")
	public void ListChangeRevert_160b() throws Exception 
	{

		logger1 = extent.createTest("List changes Revert-160b");
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("160b");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
		Thread.sleep(7000);
		logger.info("RuleSelected");	

		//CHECK RULE IS ENABLED
		Login_LogOut.EnableCheckbox();

		Login_LogOut.SetRuleVariable("approved_sender_pan_neft_day_cnt = (approved_sender_pan_neft_day[event.sender_pan].count ?? 0); limit = 5000;");

		Login_LogOut.ScrollPage();
	
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
		Thread.sleep(9000);

		//Login_LogOut.PublishRuleSeperate();
		

	}
}
