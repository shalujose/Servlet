package com.revature.Bankapp.controller;

import static org.junit.Assert.*;

import org.junit.Test;

import java.sql.Connection;



public class TestConnection {

	@Test
	public void testConnection() {
        Connection connection = ConnectionUtil.getConnection();
        assertNotNull(connection);
    }

}
