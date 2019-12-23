package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		if (driver.getTitle().equals("Facebook- Log In or sign up")) {
			System.out.println("Login page title ok");

		} else {
			System.out.println("Login page title does not match expected");
			System.out.println(driver.getTitle());
		}
		driver.findElement(By.linkText("Forget account")).click();
		if (driver.getTitle().equals("Forget password|can't Log In|Facebook")) {
			System.out.println("Forget account page title ok");

		} else {
			System.out.println("Forget account page title does not match");
			System.out.println(driver.getTitle());

		}
		driver.navigate().back();
		;
		driver.navigate().refresh();
		if (driver.getTitle().equals("Facebook- Log In or sign up")) {
			System.out.println("Login page title ok after renavigating");
		} else {
			System.out.println("Login page title does not match expected");
			System.out.println(driver.getTitle());
		}
	}

}
