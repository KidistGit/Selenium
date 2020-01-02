package com.class05;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class TaskFrame2 extends CommonMethods {
	public static final String SYNTAX_PRACTICE_URL = "http://166.62.36.207/syntaxpractice/index.html";

	public static void main(String[] args) throws InterruptedException {

		// The method is opening syntax Practice website using chrome browser
		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);

		driver.findElement(By.linkText("Input Forms")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Input Form Submit")).click();
		driver.findElement(By.name("first_name")).sendKeys("Kidist");
		driver.findElement(By.name("last_name")).sendKeys("Getie");
		driver.findElement(By.name("email")).sendKeys("kidygetie@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("5717220388");
		driver.findElement(By.name("address")).sendKeys("4205 Fox Lake Dr");
		driver.findElement(By.name("city")).sendKeys("FairFax");
		driver.findElement(By.name("state")).sendKeys("VA");
		driver.findElement(By.name("zip")).sendKeys("22033");
		driver.findElement(By.name("website")).sendKeys("No");
		driver.findElement(By.linkText("Do you have hosting")).click();
		driver.findElement(By.linkText("Project Description")).click();
		driver.findElement(By.linkText("Send")).click();
		
		
		
		//driver.quit();
	
	
	
	
	
	}
}
