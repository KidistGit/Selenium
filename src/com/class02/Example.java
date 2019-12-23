package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();

		System.out.println("Title is :" + title);
		System.out.println(driver.getCurrentUrl());

		WebElement unm = driver.findElement(By.id("email"));
		System.out.println(unm.getAttribute("id"));
		System.out.println(unm.getTagName());

	}

}
