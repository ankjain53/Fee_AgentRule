package com.ril.Feedzai.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Agent_LoadMoney extends Login_LogOut {
    public static String Perform_Agent_LoadMoney() throws Exception {

        String LoadMoneyId = null;
       // driver.findElement(By.xpath(pro.getProperty("Agent_ConsumerServices"))).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(pro.getProperty("Agent_LoadJioMoney"))).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(pro.getProperty("Agent_LoadJioMoneyMobilNumber"))).sendKeys("9746986974"); //7880000052
        Thread.sleep(2000);
        driver.findElement(By.xpath(pro.getProperty("AGN_LoadJioMoneyAmount"))).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pro.getProperty("AGN_LoadJioMoneyEnterAmount"))).sendKeys("5");
        //driver.findElement(By.xpath(pro.getProperty("AGN_LoadJioMoneyEnterAmount"))).sendKeys("1");

        Thread.sleep(5000);
        driver.findElement(By.xpath(pro.getProperty("AGN_Tabout"))).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pro.getProperty("AGN_LoadJioMoney"))).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(pro.getProperty("AGN_ConfirmLoadMoney"))).click();
        Thread.sleep(8000);
       // String status = driver.findElement(By.xpath(pro.getProperty("AGN_CheckTranStatus"))).getText();
       // Assert.assertEquals(status, "Successful", "LoadMoney Transaction Failed");
        driver.findElement(By.xpath(pro.getProperty("AGN_ConfirmLoadMoneyConfirm"))).click();
        Thread.sleep(8000);
        logger.info("Transaction Completed");
      /*  driver.findElement(By.xpath(pro.getProperty("AGN_TransactionHistory"))).click();
        Thread.sleep(6000); 
        LoadMoneyId = driver.findElement(By.xpath(pro.getProperty("AGN_TransactionID"))).getText();
          System.out.println(LoadMoneyId);
        logger.info("RRN Captured"); */

        
        driver.findElement(By.xpath(pro.getProperty("Agent_Reports_ss"))).click(); 
	    Thread.sleep(4000);
	    driver.findElement(By.xpath(pro.getProperty("AGN_TransactionHistory"))).click(); 
        Thread.sleep(5000);
	    Select sa= new Select(driver.findElement(By.xpath(pro.getProperty("AGN_SelectTransHistory"))));
	    sa.selectByVisibleText("Today");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath(pro.getProperty("AGN_SelectTransDate_ss"))).click(); 
        Thread.sleep(5000);
        LoadMoneyId = driver.findElement(By.xpath(pro.getProperty("AGN_TransactionID"))).getText();
        System.out.println(LoadMoneyId);
        logger.info("RRN Captured");
        driver.findElement(By.xpath(pro.getProperty("AGN_SelectHome_ss"))).click(); 
        Thread.sleep(5000);
		return LoadMoneyId;
        
     
        
    }

}
