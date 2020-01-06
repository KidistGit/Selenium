package com.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class CalenderDemo extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		setUp("chrome", "http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).submit();
		Thread.sleep(5000);

		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.linkText("Leave List")).click();

		// Step1: click on calender
		driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();

		Thread.sleep(2000);
		// step 2: get all cells
		// step 2: get all cells
		List<WebElement> cells = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for (WebElement cell : cells) {
			// retrieve text and check if it matches expected value
			if (cell.getText().equals("16")) {
				// once found click and break
				cell.click();
				break;
			}
		}

		Thread.sleep(4000);
		driver.quit();

	}
}
