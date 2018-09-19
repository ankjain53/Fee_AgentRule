//#RULE 250 : JPB - Too many cash deposits by an agent to a bank account in a day over the limit [Alert]
//#RULE250a : JPB - Too many cash deposits by an agent to a bank account in a calendar month is over the limit[Alert].
//#RULE 250D : JPB - Too many agents depositing cash to a bank account in a day is over the limit [Alert].

package com.ril.FeedzaiTestScript;

	import com.ril.Feedzai.Utility.Agent_OTP_PP;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	import org.testng.asserts.SoftAssert;
	import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
	import com.ril.Feedzai.Utility.Agent_Services;
	import com.ril.Feedzai.Utility.Login_LogOut;
	import com.ril.Feedzai.Utility.TakeScreenshot;

	
	public class Feedzai_Rule250_250a_250d_250f_Agent extends FeedzaiTestBaseClass{

     @Test(priority=19,description="Pulse changes-250")
	    public void AgentRuleTest_250() throws Exception{

	        //PULSE PORTAL RULE#250 CHANGE
	        logger1 = extent.createTest("Pulse Changes-Rule 250");
	        Login_LogOut.Pulse_LogIn();
	        driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("250");
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
	        logger.info("RULE 250 CHANGES SAVED");
	        Thread.sleep(5000);

	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("r250_limit");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklimit"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clickGloballimit"))).click();
	        Thread.sleep(4000);
	        logger.info("RULE 250 LIMIT SELECTED");
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
	        logger.info("RULE 250 CHANGES COMPLETED");
	    }


	    @Test(priority=20,description="Pulse Revert changes-250a")
	    public void AgentRuleTest_250A() throws Exception{
	        //PULSE PORTAL RULE#250a CHANGE
	        logger1 = extent.createTest("Pulse Changes-Rule 250a");
	        driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
	        Thread.sleep(2000);
	        //  driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).click();
	        // driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).clear();
	        //  Thread.sleep(3000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("250a");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
	        Thread.sleep(7000);
	        logger.info("Rule#250a Selected");

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
	        logger.info("RULE 250a CHANGES SAVED");
	        Thread.sleep(5000);

	        logger.info("RULE 250a CHANGES SAVED");
	        Thread.sleep(5000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("r250a_limit");
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
	        logger.info("RULE 250A AMOUNT ENTERED");
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleCountEntry"))).clear();
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleCountEntry"))).sendKeys("1");
	        logger.info("RULE 250A COUNT ENTERED");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
	        Thread.sleep(9000);
	        logger.info("RULE 250A CHANGES COMPLETED");
	    }

	    @Test(priority=21,description="Pulse Changes-250d")
	    public void AgentRuleTest_250d() throws Exception {
	        //PULSE PORTAL RULE#250 CHANGE
	        logger1 = extent.createTest("Pulse Changes-Rule 250d");
	        driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
	        Thread.sleep(2000);
	        // driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).clear();
	        // Thread.sleep(3000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("250d");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
	        Thread.sleep(7000);
	        logger.info("Rule#250d Selected");

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
	        logger.info("RULE 250d CHANGES SAVED");
	        Thread.sleep(5000);

	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("r250d_limit");
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
	        logger.info("Rule#250d AMOUNT SELECTED");
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleCountEntry"))).clear();
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleCountEntry"))).sendKeys("1");
	        Thread.sleep(1000);
	        logger.info("Rule#250d COUNT SELECTED");
	        driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
	        Thread.sleep(4000);
	        logger.info("Rule#250d CHANGES COMPLETED");
	       
	    }

	    
	    @Test(priority = 22, description = "Pulse changes-250f")
	    public void AgentRuleTest_250f() throws Exception {
	        //PULSE PORTAL RULE#250D CHANGE
	        logger1 = extent.createTest("Pulse Changes-Rule 250f");
	        driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
	        Thread.sleep(3000);

	     //   driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).clear();
	      //  Thread.sleep(5000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("250f");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
	        Thread.sleep(7000);
	        logger.info("Rule#250d Selected");

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
	        logger.info("RULE 250f CHANGES SAVED");
	        Thread.sleep(5000);

	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("r250f_limit");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklimit"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clickGloballimit"))).click();
	        Thread.sleep(4000);
	        logger.info("RULE 250f LIMIT SELECTED");
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
	        logger.info("RULE 250f CHANGES COMPLETED");
	        Login_LogOut.Pulse_LogOut();
	    }  

	        @Test(priority=23, description="Perform Agent Transaction")
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
	            String TransactionId = Agent_Services.CashDeposit_BCServices();
	            System.out.println(TransactionId);
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
	            String TransactionId1 = Agent_Services.CashDeposit_BCServices();
	            System.out.println(TransactionId1);
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
	        sa.assertTrue(StoreRule.contains("Rule #250"));
	        sa.assertTrue(StoreRule.contains("Rule #250a"));
	        sa.assertTrue(StoreRule.contains("Rule #250d"));
	        sa.assertTrue(StoreRule.contains("Rule #250f"));
	        Login_LogOut.AM_LogOut();

	        
	    }

	    @Test(priority=24, description="Pulse Revert changes-250")
	    public void PulseRevert_250() throws Exception {

	        logger1 = extent.createTest("Pulse Revert changes-250");
	        Login_LogOut.Pulse_LogIn();
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("r250_limit");
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


	    @Test(priority=25, description="Pulse Revert changes-250a")
	    public void PulseRevert_250a() throws Exception {

	        logger1 = extent.createTest("Pulse Revert changes-250a");
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("r250a_limit");
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklimit"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clickGloballimit"))).click();
	        Thread.sleep(6000);


	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).clear();
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).sendKeys("100000");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleCountEntry"))).clear();
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleCountEntry"))).sendKeys("10000");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
	        Thread.sleep(9000);
	    } 
	    
	    @Test(priority=26, description="Pulse Revert changes-250d")
	    public void PulseRevert_250d() throws Exception {

	        logger1 = extent.createTest("Pulse Revert changes-250d");
	        
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("r250d_limit");
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklimit"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clickGloballimit"))).click();
	        Thread.sleep(6000);

	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).clear();
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).sendKeys("300000");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleCountEntry"))).sendKeys("10000");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
	        Thread.sleep(4000);
	        

	    }
	    
	    @Test(priority = 27, description = "Pulse Revert changes-250f")
	    public void PulseRevert_250f() throws Exception {

	        logger1 = extent.createTest("Pulse Revert changes-250f");
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("r250f_limit");
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklimit"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clickGloballimit"))).click();
	        Thread.sleep(6000);

	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).clear();
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).sendKeys("300000");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleCountEntry"))).sendKeys("10000");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
	        Thread.sleep(4000);
	        Login_LogOut.Pulse_LogOut();


	    }

	}



