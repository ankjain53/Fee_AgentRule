//Rule 160i : JPB - Too many P2P transactions in a single day from the same JPB customer (sender_pan) [Alert Limit].
//Rule 160j : JPB - Cumulative amount of P2P transactions in a single day from the same JPB customer [Alert Limit].
//Rule 160m : JPB - Too many P2P transactions in month from the same JPB customer [Alert Limit].
//Rule 160l : JPB - Cumulative amount of external transactions in a month from the same jpb customer (sender_pan) [Alert Limit].

package com.ril.FeedzaiTestScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Utility.Agent_FundTransfer;
import com.ril.Feedzai.Utility.Login_LogOut;


@Test(groups = "AgentRule")
public class Feedzai_Rule160i_160j_160m_160l_Outward extends FeedzaiTestBaseClass
{
	@Test(priority=59, description="Pulse Changes-Rule 160i")
	public void PulseChange_160i() throws Exception 
	{
		//******************PULSE PORTAL RULE 160i CHANGES
		logger1 = extent.createTest("Pulse Changes-Rule 160i");
	//	Login_LogOut.Pulse_LogIn();
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("160i");
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


		//list
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("intrabank_outward_limit");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("JPB_single_txn_lim"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("global_list"))).click();
		Thread.sleep(4000);
		//CHECK LIMIT IS ENABLED
		Login_LogOut.EnableLimitCheckbox();
		driver.findElement(By.xpath(pro.getProperty("intrabank_trxn_count_day"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("intrabank_trxn_count_day"))).clear();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("intrabank_trxn_count_day"))).sendKeys("0");
		Thread.sleep(6000);

		driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
		Thread.sleep(3000);

	}


	@Test(priority=60, description="Pulse Changes-Rule 160j")
	public void PulseChange_160j() throws Exception 
	{
		//******************PULSE PORTAL RULE 160i CHANGES
		logger1 = extent.createTest("Pulse Changes-Rule 160i");
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("160j");
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

		//List
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("intrabank_outward_limit");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("JPB_single_txn_lim"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("global_list"))).click();
		Thread.sleep(4000);
		//CHECK LIMIT IS ENABLED
		Login_LogOut.EnableLimitCheckbox();
		driver.findElement(By.xpath(pro.getProperty("intrabank_trxn_amount_day"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("intrabank_trxn_amount_day"))).clear();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("intrabank_trxn_amount_day"))).sendKeys("50");
		Thread.sleep(6000);

		driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
		Thread.sleep(3000);

	}

@Test(priority=61, description="Pulse Changes-Rule 160m")
	public void PulseChange_160m() throws Exception 
	{
		//******************PULSE PORTAL RULE 160i CHANGES
		logger1 = extent.createTest("Pulse Changes-Rule 160m");
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("160m");
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

		//List
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("intrabank_outward_limit");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("JPB_single_txn_lim"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("global_list"))).click();
		Thread.sleep(4000);
		//CHECK LIMIT IS ENABLED
		Login_LogOut.EnableLimitCheckbox();
		driver.findElement(By.xpath(pro.getProperty("intrabank_trxn_count_month"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("intrabank_trxn_count_month"))).clear();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("intrabank_trxn_count_month"))).sendKeys("0");
		Thread.sleep(6000);

		driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
		Thread.sleep(3000);
	}

	@Test(priority=62, description="Pulse Changes-Rule 160l")
	public void PulseChange_160l() throws Exception 
	{
		//******************PULSE PORTAL RULE 160i CHANGES
		logger1 = extent.createTest("Pulse Changes-Rule 160l");
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("160l");
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

		//List
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("jpb_outward_limit");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("globalList"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("global_list"))).click();
		Thread.sleep(3000);
		//CHECK LIMIT IS ENABLED
		Login_LogOut.EnableLimitCheckbox();
		driver.findElement(By.xpath(pro.getProperty("Outward_amount_month"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("Outward_amount_month"))).clear();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("Outward_amount_month"))).sendKeys("50");
		Thread.sleep(6000);


		driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
		Thread.sleep(3000);

		Login_LogOut.Pulse_LogOut();

	}

	@Test(priority=63, description="Validate Rule 160i_160j_160m_160bl trigger")
	public void AM_Verify_160a_160aa_160b_160ba() throws Exception 
	{

		logger1 = extent.createTest("Validate Rule 160i_160j_160m_160bl trigger");
		String RRN = Agent_FundTransfer.Perform_Agent_P2PTransfer();
		System.out.println("-------------------------------------------------------");
		System.out.println("Fund transfer rrn is :" +RRN);
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("OKbutton"))).click();
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
		sa.assertTrue(StoreRule.contains("160i"));
		logger.info("Rule 160i Triggered");
		sa.assertTrue(StoreRule.contains("160j"));
		logger.info("Rule 160j Triggered");
		sa.assertTrue(StoreRule.contains("160m"));
		logger.info("Rule 160m Triggered");
		sa.assertTrue(StoreRule.contains("160l"));
		logger.info("Rule 160l Triggered");
		Login_LogOut.AM_LogOut();
	}

	//REVERT RULE IN PULSE

	@Test(priority=64, description="Pulse Revert changes-160i")
	public void PulseRevert_160i() throws Exception 
	{ 

		logger1 = extent.createTest("Pulse Revert-Rule 160i");
		Login_LogOut.Pulse_LogIn();
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("intrabank_outward_limit");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("JPB_single_txn_lim"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("global_list"))).click();
		Thread.sleep(4000);
		//CHECK LIMIT IS ENABLED
		Login_LogOut.EnableLimitCheckbox();
		driver.findElement(By.xpath(pro.getProperty("intrabank_trxn_count_day"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("intrabank_trxn_count_day"))).clear();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("intrabank_trxn_count_day"))).sendKeys("5000");
		Thread.sleep(6000);

		driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
		Thread.sleep(3000);

	}

	@Test(priority=65, description="Pulse Revert changes-160j")
	public void PulseRevert_160j() throws Exception 
	{ 

		logger1 = extent.createTest("Pulse Revert-Rule 160j");
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("intrabank_outward_limit");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("JPB_single_txn_lim"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("global_list"))).click();
		Thread.sleep(4000);
		//CHECK LIMIT IS ENABLED
		Login_LogOut.EnableLimitCheckbox();
		driver.findElement(By.xpath(pro.getProperty("intrabank_trxn_amount_day"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("intrabank_trxn_amount_day"))).clear();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("intrabank_trxn_amount_day"))).sendKeys("5000000");
		Thread.sleep(6000);

		driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
		Thread.sleep(3000);

	}
	
	@Test(priority=66, description="Pulse Revert changes-160m")
	public void PulseRevert_160m() throws Exception 
	{ 

		logger1 = extent.createTest("Pulse Revert-Rule 160m");
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("intrabank_outward_limit");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("JPB_single_txn_lim"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("global_list"))).click();
		Thread.sleep(4000);
		//CHECK LIMIT IS ENABLED
		Login_LogOut.EnableLimitCheckbox();
		driver.findElement(By.xpath(pro.getProperty("intrabank_trxn_count_month"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("intrabank_trxn_count_month"))).clear();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("intrabank_trxn_count_month"))).sendKeys("5000");
		Thread.sleep(6000);

		driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
		Thread.sleep(3000);

	}

	@Test(priority=67, description="Pulse Revert changes-160l")
	public void PulseRevert_160l() throws Exception 
	{ 
		logger1 = extent.createTest("Pulse Revert-Rule 160l");
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("jpb_outward_limit");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("globalList"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("global_list"))).click();
		Thread.sleep(3000);
		//CHECK LIMIT IS ENABLED
		Login_LogOut.EnableLimitCheckbox();
		driver.findElement(By.xpath(pro.getProperty("Outward_amount_month"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("Outward_amount_month"))).clear();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("Outward_amount_month"))).sendKeys("5000000");
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
		Thread.sleep(3000);
		
		Login_LogOut.Pulse_LogOut();
	}
}
