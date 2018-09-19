package com.ril.Feedzai.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;

import java.sql.Clob;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.*;
import java.util.Properties;
//import java.util.logging.Logger;

public class IDAM_OTP_PP extends FeedzaiTestBaseClass{
    WebDriver driver;
    Properties pro;
    Logger logger;

    public static String IDAM_OTP(WebDriver driver,String MobileNumber) throws Exception {
        String forgot_OTP = null;
        Properties pro = null;
       String otp = null;
         String TimeStamp = "", MobileNo = "", Otp1 = "";

        Driver myDriver = new oracle.jdbc.driver.OracleDriver();

        String URL = "jdbc:oracle:thin:@10.130.237.20:1521:Tiborc";
        String USER = "tibcocle";
        String PASS = "tibcocle";
        System.out.println("URL " + URL + " User " + USER + " PASS " + PASS);
        Connection conn;

    try {
        conn = DriverManager.getConnection(URL, USER, PASS);
        Statement stmt = null;
// String SQL =
// "select USER_MOBILE, DATETIME, OTP from JIO_IAM.otp_dtl where USER_MOBILE like '%"+objectSetVal1+"%' order by DATETIME desc ";


        String DBQuery1 ="select time_stamp,TRANSACTIONID,EXTRACTVALUE(xmltype(transaction),"+"'//*[local-name()=''Value'']') as OTP from log where interfaceID='JMIDAMSNotificationServices' and Message='Request has been received successfully' and transactionID "+"like'%OTP_+91"+MobileNumber.trim()+"%'"+"order by time_stamp desc";

// String SQL = " SELECT transaction, time_stamp FROM TIBCOCLE.LOG WHERE COMPONENTNAME = 'NotificationService' AND transactiontype = 'Received' AND message = 'Request has been received successfully'AND transaction like "+MobileNumber+" AND TIME_STAMP > SYSDATE - 1/24 ORDER BY TIME_STAMP desc";

        String SQL = DBQuery1;

        System.out.println("Executed Query : " + SQL);
        stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery(SQL);

        System.out.println(" Query Executed & checking RS.next ");
        rs.next();
        System.out.println("OTP is " + rs.getInt(3));
        otp = Integer.toString(rs.getInt(3));
            System.out.println(" Final OTP : " + otp);
            //otp = otp;


        rs.close();
        conn.close();

    }

    catch (SQLException e)
    {
// TODO Auto-generated catch block
        e.printStackTrace();
    }


    return otp;
}

}
