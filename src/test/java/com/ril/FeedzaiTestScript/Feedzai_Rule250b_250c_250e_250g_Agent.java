//RULE #250b JPB - Too many cash withdrawals by an agent from a bank account in a day is over the limit [Alert].
//RULE #250c JPB - Too many cash withdrawals by agent from a bank account in a calendar month is over the limit [Alert].
//RULE #250e JPB - Too many agents withdrawing cash from a bank account in a day is over the limit [Alert].
//RULE #250g JPB - Too many agents withdrawing cash from a bank account in a calendar month is over the limit [Alert].

package com.ril.FeedzaiTestScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Utility.Agent_OTP_PP;
import com.ril.Feedzai.Utility.Agent_Services;
import com.ril.Feedzai.Utility.Login_LogOut;
import com.ril.Feedzai.Utility.TakeScreenshot;

public class Feedzai_Rule250b_250c_250e_250g_Agent extends FeedzaiTestBaseClass {
	
	 @Test(priority=28,description="Pulse changes-250b")
	    public void AgentRuleTest_250b() throws Exception{

	        //PULSE PORTAL RULE#250 CHANGE
	        logger1 = extent.createTest("Pulse Changes-Rule 250b");
	        Login_LogOut.Pulse_LogIn();
	        driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("250b");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
	        Thread.sleep(7000);
	        logger.info("Rule#250 Selected");

	        //CHECK RULE IS ENABLED
	        Login_LogOut.EnableCheckbox();
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
	        logger.info("RULE 250b CHANGES SAVED");
	        Thread.sleep(5000);

	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("r250b_limit");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklimit"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clickGloballimit"))).click();
	        Thread.sleep(4000);
	        logger.info("RULE 250b LIMIT SELECTED");
	        //driver.findElement(By.xpath(pro.getProperty("pulse_clickGloballimit"))).click();
	        //Thread.sleep(6000);

	        Login_LogOut.EnableLimitCheckbox();
	        Thread.sleep(1000);
	        logger.info("LIMIT CHECKBOX VERIFIED");
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).clear();
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).sendKeys("2");
	        Thread.sleep(2000);
	        logger.info("AMOUNT LIMIT SET");
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleCountEntry"))).clear();
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleCountEntry"))).sendKeys("1");
	        Thread.sleep(2000);
	        logger.info("COUNT LIMIT SET");
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
	        Thread.sleep(7000);
	        logger.info("RULE 250b CHANGES COMPLETED");
	    }

	 @Test(priority=29,description="Pulse Revert changes-250c")
	    public void AgentRuleTest_250c() throws Exception{
	        //PULSE PORTAL RULE#250a CHANGE
	        logger1 = extent.createTest("Pulse Changes-Rule 250a");
	        driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
	        Thread.sleep(4000);
	        //  driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).click();
	        // driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).clear();
	        //  Thread.sleep(3000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("250c");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
	        Thread.sleep(7000);
	        logger.info("Rule#250c Selected");

	        //CHECK RULE IS ENABLED
	        Login_LogOut.EnableCheckbox();

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
	        logger.info("RULE 250c CHANGES SAVED");
	        Thread.sleep(5000);

	        logger.info("RULE 250a CHANGES SAVED");
	        Thread.sleep(5000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("r250c_limit");
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklimit"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clickGloballimit"))).click();
	        Thread.sleep(6000);

	        Login_LogOut.EnableLimitCheckbox();
	        Thread.sleep(1000);

	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).clear();
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).sendKeys("3");
	        Thread.sleep(1000);
	        logger.info("RULE 250c AMOUNT ENTERED");
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleCountEntry"))).clear();
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleCountEntry"))).sendKeys("1");
	        logger.info("RULE 250c COUNT ENTERED");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
	        Thread.sleep(9000);
	        logger.info("RULE 250c CHANGES COMPLETED");
	    }

	 @Test(priority=30,description="Pulse Revert changes-250e")
	    public void AgentRuleTest_250e() throws Exception{
	        //PULSE PORTAL RULE#250a CHANGE
	        logger1 = extent.createTest("Pulse Changes-Rule 250e");
	        driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
	        Thread.sleep(2000);
	        //  driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).click();
	        // driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).clear();
	        //  Thread.sleep(3000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("250e");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
	        Thread.sleep(7000);
	        logger.info("Rule#250e Selected");

	        //CHECK RULE IS ENABLED
	        Login_LogOut.EnableCheckbox();

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
	        logger.info("RULE 250e CHANGES SAVED");
	        Thread.sleep(5000);

	        logger.info("RULE 250e CHANGES SAVED");
	        Thread.sleep(5000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("r250e_limit");
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklimit"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clickGloballimit"))).click();
	        Thread.sleep(6000);

	        Login_LogOut.EnableLimitCheckbox();
	        Thread.sleep(1000);

	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).clear();
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).sendKeys("7");
	        Thread.sleep(1000);
	        logger.info("RULE 250e AMOUNT ENTERED");
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleCountEntry"))).clear();
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleCountEntry"))).sendKeys("1");
	        logger.info("RULE 250e COUNT ENTERED");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
	        Thread.sleep(9000);
	        logger.info("RULE 250e CHANGES COMPLETED");
	    }

	 @Test(priority=31,description="Pulse Revert changes-250g")
	    public void AgentRuleTest_250A() throws Exception{
	        //PULSE PORTAL RULE#250g CHANGE
	        logger1 = extent.createTest("Pulse Changes-Rule 250g");
	        driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
	        Thread.sleep(2000);
	        //  driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).click();
	        // driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).clear();
	        //  Thread.sleep(3000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("250a");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
	        Thread.sleep(7000);
	        logger.info("Rule#250g Selected");

	        //CHECK RULE IS ENABLED
	        Login_LogOut.EnableCheckbox();

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
	        logger.info("RULE 250g CHANGES SAVED");
	        Thread.sleep(5000);

	        logger.info("RULE 250g CHANGES SAVED");
	        Thread.sleep(5000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("r250g_limit");
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklimit"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clickGloballimit"))).click();
	        Thread.sleep(6000);

	        Login_LogOut.EnableLimitCheckbox();
	        Thread.sleep(1000);

	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).clear();
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).sendKeys("7");
	        Thread.sleep(1000);
	        logger.info("RULE 250g AMOUNT ENTERED");
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleCountEntry"))).clear();
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleCountEntry"))).sendKeys("1");
	        logger.info("RULE 250g COUNT ENTERED");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
	        Thread.sleep(9000);
	        logger.info("RULE 250g CHANGES COMPLETED");
	    } 

	 
	 @Test(priority=32, description="Perform Agent Transaction")
     public void PerformAgentTranc() throws Exception {
         logger1 = extent.createTest("Agent Cash_Deposit Transaction");
         Login_LogOut.Agent_LogIn(driver,"2000003446","Ascii@369");
        String otp= Agent_OTP_PP.Agent_BillPaymentTrial(driver,"919769956830" );
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
         String TransactionId = Agent_Services.CashWithdrawal_BCServices();
         System.out.println(TransactionId);
         Login_LogOut.Agent_LogOut();
         Thread.sleep(2000);
         
         logger1 = extent.createTest("Agent Cash_Deposit Transaction");
         Login_LogOut.Agent_LogIn(driver,"2000266917","June@2018");
        String otp1= Agent_OTP_PP.Agent_BillPaymentTrial(driver,"917040604636" );
     	driver.findElement(By.xpath(pro.getProperty("Agent_OTP"))).click();
 		Thread.sleep(3000);
 		driver.findElement(By.xpath(pro.getProperty("Agent_EnterOtp"))).sendKeys(otp1);
 		Thread.sleep(2000);
 		logger.info("OTP Entered");
 		driver.findElement(By.xpath(pro.getProperty("Agent_EnteredOtp"))).click();
 		Thread.sleep(4000);
 		logger.info("Welcome to Agent HomePage");
 		TakeScreenshot.captuerScreenshot(driver, "Agent HomePage");
 		Thread.sleep(3000);
         String TransactionId1 = Agent_Services.CashWithdrawal_BCServices();
         System.out.println(TransactionId1);
         Login_LogOut.Agent_LogOut();
         Thread.sleep(2000); 

         //RULE VERIFICATION IN ALERT MANAGER
	        logger1 = extent.createTest("Login to Alert Manager");
	        Login_LogOut.AM_LogIn();
	        driver.findElement(By.xpath(pro.getProperty("AM_search"))).click();
	        Thread.sleep(4000);
	        logger.info("Clicked on Search Page");
	        driver.findElement(By.xpath(pro.getProperty("AM_EnterTransactionId"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("AM_EnterTransactionId"))).sendKeys(TransactionId1);
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
	        sa.assertTrue(StoreRule.contains("Rule #250b"));
	        sa.assertTrue(StoreRule.contains("Rule #250c"));
	        sa.assertTrue(StoreRule.contains("Rule #250e"));
	        sa.assertTrue(StoreRule.contains("Rule #250g"));
	        Login_LogOut.AM_LogOut();

	    }
	 
	   @Test(priority=33, description="Pulse Revert changes-250b")
	    public void PulseRevert_250b() throws Exception {

	        logger1 = extent.createTest("Pulse Revert changes-250b");
	        Login_LogOut.Pulse_LogIn();
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("r250b_limit");
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklimit"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clickGloballimit"))).click();
	        Thread.sleep(6000);

	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).clear();
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).sendKeys("10000");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleCountEntry"))).sendKeys("1000000");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
	        Thread.sleep(4000);
	    }

	   @Test(priority=34, description="Pulse Revert changes-250c")
	    public void PulseRevert_250c() throws Exception {

	        logger1 = extent.createTest("Pulse Revert changes-250c");
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("r250c_limit");
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklimit"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clickGloballimit"))).click();
	        Thread.sleep(6000);

	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).clear();
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).sendKeys("10000");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleCountEntry"))).sendKeys("1000000");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
	        Thread.sleep(4000);
	    }
	   
	   @Test(priority=35, description="Pulse Revert changes-250e")
	    public void PulseRevert_250e() throws Exception {

	        logger1 = extent.createTest("Pulse Revert changes-250e");
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("r250e_limit");
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklimit"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clickGloballimit"))).click();
	        Thread.sleep(6000);

	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).clear();
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).sendKeys("10000");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleCountEntry"))).sendKeys("1000000");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
	        Thread.sleep(4000);
	    }
	   
	   @Test(priority=36, description="Pulse Revert changes-250b")
	    public void PulseRevert_250g() throws Exception {

	        logger1 = extent.createTest("Pulse Revert changes-250g");
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("r250g_limit");
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklimit"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clickGloballimit"))).click();
	        Thread.sleep(6000);

	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).clear();
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).sendKeys("10000");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleCountEntry"))).sendKeys("1000000");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
	        Thread.sleep(4000);
	        Login_LogOut.Pulse_LogOut();
	    }
	   
	 }
	 
	 
	 
	 
	 

