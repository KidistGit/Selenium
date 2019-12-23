package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.navigate().to("https://www.amazon.com");
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		
		driver.close();
		
		
	}

}
