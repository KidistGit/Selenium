package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static final String URL = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login\n";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);

		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Username");

		boolean isDisplayed = driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).isDisplayed();

		if (isDisplayed) {
			System.out.println("Syntax  logo is displayed");
		} else {
			System.out.println("Syntax logo is NOT displayed");
		}
		boolean isdisplayed = driver.findElement(By.cssSelector("div.product_label")).isDisplayed();
		if (isdisplayed) {
			System.out.println("Syntax TExt is displayed");
		} else {
			System.out.println("Syntax Text is NOT displayed");
		}
	
		
	}

}
