package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		// system is a class.setPropery();is a static method

				// key value
				System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
				WebDriver driver = new ChromeDriver();

				// http --- hypertext transfer protocol
				driver.get("http://google.com");// we cannot get back or forword drive.get();
				Thread.sleep(1000);
				// browser navigation commands.
				
				// it will navigate to a given url
				driver.navigate().to("http://www.facebook.com");
				
				// it will navigate back
				driver.navigate().back();
				
				// it will navigate one step forward.
				driver.navigate().forward();
	}

}
