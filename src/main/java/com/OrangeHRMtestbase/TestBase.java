package com.OrangeHRMtestbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static String path;

	public TestBase() {
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\com.orangeHRM.atHome\\src\\main\\java\\com\\orangeHRM\\configuration\\config.properties");
			prop = new Properties();
			prop.load(ip);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		path = System.getProperty("user.dir") + "//Driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		// STEP 2
		driver = new ChromeDriver();

		// STEP 3
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();

	}

	public static void close() {
		driver.quit();
	}

}
