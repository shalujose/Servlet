
package com.revature.Bankapp.controller;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserDAOTest {

	@Test
	public void test() {
		String email = "shalujosem0@gmail.com";
        String password = "sha@123";
        UserDAO userDAO = new UserDAO();
        boolean isValidLogin = userDAO.login(email, password);
        assertTrue(isValidLogin);
	}
	public void testInValidLogin() {

        String email = "";
        String password = "";
        UserDAO userDAO = new UserDAO();
        boolean isValidLogin = userDAO.login(email, password);
        assertFalse(isValidLogin);
    }

}
