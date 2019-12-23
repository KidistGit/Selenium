package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://google.com");
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("The actual expected Title matched");
		}else{
			System.out.println("The actual and expected Title did not match");
		}
		System.out.println("********************");
		String actualUrl=driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		String expectedUrl="https://www.google.com/?gws_rd=ssl";

		if(expectedUrl.equals(actualUrl)) {
			System.out.println("Both URL matched");
		}else{
			System.out.println("Atctual and expected  did not match");
		}
		driver.close();

	}

}
