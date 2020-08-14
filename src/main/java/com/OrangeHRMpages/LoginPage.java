package com.OrangeHRMpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRMtestbase.TestBase;

public class LoginPage extends TestBase {
	@FindBy(id = "txtUsername")
	WebElement uname;

	@FindBy(id = "txtPassword")
	WebElement pass;

	@FindBy(id = "btnLogin")
	WebElement login;

	@FindBy(linkText = "Forgot your password?")
	WebElement forgetpass;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifytitle() {

		return driver.getTitle();
	}

	public void Login() {
		uname.sendKeys(prop.getProperty("username"));
		pass.sendKeys(prop.getProperty("password"));
		login.click();
	}

}
