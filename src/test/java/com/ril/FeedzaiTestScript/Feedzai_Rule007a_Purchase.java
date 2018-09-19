//RULE 007 - Cumulative transaction amount of closed loop spends (excluding bank transfer & P2P's )over monthly limit [Alert Limit].


package com.ril.FeedzaiTestScript;

import com.ril.Feedzai.Utility.*;
import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Utility.Login_LogOut;
import com.ril.Feedzai.Utility.Simulator_Purchase_CloseLoop;
import com.ril.Feedzai.Utility.TakeScreenshot;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Feedzai_Rule007a_Purchase extends FeedzaiTestBaseClass {
    
	//PULSE PORTAL RULE#007a CHANGE
	@Test(priority=16, description="Pulse Changes-Rule 007a")
    public void PulseChange_007a() throws Exception 
	{
		
		logger1 = extent.createTest("Pulse Changes-Rule 007a");
        Login_LogOut.Pulse_LogIn();
        driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("007a");
        Thread.sleep(2000);
        driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
        Thread.sleep(7000);
        logger.info("Rule#007a Selected");

        //CHECK RULE IS ENABLED
        Login_LogOut.EnableCheckbox();

        //SET RULE VARIABLE
        Login_LogOut.SetRuleVariable("limit = 0;attempted_customer_landmark_1m_closedloop_outgoing_nonneft_nonp2p_amount = (approved_customer_landmark_1m_closedloop_outgoing_nonneft_nonp2p_amount -approved_customer_closedloop_refund_outgoing_nonneft_nonp2p_amount) + attempted_amount;");

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
        driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).sendKeys(pro.getProperty("ALERTTYPE1"));
        Thread.sleep(4000);
        driver.findElement(By.xpath(pro.getProperty("pulse_SaveAlertType"))).click();
        Thread.sleep(4000);
        logger.info("Alert Tye Selected");
        Login_LogOut.PublishRule();
        Login_LogOut.Pulse_LogOut();
        Thread.sleep(2000);
        
    } 

        //PERFORM TRANSACTION IN AM
	@Test(priority=17, description="Validate Rule 007a trigger")
    public void AM_Verify_007a() throws Exception 
	{
		//RULE VERIFICATION IN ALERT MANAGER
		 logger1 = extent.createTest("Validate Rule 007a trigger");
		String SimulatorTransactionId = Simulator_Purchase_CloseLoop.verifyCloseLoop();
		Thread.sleep(2000);
		 
	   // String StoreRule = driver.findElement(By.xpath(pro.getProperty("AM_VerifyRuleTriggered"))).getText();
		 
        Login_LogOut.AM_LogIn();
        driver.findElement(By.xpath(pro.getProperty("AM_search"))).click();
        Thread.sleep(4000);
        logger.info("Clicked on Search Page");
        driver.findElement(By.xpath(pro.getProperty("AM_EnterTransactionId"))).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(pro.getProperty("AM_EnterTransactionId"))).sendKeys(SimulatorTransactionId);
        Thread.sleep(4000);
        driver.findElement(By.xpath(pro.getProperty("AM_SearchTransactionId"))).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(pro.getProperty("AM_ViewTransactionId"))).click();
        Thread.sleep(7000);
        logger.info("Transaction Viewed");
       
        String StoreRule = driver.findElement(By.xpath(pro.getProperty("AM_VerifyRuleTriggered"))).getText();
		System.out.println(StoreRule);
		Thread.sleep(3000);
        TakeScreenshot.captuerScreenshot(driver, "Rules Captured ");
        
        SoftAssert sa=new SoftAssert();
        sa.assertTrue(StoreRule.contains("Rule #007a"));
        logger.info("Rule #007a Triggered");
        Login_LogOut.AM_LogOut();
        Thread.sleep(2000);
        

	} 
        //REVERT RULE IN PULSE
	@Test(priority=18, description="Pulse Revert changes-007a")
    public void PulseRevert_007a() throws Exception 
	{
		
		logger1 = extent.createTest("Pulse Revert changes-007a");
		Login_LogOut.Pulse_LogIn();
        driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("007a");
        Thread.sleep(2000);
        driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
        Thread.sleep(7000);
        logger.info("RuleSelected");
        Login_LogOut.SetRuleVariable("limit = 10000;attempted_customer_landmark_1m_closedloop_outgoing_nonneft_nonp2p_amount = (approved_customer_landmark_1m_closedloop_outgoing_nonneft_nonp2p_amount -approved_customer_closedloop_refund_outgoing_nonneft_nonp2p_amount) + attempted_amount;");
        Thread.sleep(4000);
         Login_LogOut.PublishRule();
         Login_LogOut.Pulse_LogOut();
       


    }
}