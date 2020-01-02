package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonMethods {

	public static WebDriver driver;
	/**
	 * use this method in need of opping browser and target url
	 * @param browser The desired browser
	 * @param url The desired url 
	 */

	public static void setUp(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers/chromeDriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:/Users/kidyg/eclipse-workspace/Selenium/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
		}else {
			System.out.println("Browser not supported");
		}

		// public static void WebDriver driver;
		// public static WebDriver setUp(String browser) {
		// if (browser.equalsIgnoreCase("chrome")) {
		// System.setProperty("webdriver.chrome.driver", "drivers/chromeDriver.exe");
		// driver = new ChromeDriver();

		// } else if (browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		// driver = new FirefoxDriver();

	}
	// return driver;
}
