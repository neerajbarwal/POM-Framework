package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.OrangeHRMpages.LoginPage;
import com.OrangeHRMtestbase.TestBase;

public class LoginTest extends TestBase {
	LoginPage oo;
	String title;

	public LoginTest() {
		super();
	}

	@BeforeSuite
	public void Launch() {
		
		initialization();
		oo = new LoginPage();
	}

	@AfterSuite
	public void end() {
		close();
	}

	@Test
	public void checktitle() {
		title = oo.verifytitle();
		Assert.assertEquals(title, "OrangeHRM");
	}

	@Test

	public void Login_detail() {
		oo.Login();
	}
}
