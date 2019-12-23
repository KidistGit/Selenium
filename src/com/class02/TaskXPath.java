package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskXPath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("ali@yahoo.com");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("ali@123");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.facebook.com/";
		if(actualUrl.equals(expectedUrl)) {
			System.out.println("User successfully logged in ");
		}else{
			System.out.println("Not succes");
		}

	}

}
