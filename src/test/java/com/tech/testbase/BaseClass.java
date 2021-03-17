package com.tech.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.tech.utils.ConfisReader;
import com.tech.utils.Constss;


public class BaseClass {
	
	public static WebDriver driver;

	/**
	 * This method will create a driver and return it
	 * 
	 * @return WebDriver driver
	 */
	public static WebDriver setUp() {
		ConfisReader.readProperties(Constss.CONFIGURATION_FILEPATH);

		switch (ConfisReader.getProperty("browser").toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", Constss.CHROME_DRIVER_PATH);
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", Constss.GECKO_DRIVER_PATH);
			driver = new FirefoxDriver();
			break;
		default:
			throw new RuntimeException("Browser is not supported!");
		}

		driver.manage().timeouts().implicitlyWait(Constss.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(ConfisReader.getProperty("url"));

		// we initialize all the page elements of the classes in package com.tech.pages
		PageInitializer.initialize();

		return driver;
	}

	/**
	 * This method will quit the browser
	 */
	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}


}
