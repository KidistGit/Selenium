package com.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class Hw3 extends CommonMethods {
	/* Calander 
	 * Open chrome browser Go to
	 * “http://166.62.36.207/humanresources/symfony/web/index.php/auth” Login into
	 * the application Select Leave List Select from December 1, 2019 until January
	 * 31, 2020 Check only Pending approval Click on Search Validate “No Records
	 * Found” is displayed 
	 * Quit the browser
	 */

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome", "http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		// Login into the application
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Syntax");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Syntax123!");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(2000);
		// Select Leave List
		WebDriverWait wait = new WebDriverWait(driver, 400);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy((By.linkText("Leave"))));
		// Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']")).click();
		driver.findElement(By.linkText("Leave List")).click();
		// from December 1
		driver.findElement(By.xpath("//*[@id=\"frmFilterLeave\"]/fieldset/ol/li[1]/img")).click();
		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		wait2.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//select[@class='ui-datepicker-month']")));
		WebElement selectmonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select select = new Select(selectmonth);
		select.selectByVisibleText("Dec");
		Thread.sleep(2000);
		WebElement selectyear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select select1 = new Select(selectyear);
		select1.selectByVisibleText("2019");
		List<WebElement> cell = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for (int i = 1; i <= cell.size(); i++) {
			String value = cell.get(i - 1).getText();
			if (value.equals("1")) {
				cell.get(i - 1).click();
			}
		}
		// until January 31, 2020
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"frmFilterLeave\"]/fieldset/ol/li[2]/img")));
		driver.findElement(By.xpath("//*[@id=\"frmFilterLeave\"]/fieldset/ol/li[2]/img")).click();
		WebDriverWait wait3 = new WebDriverWait(driver, 40);
		wait3.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//select[@class='ui-datepicker-month']")));
		WebElement selectmonth2 = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select select2 = new Select(selectmonth2);
		select2.selectByVisibleText("Jan");
		Thread.sleep(2000);
		WebElement selectyear3 = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select select3 = new Select(selectyear3);
		select3.selectByVisibleText("2020");
		Thread.sleep(2000);
		List<WebElement> cells = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for (int i = 1; i <= cells.size(); i++) {
			String value = cells.get(i - 1).getText();
			if (value.equals("31")) {
				cells.get(i - 1).click();
			}
		}
		Thread.sleep(2000);
		// Check only Pending approval
		boolean sel = driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_1']")).isSelected();
		if (sel) {
			driver.findElement(By.xpath("//input[@name='btnSearch']")).click();
		} else {
			// Click on Search
			driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_1']")).click();
			driver.findElement(By.xpath("//input[@name='btnSearch']")).click();
		}
		// Validate “No Records Found” is displayed
		Thread.sleep(2000);
		WebDriverWait wait4 = new WebDriverWait(driver, 40);
		wait4.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//table[@class='table hover']/tbody/tr/td")));
		String value = driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr/td")).getText();
		if (value.equals("No Records Found")) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}

	}
}
