package com.class06;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class Waits extends CommonMethods {
  public static final String SYNTAX_PRACTICE_URL = "http://166.62.36.207/syntaxpractice/index.html";

   public static void main(String[] args) throws InterruptedException {

		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys("kidygetie@gmail.com");
		
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		
		WebElement firstname=driver.findElement(By.name("firstname"));
		WebElement lastname=driver.findElement(By.name("lastname"));
		sendKeys(driver,firstname,10,"Kidist");
		sendKeys(driver,lastname,20,"YouTube");
   }
		
		public static void sendKeys(WebDriver driver1, WebElement element,int timeout,String value) 
		{
			new WebDriverWait(driver1,timeout).until(ExpectedConditions.visibilityOf(element));
		
		element.sendKeys(value);
		}

   


}

