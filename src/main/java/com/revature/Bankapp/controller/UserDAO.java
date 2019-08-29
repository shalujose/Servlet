package com.revature.Bankapp.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	
	public boolean login(String email, String password) {
        boolean isValidLogin = false;
        
       
        Connection con=null;
        
        PreparedStatement pst=null;
        
        try {
        	con=ConnectionUtil.getConnection();
        	String sql="select * from users where email=? and password=?";
        	 pst=con.prepareStatement(sql);
        	pst.setString(1, email);
    		pst.setString(2, password);
    		ResultSet rs = pst.executeQuery(); 
			if(rs.next())
			{
				isValidLogin=true;
			} 
        }
			catch (SQLException e) {
			e.printStackTrace();
		}
    	return isValidLogin;
	}
    }


