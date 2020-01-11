package com.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;
/*
 * Open chrome browser
Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
Login to the application
Verify customer “Susan McLaren” is present in the table
Click on customer details
Update customers last name and credit card info
Verify updated customers name and credit card number is displayed in table
Close browser
 * 
 */
public class Hw2 extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		

		setUp("chrome", "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		
		String expectedValue="Susan McLearn";
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		for(int i=1; i<rows.size(); i++) {
			String rowText=rows.get(i-1).getText();
			//System.out.println(rowText);
			if(rowText.contains(expectedValue)) {
				driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+i+"]/td[1]")).click();
			
			
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_MainContent_fmwOrder_txtName")));
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).clear();
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("Susan Alex");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).clear();
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("12345678910");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();
		
List<WebElement> rows2=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
for(int j=1; j<rows2.size(); j++) {
	String rowText1=rows2.get(j-1).getText();
	//System.out.println(rowText);
	if(rowText1.contains("Susan Alex") && rowText1.contains("12345678910")) {
		System.out.println("pass");
		break;
	}
}
driver.quit();
			}
		}
}
}
		
		
		
