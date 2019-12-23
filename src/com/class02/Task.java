package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");

		driver.findElement(By.partialLinkText("Register")).click();
		driver.findElement(By.name("First name")).sendKeys("Kidist");
		driver.findElement(By.name("Last name")).sendKeys("Getie");
		driver.findElement(By.name("phone")).sendKeys("571 722 0388");
		driver.findElement(By.name("email")).sendKeys("kidygetie@gmail.com");
		driver.findElement(By.name("Address")).sendKeys("4205 fox lake dr");
		;
		driver.findElement(By.name("City")).sendKeys("Fairfax");
		driver.findElement(By.name("state")).sendKeys("Virginal");
		driver.findElement(By.name("postalCode")).sendKeys("22033");
		driver.findElement(By.name("country")).sendKeys("UnitedStates");

		driver.findElement(By.name("email")).sendKeys("kidygetie@gmail.com");
		driver.findElement(By.name("password")).sendKeys("@123");
		driver.findElement(By.name("confirmPassword")).sendKeys("@123");
		driver.findElement(By.name("register")).click();

		Thread.sleep(2000);

		driver.close();

	}

}
