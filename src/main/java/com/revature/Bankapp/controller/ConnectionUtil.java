package com.revature.Bankapp.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionUtil {
	
	private static final String driverClassname="com.mysql.cj.jdbc.Driver";
	private static final String url="jdbc:mysql://trainingdb.ck1ayq0lncmp.ap-south-1.rds.amazonaws.com:3306/bankapp";
	private static final String username="root";
	private static final String password="root";
public static Connection getConnection()  {
        
        Connection con = null;

        try {
            Class.forName(driverClassname);
            con = DriverManager.getConnection(url, username, password);
            
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Unable to load the driver class");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Unable to get DB Connection");
        }
        

        return con;
    }

    public static void close(Connection con, PreparedStatement pst) {

        try {
            if (pst != null) pst.close();
            if (con != null) con.close();
        }
        catch(Exception e) {
            
        }
        
        
    }
    


}
