package com.ril.Feedzai.Utility;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import io.appium.java_client.service.local.AppiumDriverLocalService;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;

public class Transactions extends FeedzaiTestBaseClass {

	//@Test(priority=1)
	//public void  AppiumTestSetUp() throws MalformedURLException, Exception {
	 public static void AppiumTestSetUp() throws MalformedURLException, Exception {
		
		
		String url = "http://0.0.0.0:4723/wd/hub";
		// driver1.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("udid", "6TWW894DPBQWCIVS");
		capabilities.setCapability("appPackage", "com.corpay.mwallet.preprod.dev");
		capabilities.setCapability("appActivity", "com.corpay.mwallet.app.ui.flows.login.AppLoginActivity");
		capabilities.setCapability("deviceName", "X9009");

		System.out.println("got the capabilities");
		URL remoteAddress = new URL(url);
		driver1 = new RemoteWebDriver(remoteAddress, capabilities);
		logger.info("opened driver1");
		Thread.sleep(30000);
		logger.info("App launched");

		Thread.sleep(8000);
		driver1.findElement(By.id("etMobileNumber")).click();
		Thread.sleep(5000);
		driver1.findElement(By.id("etMobileNumber")).sendKeys("9559559559");
		// driver1.navigate().back();
		Thread.sleep(2000);
		driver1.findElement(By.id("btnSignin")).click();
		Thread.sleep(2000);
		driver1.findElement(By.id("etPassword")).sendKeys("test@1357");
		driver1.navigate().back();
		driver1.findElement(By.id("btnSignin")).click();
		Thread.sleep(5000);
		driver1.findElement(By.id("tv1")).click();
		driver1.findElement(By.id("tv3")).click();
		driver1.findElement(By.id("tv5")).click();
		driver1.findElement(By.id("tv7")).click();
		Thread.sleep(5000);
	}


	public static void P2M_Transaction() throws MalformedURLException, InterruptedException {

		driver1.findElement(By.id("btnPayAtShop")).click();
		Thread.sleep(3000);
		// driver1.findElement(By.name("Mobile")).click();
		driver1.findElement(By.xpath(pro.getProperty("Mobile"))).click();
		Thread.sleep(3000);
		driver1.findElement(By.xpath(pro.getProperty("MerchantMobileNum"))).click();
		driver1.findElement(By.xpath(pro.getProperty("MerchantMobileNum"))).sendKeys("8899550000");
		Thread.sleep(2000);
		driver1.findElement(By.xpath(pro.getProperty("Amount"))).click();
		driver1.findElement(By.xpath(pro.getProperty("Amount"))).sendKeys("5");

		driver1.findElement(By.xpath(pro.getProperty("Pay_Now"))).click();
		Thread.sleep(2000);
		driver1.findElement(By.id("btnConfirm")).click();
		Thread.sleep(10000);

/*	String P2M_RRN = driver1.findElement(By.id("tvTransactionId")).getText();
		logger.info("P2M RRN is " + P2M_RRN);
		String P2M_Amount = driver1.findElement(By.id("tvTransactionAmount")).getText();
		logger.info("P2M Amount is " + P2M_Amount);
		driver1.findElement(By.id("btnHome")).click();
		Thread.sleep(8000);*/
	}


	public static void LMW_Transaction() throws InterruptedException {
		driver1.findElement(By.id("btnLoadMoney")).click();
		System.out.println("Clicked on Load money tab");
		Thread.sleep(3000);
		driver1.findElement(By.id("etAmount")).click();
		driver1.findElement(By.id("etAmount")).sendKeys("50");
		Thread.sleep(3000);
		driver1.findElement(By.id("btnLoad")).click();
		Thread.sleep(5000);
		driver1.findElement(By.xpath(pro.getProperty("TestCard"))).click();
		driver1.findElement(By.id("etCvv")).click();
		driver1.findElement(By.id("etCvv")).sendKeys("456");
		Thread.sleep(2000);
		driver1.findElement(By.id("btnPay")).click();
		Thread.sleep(2000);
		driver1.findElement(By.id("btnConfirm")).click();
		Thread.sleep(20000);
	/*	driver1.findElement(By.className("android.widget.Spinner")).click();
		Thread.sleep(5000);
		driver1.findElement(By.xpath(pro.getProperty("Success"))).click();
		Thread.sleep(5000);
		driver1.findElement(By.id("SubmitForm")).click();
		Thread.sleep(4000);
		logger.info("LMW transaction successful");
		String LMW_RRN = driver1.findElement(By.id("tvCreditTransactionId")).getText();
		logger.info("LMW RRN is " + LMW_RRN);
		driver1.findElement(By.id("btnHome")).click();
		Thread.sleep(8000);*/

	}

	
	public static void LMW_155c() throws InterruptedException {
		driver1.findElement(By.id("btnLoadMoney")).click();
		System.out.println("Clicked on Load money tab");
		Thread.sleep(3000);
		driver1.findElement(By.id("etAmount")).click();
		driver1.findElement(By.id("etAmount")).sendKeys("50");
		Thread.sleep(3000);
		driver1.findElement(By.id("btnLoad")).click();
		Thread.sleep(5000);
		driver1.findElement(By.xpath(pro.getProperty("StartSixCard"))).click();
		driver1.findElement(By.id("etCvv")).click();
		driver1.findElement(By.id("etCvv")).sendKeys("456");
		Thread.sleep(2000);
		driver1.findElement(By.id("btnPay")).click();
		Thread.sleep(2000);
		driver1.findElement(By.id("btnConfirm")).click();
		Thread.sleep(6000);
	/*	driver1.findElement(By.className("android.widget.Spinner")).click();
		Thread.sleep(5000);
		driver1.findElement(By.xpath(pro.getProperty("Success"))).click();
		Thread.sleep(5000);
		driver1.findElement(By.id("SubmitForm")).click();
		Thread.sleep(4000);
		logger.info("LMW transaction successful");
		String LMW_RRN1 = driver1.findElement(By.id("tvCreditTransactionId")).getText();
		logger.info("LMW RRN is " + LMW_RRN1);
		driver1.findElement(By.id("btnHome")).click();
		Thread.sleep(8000);*/

	}


	public static void BillPayClosedLoop() throws InterruptedException {
		driver1.findElement(By.id("btnPayments")).click();
		Thread.sleep(2000);
		driver1.findElement(By.id("iv_list_item_operator")).click();
		driver1.findElement(By.name("Charity")).click();
		Thread.sleep(2000);
		driver1.findElement(By.name("PRIDE India")).click();
		Thread.sleep(2000);
		driver1.findElement(By.name("Name")).click();
		driver1.findElement(By.name("Name")).sendKeys("abc");
		Thread.sleep(2000);
		driver1.findElement(By.name("Address Line 1")).click();
		driver1.findElement(By.name("Address Line 1")).sendKeys("testtt");
		Thread.sleep(2000);
		driver1.findElement(By.name("Address Line 2")).click();
		driver1.findElement(By.name("Address Line 2")).sendKeys("defg");
		Thread.sleep(2000);
		driver1.findElement(By.id("etClearAmount")).click();
		driver1.findElement(By.id("etClearAmount")).sendKeys("10");
		driver1.findElement(By.id("btnProceed")).click();
		Thread.sleep(2000);
		driver1.findElement(By.name("Review & Add")).click();
		driver1.findElement(By.name("Confirm & Pay")).click();
		Thread.sleep(5000);
	/*	logger.info("Bill Pay through closed loop successful");
		String IBW_RRN = driver1.findElement(By.id("tvTransactionId")).getText();
		logger.info("IBW RRN is " + IBW_RRN);
		Thread.sleep(4000);
		driver1.findElement(By.id("btnHome")).click();
		Thread.sleep(4000);
	}*/
	}


	public static void BillPayOpenLoop() throws InterruptedException {
		driver1.findElement(By.id("btnPayments")).click();
		Thread.sleep(2000);
		driver1.findElement(By.name("3 More")).click();
		driver1.findElement(By.name("Charity")).click();
		Thread.sleep(2000);
		driver1.findElement(By.name("PRIDE India")).click();
		Thread.sleep(2000);
		driver1.findElement(By.name("Name")).click();
		driver1.findElement(By.name("Name")).sendKeys("abc");
		Thread.sleep(2000);
		driver1.findElement(By.name("Address Line 1")).click();
		driver1.findElement(By.name("Address Line 1")).sendKeys("testtt");
		Thread.sleep(2000);
		driver1.findElement(By.name("Address Line 2")).click();
		driver1.findElement(By.name("Address Line 2")).sendKeys("defg");
		Thread.sleep(2000);
		driver1.findElement(By.id("etClearAmount")).click();
		driver1.findElement(By.id("etClearAmount")).sendKeys("10");
		driver1.findElement(By.id("btnProceed")).click();
		Thread.sleep(2000);
		driver1.findElement(By.name("Test")).click();
		driver1.findElement(By.name("Test")).click();
		driver1.findElement(By.id("etCvv")).click();
		driver1.findElement(By.id("etCvv")).sendKeys("456");
		Thread.sleep(2000);
		driver1.findElement(By.name("Review & Add")).click();
		Thread.sleep(2000);
		driver1.findElement(By.name("Confirm & Pay")).click();
		Thread.sleep(6000);
		driver1.findElement(By.className("android.widget.Spinner")).click();
		Thread.sleep(5000);
		driver1.findElement(By.name("Success")).click();
		Thread.sleep(5000);
		driver1.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
		logger.info("Bill pay through open loop success");
		String BIW_RRN = driver1.findElement(By.id("tvCreditTransactionId")).getText();
		logger.info("BIW RRN is " + BIW_RRN);
		driver1.findElement(By.id("btnHome")).click();
		Thread.sleep(8000);

	}
}
