package com.ril.Feedzai.Utility;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.sql.SQLException;

public class Agent_BillPayment extends Login_LogOut {


    public static String Perform_Agent_Billpay() throws Exception {

        String TransactionId = null;

        driver.findElement(By.xpath(pro.getProperty("Agent_SelectBillPay"))).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(pro.getProperty("Agent_SelectMobile"))).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(pro.getProperty("Agent_ClickMobileNo"))).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(pro.getProperty("Agent_EnterMobileNo"))).sendKeys("8763048603");
        Thread.sleep(3000);
        driver.findElement(By.xpath(pro.getProperty("Agent_ClickMobileNo"))).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(pro.getProperty("Agent_EnterAmount"))).sendKeys("10");
        Thread.sleep(3000);
        driver.findElement(By.xpath(pro.getProperty("Agent_SelectCustDetail"))).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(pro.getProperty("Agent_ContinueBillPay"))).click();
        Thread.sleep(3000);
        logger.info("Bill Pay Details Entered");
       // driver.switchTo().alert().dismiss();
        driver.findElement(By.xpath(pro.getProperty("Agent_Review&Pay"))).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(pro.getProperty("Agent_ContinueBillContinued"))).click();
        Thread.sleep(15000);

        driver.findElement(By.xpath(pro.getProperty("Agent_TransId"))).click();
        TransactionId = driver.findElement(By.xpath(pro.getProperty("Agent_TransId"))).getText();
        System.out.println(TransactionId);
        Thread.sleep(7000);
        logger.info("RRN Captured");
        driver.findElement(By.xpath(pro.getProperty("Agent_BillPayOk"))).click();
        Thread.sleep(7000);
        logger.info("Transaction Completed");
        return TransactionId;


    }


}
