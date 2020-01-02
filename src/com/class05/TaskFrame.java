package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class TaskFrame extends CommonMethods {
	public static final String SYNTAX_PRACTICE_URL = "http://166.62.36.207/syntaxpractice/index.html";

	public static void main(String[] args) throws InterruptedException {

		// The method is opening syntax Practice website using chrome browser
		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);

		driver.findElement(By.linkText("Others")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Iframe")).click();
		
		Thread.sleep(2000);
		String mainWText=driver.findElement(By.xpath("//h2[text()='IFrame practice']")).getText();
		System.out.println("This text is from main window"+ mainWText);
		driver.switchTo().frame("FrameOne"); 
		Thread.sleep(2000);
		
		String insideFText=driver.findElement(By.xpath("//h4[text()='Practice Selenium Automation Testing Online']")).getText();
		System.out.println("This text is from inside frame one:"+insideFText);
		
		driver.switchTo().defaultContent();

		// in main window see if below text is displayed
		boolean textDis = driver.findElement(By.xpath("//h2[text()='IFrame practice']")).isDisplayed();

		Thread.sleep(1000);
		System.out.println("Is text in main window Displayed: " + textDis);

		driver.close();
		
		

		

	}
}
