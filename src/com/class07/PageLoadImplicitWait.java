package com.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class PageLoadImplicitWait extends CommonMethods {
	public static void main(String[] args) {
		setUp("Chrome", "https://google.com");
		// page load waits until all elements on the page gets full loaded.
		// if element won't load within 30 seconds you will get TimeOutException
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		// Tell webdriver to wait for the element befire throwing NoSuchElementException
		// We need implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("wrongName")).sendKeys("iphone");
		driver.quit();
	}
}
