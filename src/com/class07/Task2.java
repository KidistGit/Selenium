package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;
/*Open chrome browser
**Go to “https://the-internet.herokuapp.com/”
**Click on “Click on the “Dynamic Controls” link
**Select checkbox and click Remove
**Click on Add button and verify “It’s back!” text is displayed
  **  Close the browser 
  */

public class Task2 extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {

		setUp("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dynamic Controls")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[@id='message']")));
		
		
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		
		WebDriverWait wait1 = new WebDriverWait(driver,30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
		
		String expectedText="It's back!";
		String actualText = driver.findElement(By.xpath("//p[@id='message']")).getText();
		System.out.println(actualText);
		
		if (actualText.equals(expectedText)) {
			System.out.println("pass");
		} else {
			System.out.println("failed");
		}

	}
}