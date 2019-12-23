package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// system is a class.setPropery();is a static method

		// key value
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// http --- hypertext transfer protocol
		driver.get("http://google.com");
		Thread.sleep(2000);
		// boowser navigation commands.
		// it will navigate to a given url
		driver.navigate().to("http://www.facebook.com");
		// it will navigate back
		driver.navigate().back();
		// it will navigate one step forward.
		driver.navigate().forward();
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		driver.close();

	}

}
