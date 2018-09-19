package com.ril.Feedzai.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;

public class Simulator_Purchase_CloseLoop extends Login_LogOut {

	public static String verifyCloseLoop() throws Exception {

		// SimulatorTransactionId = null;
		Login_LogOut.Simulator();
		driver.findElement(By.xpath(pro.getProperty("Simulatorpg_ppi"))).click();
		Thread.sleep(3000);
		Select DrpTrans = new Select(driver.findElement(By.xpath(pro.getProperty("Simulator_TransType"))));
		DrpTrans.selectByVisibleText("PURCHASE");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("Simulator_Version"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(pro.getProperty("Simulator_Version"))).sendKeys("2.0");
		Thread.sleep(2000);
		Select DrpMerchantName = new Select(driver.findElement(By.xpath(pro.getProperty("Simulatorpg_MerchantName"))));
		DrpMerchantName.selectByVisibleText("Uber_PP");
		Thread.sleep(3000);
		// Login_LogOut.ScrollPage();
		driver.findElement(By.xpath(pro.getProperty("Simulator_TransAmount"))).click();
		driver.findElement(By.xpath(pro.getProperty("Simulator_TransAmount"))).clear();
		driver.findElement(By.xpath(pro.getProperty("Simulator_TransAmount"))).sendKeys("2.00");
		Thread.sleep(2000);// 9860606030
		driver.findElement(By.xpath(pro.getProperty("Simulator_CustMobileNo"))).sendKeys("9967676767");
		driver.findElement(By.xpath(pro.getProperty("Simulator_CustName"))).sendKeys("Test Customer");
		Thread.sleep(2000);
		Login_LogOut.ScrollPage();
		driver.findElement(By.xpath(pro.getProperty("Simulator_gENERATEcHECKSUM"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("Simulator_PayNow"))).click();
		Thread.sleep(5000);
		logger.info("Moved to Payment Page");
		// driver.findElement(By.xpath(pro.getProperty("Simulator_PayClose"))).click();
		// Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("Simulator_Proceed"))).click();
		Thread.sleep(5000);
		String otp1 = IDAM_OTP_PP.IDAM_OTP(driver, "9967676767");
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("Simulator_OTP"))).sendKeys(otp1);
		Thread.sleep(2000);
		logger.info("OTP Entered");
		driver.findElement(By.xpath(pro.getProperty("Simulator_ProceedPayment"))).click();
		Thread.sleep(4000);
		// driver.findElement(By.xpath(pro.getProperty("Simulator_EnterCvv"))).click();
		driver.findElement(By.xpath(pro.getProperty("Simulator_ProceedCloseLoop"))).click();
		Thread.sleep(4000); 
		String SimulatorTransactionId = driver.findElement(By.xpath(pro.getProperty("Simulator_TransId")))
				.getAttribute("value");
		System.out.println("Transaction id generated " + SimulatorTransactionId);
		Thread.sleep(3000);
		logger.info("Transaction Completed");
		driver.findElement(By.xpath(pro.getProperty("Simulator_Logout"))).click();
		logger.info("Logged out of Simulator");
		Thread.sleep(3000); 
		return SimulatorTransactionId;
	}

}
