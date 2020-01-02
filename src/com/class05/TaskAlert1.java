package com.class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class TaskAlert1 extends CommonMethods {
	public static final String SYNTAX_PRACTICE_URL = "http://166.62.36.207/syntaxpractice/index.html";

	public static void main(String[] args) throws InterruptedException {

		// The method is opening syntax Practice website using chrome browser
		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
		Thread.sleep(200);
		driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[5]/a")).click();
	
	driver.findElement(By.linkText("Javascript Alerts")).click();
	driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/button")).click();
	Thread.sleep(2000);
	
	Alert  alert =driver.switchTo().alert();
	Thread.sleep(200);
	
	System.out.println("Alert text:"+alert.getText());
	alert.accept();
	driver.quit();
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
}
