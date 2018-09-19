package com.ril.Feedzai.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.Properties;
//import java.util.logging.Logger;

public class Agent_OTP_PP {
    WebDriver driver;
    Properties pro;
    Logger logger;

    public static String Agent_BillPaymentTrial(WebDriver driver,String MobileNumber) throws Exception {
        String otp = null;
        String forgot_OTP = null;
        Properties pro = null;

     Driver myDriver = new oracle.jdbc.driver.OracleDriver(); //driver Class

        String URL = "jdbc:oracle:thin:@10.130.237.17:1521:FIDCS";
        String USER = "FDCMAWPD";
        String PASS = "fdcmawpd";
        System.out.println("URL " + URL + " User " + USER + " PASS " + PASS);
        Connection conn;

        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
            Statement stmt = null;
            //int otp = Integer.parseInt("917040604636");
            //   String MobileNumber = "917040604636";
            String SQL = "select FIELD_VALUES,R_CRE_TIME,OTP  from otp_live  where FIELD_VALUES like '%"+MobileNumber.trim()+"%' order by R_CRE_TIME desc";
            System.out.println("executed query");
            System.out.println(SQL);
            stmt = conn.createStatement();  //method of the Statement object is called executeQuery
            System.out.println("Illenu illa");
            ResultSet rs = stmt.executeQuery(SQL); //executeQuery method returns all the records in something called a ResultSet
            System.out.println("Executed");
            rs.next(); //moves the cursor to the next row in the Table 
            System.out.println("OTP is " + rs.getInt(3));
            otp = Integer.toString(rs.getInt(3));
            forgot_OTP = Integer.toString(rs.getInt(3));
            System.out.println("String OTP is " + forgot_OTP);
           /* int otp_flag = 1;
            if (forgot_OTP.length() == 5) {
                forgot_OTP = "0" + forgot_OTP;
                // break; 
            }


            otp = forgot_OTP; */

            rs.close();
            conn.close();


        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return otp;


    }

}