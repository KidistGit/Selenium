package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class Homework extends CommonMethods {
	/*
	 * Open chrome browser Go to
	 * “http://166.62.36.207/humanresources/symfony/web/index.php/auth” Login into
	 * the application Add Employee Log out Quit the browser
	 */
	public static void main(String[] args) throws InterruptedException {
		

		setUp("chrome", "http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).submit();
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("PIM")));
		
		driver.findElement(By.linkText("PIM")).click();
		
		WebDriverWait wait4=new WebDriverWait(driver,30);
		wait4.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[text()='Add Employee']")));
		
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Kidist");
		
		driver.findElement(By.name("lastName")).sendKeys("Getie");
		
		driver.findElement(By.xpath("//input[@id='btnSave']")).submit();
		
		driver.findElement(By.xpath("//a[text()='Welcome Admin']")).click();
		
		WebDriverWait wait2=new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Logout")));
		
		driver.findElement(By.linkText("Logout")).click();
		//driver.quit();
		}
		
	}


