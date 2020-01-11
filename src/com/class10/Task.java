package com.class10;

import org.openqa.selenium.By;

import com.utils.CommonMethods;
import com.utils.Constants;

public class Task extends CommonMethods {
	public static void main(String[] args) {
// parent to child 
		setUp("chrome", Constants.HRMS_URL);
		driver.findElement(By.xpath("//div[@id='divUsername']/input[1]")).sendKeys("admin");
		driver.findElement(By.xpath("//div[@id='divPassword']/input[1]")).sendKeys("Hum@nhrm123");
	    driver.findElement(By.xpath("//div[@id='divLoginButton']/input[1]")).click();
		
		
		// child to parent 
	    
	    driver.findElement(By.xpath("//input[@name='txtUsername']/.. ")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']/.. ")).sendKeys("Hum@nhrm123");
	    driver.findElement(By.xpath(" //input[@type='submit']/..")).click();
	    
	   
	    //Sibling 
	    driver.findElement(By.xpath("//span[@class='form-hint' and text()='Username']/preceding-sibling::input ")).sendKeys("admin");
		driver.findElement(By.xpath(" //span[@class='form-hint' and text()='Password']/preceding-sibling::input")).sendKeys("Hum@nhrm123");
	    driver.findElement(By.xpath(" //div[@id='divLoginButton']/input")).click();

	}
}
