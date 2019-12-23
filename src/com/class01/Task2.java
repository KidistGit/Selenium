package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.navigate().to("https://www.syntaxtechs.com/");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		
		String actualUrl=driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		String expectedUrl="https://www.syntaxtechs.com/";

		if( actualUrl.contains("Syntax")) {
			System.out.println("URL matched");
		}else{
			System.out.println("Atctual did not match");
		}
		driver.close();
		

	}

}
