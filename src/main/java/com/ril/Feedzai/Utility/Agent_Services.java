package com.ril.Feedzai.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Agent_Services extends Login_LogOut {
	public static String BillPay_ConsumerServices() throws Exception {
		String BillPayId=null;
		
		driver.findElement(By.xpath(pro.getProperty("Agent_ConsumerServices"))).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath(pro.getProperty("Agent_RechargeBill"))).click();
	    Thread.sleep(4000);
	    Select BillPay = new Select(driver.findElement(By.xpath(pro.getProperty("Agent_BillerType"))));
	    BillPay.selectByVisibleText("PREPAID");
	    logger.info("BillerSelected");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(pro.getProperty("Agent_MobileNoSelect"))).click();
	    driver.findElement(By.xpath(pro.getProperty("Agent_MobileNoSelect1"))).sendKeys("8763048603");
	    Thread.sleep(4000);  
	    driver.findElement(By.xpath(pro.getProperty("Agent_AmountSelect_ss"))).click();
	    Thread.sleep(2000);
	     driver.findElement(By.xpath(pro.getProperty("Agent_AmountSelect_ss1"))).sendKeys("10");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath(pro.getProperty("Agent_CustNo_ss"))).sendKeys("8763048603");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath(pro.getProperty("Agent_CustNo_ss1"))).sendKeys("8763048603");
	    Thread.sleep(1000);
	    logger.info("Biller Details Entered");
	    driver.findElement(By.xpath(pro.getProperty("Agent_Continue_ss"))).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath(pro.getProperty("Agent_Confirm_ss"))).click();
	    Thread.sleep(15000);
	    driver.findElement(By.xpath(pro.getProperty("Agent_paysuccess_ss"))).click();
	    Thread.sleep(15000);
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
         BillPayId = driver.findElement(By.xpath(pro.getProperty("AGN_TransactionID"))).getText();
        System.out.println(BillPayId);
        logger.info("RRN Captured");
        driver.findElement(By.xpath(pro.getProperty("AGN_SelectHome_ss"))).click(); 
        Thread.sleep(5000);
		return BillPayId;
}
	
	
	
	public static String CashDeposit_BCServices() throws Exception {
		
		String CashDepositId=null;
		driver.findElement(By.xpath(pro.getProperty("Agent_ClickCD"))).click();
	    Thread.sleep(4000);
	    Select BenDrpdwn = new Select(driver.findElement(By.xpath(pro.getProperty("Agent_SelectBen_ss"))));
	    BenDrpdwn.selectByVisibleText("Others");
	    driver.findElement(By.xpath(pro.getProperty("Agent_SelectMobile_ss"))).click();
	    driver.findElement(By.xpath(pro.getProperty("Agent_SelectMobile_ss1"))).sendKeys("7768975191");
	    driver.findElement(By.xpath(pro.getProperty("Agent_AmountCD_ss"))).click();
	    Thread.sleep(2000);
	   //driver.findElement(By.xpath(pro.getProperty("Agent_EnterAmountCD_ss"))).click();
	   //Thread.sleep(2000);
	    driver.findElement(By.xpath(pro.getProperty("Agent_EnterAmountCD_ss1"))).sendKeys("5");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath(pro.getProperty("Agent_Depositors_ss"))).click();
	    driver.findElement(By.xpath(pro.getProperty("Agent_Depositors_ss1"))).sendKeys("7768975191");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath(pro.getProperty("Agent_DepositorsName_ss"))).click();
	    driver.findElement(By.xpath(pro.getProperty("Agent_DepositorsName_ss1"))).sendKeys("Sailaja");
	    Thread.sleep(3000);
	    Login_LogOut.ScrollPage();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(pro.getProperty("Agent_ContinueDeposit_ss"))).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath(pro.getProperty("Agent_CDAuthenticate_ss"))).click();
	    Thread.sleep(5000);
	    String otp= Agent_OTP_PP.Agent_BillPaymentTrial(driver,"7768975191");
	    logger.info("otp Captured");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath(pro.getProperty("Agent_CDOtp_ss"))).sendKeys(otp);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath(pro.getProperty("Agent_CDDone_ss"))).click();
	    Thread.sleep(8000);
	    CashDepositId=driver.findElement(By.xpath(pro.getProperty("Agent_GetCDRRN"))).getText();
	    
	  /*  driver.navigate().refresh();
	    Thread.sleep(4000);
	   driver.findElement(By.xpath(pro.getProperty("Agent_SelectHomeScreen_ss"))).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath(pro.getProperty("Agent_SelectBCServices_ss"))).click();
	    Thread.sleep(5000);
	     driver.findElement(By.xpath(pro.getProperty("Agent_CDBalInquiry_ss"))).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(pro.getProperty("Agent_CDBalInquiryNo_ss"))).sendKeys("7768975191");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath(pro.getProperty("Agent_CDBalInquiryCon_ss"))).click();
	    Thread.sleep(4000);
	  //  driver.findElement(By.xpath(pro.getProperty("Agent_CDBalInquiryOption_ss"))).click();
	   // Thread.sleep(2000);
	    Select CdOption=new Select(driver.findElement(By.xpath(pro.getProperty("Agent_CDBalInquiryOption_ss"))));
	    Thread.sleep(1000);
	    CdOption.selectByValue("1");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath(pro.getProperty("Agent_CDSelectAgree"))).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath(pro.getProperty("Agent_CDScanFP_ss"))).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(pro.getProperty("Agent_CDContinueMiniStat_ss"))).click();
	    Thread.sleep(3000);
	    CashDepositId=driver.findElement(By.xpath(pro.getProperty("Agent_CDRRNcap_ss"))).getText(); */
	  
	    System.out.println("RRN for Cash Deposit is" +  CashDepositId);
	    String[] parts = CashDepositId.split(" ");
	    String OS = parts[3];
	    System.out.println(OS);
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(pro.getProperty("Agent_GetCDRRNDone"))).click();
	    Thread.sleep(3000);
	    Login_LogOut.Agent_LogOut(); 
	    
	    return OS;
	   // return OS;  
	} 
	
	 public static String CashWithdrawal_BCServices() throws Exception {
	        driver.findElement(By.xpath(pro.getProperty("Agent_ClickWithdrawal"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("Agent_WithdrawalNo"))).sendKeys("7768975191");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(pro.getProperty("Agent_WithdrawalAmount1"))).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(pro.getProperty("Agent_WithdrawalAmount1"))).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(pro.getProperty("Agent_WithdrawalAmount"))).sendKeys("10");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(pro.getProperty("Agent_WithdrawalContinue"))).click();
	        Thread.sleep(6000);
	        driver.findElement(By.xpath(pro.getProperty("Agent_AcceptConsent"))).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(pro.getProperty("Agent_ScanFP"))).click();
	        Thread.sleep(6000);
	        driver.findElement(By.xpath(pro.getProperty("Agent_ProceedWD"))).click();
	        Thread.sleep(6000);
	       String CashWithdraw= driver.findElement(By.xpath(pro.getProperty("Agent_WDRRN"))).getText();
	        System.out.println(CashWithdraw);
	        String parts = CashWithdraw.substring(17,29);
	        //String RRN = parts[0];
	       // String RRN1 = parts[1];
	        System.out.println(parts);
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("Agent_WDRRNOk"))).click();
	        Thread.sleep(4000);
	        
	        return parts;

	    }
	 
	 public static String LoadMoney_ConServices() throws Exception {
		 
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
			return LoadMoneyId;
		
	 }
}
