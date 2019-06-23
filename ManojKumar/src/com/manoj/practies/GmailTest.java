package com.manoj.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest {

	public static void main(String[] args) 
	{
		//String expTitle="Gmail";
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://google.co.in");
		driver.manage().window().maximize();
		driver.findElement(By.className("gb_d")).click();
		//validation
		//String actTitle=driver.getTitle();
		if (driver.findElement(By.id("identifierId")).isDisplayed()) 
		{
			System.out.println("pass");
			
		}else
		{
			System.out.println("fail");
		}
		
		
		

	}

}
