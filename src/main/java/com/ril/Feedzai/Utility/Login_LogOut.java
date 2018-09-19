package com.ril.Feedzai.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;

public class Login_LogOut extends FeedzaiTestBaseClass {

	
    public static void Pulse_LogIn() throws Exception {

        driver.get("https://10.130.236.50/pulseviews/management/#apps/reliance/dataconfiguration");
        Thread.sleep(4000);
        driver.manage().window().maximize();
        Thread.sleep(9000);
        driver.findElement(By.xpath(pro.getProperty("UserName"))).sendKeys(pro.getProperty("MyUserName"));
        logger.info("UserName Entered");
        driver.findElement(By.xpath(pro.getProperty("Password"))).sendKeys(pro.getProperty("MyPassword"));
        logger.info("Password Entered");
        TakeScreenshot.captuerScreenshot(driver, "Pulse Log In ");
        driver.findElement(By.xpath(pro.getProperty("SignIn"))).click();
        Thread.sleep(10000);
        logger.info("LOGGED INTO FEEDZAI PULSE");
        driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).click();
        Thread.sleep(5000);
        logger.info("Clicked on Rule");

    }

    public static void Pulse_LogOut() throws Exception {
        driver.findElement(By.xpath(pro.getProperty("pulse_Logout_Username"))).click();
        Thread.sleep(2000);
        TakeScreenshot.captuerScreenshot(driver, "Log Out ");
        driver.findElement(By.xpath(pro.getProperty("pulse_Logout"))).click();
        logger.info("LOGOUT OF FEEDZAI PULSE");
    }

    public static void AM_LogIn() throws Exception {
        driver.get("https://10.130.236.51/#login");
        driver.manage().window().maximize();
        Thread.sleep(10000);
        driver.findElement(By.xpath(pro.getProperty("UserName"))).sendKeys(pro.getProperty("MyUserName"));
        logger.info("UserName Entered");
        driver.findElement(By.xpath(pro.getProperty("Password"))).sendKeys(pro.getProperty("MyPassword"));
        logger.info("Password Entered");
        TakeScreenshot.captuerScreenshot(driver, "Log In ");
        driver.findElement(By.xpath(pro.getProperty("SignIn"))).click();
        logger.info("LOGGED INTO FEEDZAI ALERT MANAGER");
        Thread.sleep(10000);
    }

    public static void AM_LogOut() throws Exception {
        driver.findElement(By.xpath(pro.getProperty("Logout_UserName"))).click();
        TakeScreenshot.captuerScreenshot(driver, "Log Out ");
        driver.findElement(By.xpath(pro.getProperty("Logout"))).click();
        logger.info("LOGGED OUT OF FEEDZAI ALERT MANAGER");


    }

 /*   public static void Agent_LogIn() throws Exception {
        driver.get("https://test.rpay.co.in/jioagent");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(10000);
        driver.findElement(By.xpath(pro.getProperty("Agent_ClickUsername"))).click();
        Thread.sleep(2000);
      // driver.findElement(By.xpath(pro.getProperty("Agent_ClickUsername"))).sendKeys"Agent_UserName);
        driver.findElement(By.xpath(pro.getProperty("Agent_ClickUsername"))).sendKeys(pro.getProperty("Agent_UserName2"));
        logger.info("UserName Entered");
        driver.findElement(By.xpath(pro.getProperty("Agent_ClickPassword"))).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(pro.getProperty("Agent_ClickPassword"))).sendKeys(pro.getProperty("Agent_Password2"));
        logger.info("Password Entered");
        // TakeScreenshot.captuerScreenshot(driver, "Pulse Log In ");
        driver.findElement(By.xpath(pro.getProperty("Agent_SignIn"))).click();
        Thread.sleep(10000);
        logger.info("Clicked on SignIn"); 

    }  */
    
    public static void Agent_LogIn(WebDriver driver,String UserName,String UserPassword) throws Exception{
    	  driver.get("https://test.rpay.co.in/jioagent");
          Thread.sleep(3000);
          driver.manage().window().maximize();
          Thread.sleep(10000);
          driver.findElement(By.xpath(pro.getProperty("Agent_ClickUsername"))).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath(pro.getProperty("Agent_ClickUsername"))).sendKeys(UserName);
          logger.info("UserName Entered");
          driver.findElement(By.xpath(pro.getProperty("Agent_ClickPassword"))).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath(pro.getProperty("Agent_ClickPassword"))).sendKeys(UserPassword);
          logger.info("Password Entered");
          // TakeScreenshot.captuerScreenshot(driver, "Pulse Log In ");
          driver.findElement(By.xpath(pro.getProperty("Agent_SignIn"))).click();
          Thread.sleep(10000);
          logger.info("Clicked on SignIn");

    	
    }
    
    

    public static void Agent_LogOut() throws Exception {
        driver.findElement(By.xpath(pro.getProperty("Agent_ClickSettings"))).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(pro.getProperty("Agent_Logout"))).click();
        Thread.sleep(3000);
        logger.info("Agent Logout ");

    }

    public static void ScrollPage() throws Exception {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(3000);
    }

    public static void PublishRule() throws Exception {
        driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
        Thread.sleep(9000);
        driver.findElement(By.xpath(pro.getProperty("pulse_Publish"))).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath(pro.getProperty("pulse_RollPublish"))).click();
        Thread.sleep(50000);
        driver.findElement(By.xpath(pro.getProperty("pulse_ClosePublish"))).click();
        Thread.sleep(5000);
        logger.info("Rule Changes Saved Successfully");

    }

    public static void EnableCheckbox() throws Exception {
        boolean checkbox1 = driver.findElement(By.xpath(pro.getProperty("pulse_RuleEnabled"))).isSelected();
        if (checkbox1 == true) {
            logger.info("CheckBox is Selected");

        } else {
            driver.findElement(By.xpath(pro.getProperty("pulse_RuleEnabled"))).click();
            Thread.sleep(2000);
            logger.info("CheckBox is now Selected");
        }

    }


    public static String SetRuleVariable(String ObjectSetVal) throws Exception {
        driver.findElement(By.xpath(pro.getProperty("pulse_variable"))).click();
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String condition = ObjectSetVal.toString();
        js.executeScript("arguments[0].CodeMirror.setValue('" + ObjectSetVal.trim() + "');", driver.findElement(By.xpath(pro.getProperty("pulse_conditionstatement"))));
        Thread.sleep(4000);
        driver.findElement(By.xpath(pro.getProperty("pulse_savechanges"))).click();
        Thread.sleep(4000);
        logger.info("Variable Details Updated");
        Login_LogOut.ScrollPage();
        Thread.sleep(4000);
        return ObjectSetVal;

    }

    public static void EnableLimitCheckbox() throws Exception {
        boolean checkbox2 = driver.findElement(By.xpath(pro.getProperty("pulse_LimitEnabled"))).isSelected();
        if (checkbox2 == true) {
            logger.info("CheckBox is Selected");

        } else {
            driver.findElement(By.xpath(pro.getProperty("pulse_RuleEnabled"))).click();
            Thread.sleep(2000);
            logger.info("CheckBox is now Selected");
        }

    }
    
    public static void PublishRuleSeperate() throws Exception {
       // driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
     //   Thread.sleep(9000);
        driver.findElement(By.xpath(pro.getProperty("pulse_Publish"))).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath(pro.getProperty("pulse_RollPublish"))).click();
        Thread.sleep(50000);
        driver.findElement(By.xpath(pro.getProperty("pulse_ClosePublish"))).click();
        Thread.sleep(5000);
        logger.info("Rule Changes Saved Successfully");
    }
    
    public static void Simulator() throws Exception {
        driver.get("http://10.140.224.103:8080/CentralSimulator/#");
        Thread.sleep(4000);
        driver.manage().window().maximize();
        Thread.sleep(9000);
        logger.info("Browser Opened");
        driver.findElement(By.xpath(pro.getProperty("SimulatorUserName"))).sendKeys("jio");
        logger.info("UserName Entered");
        driver.findElement(By.xpath(pro.getProperty("SimulatorPassword"))).sendKeys("jio");
        logger.info("Password Entered");
        driver.findElement(By.xpath(pro.getProperty("SimulatorLogin"))).click();
        Thread.sleep(5000);

}
}
