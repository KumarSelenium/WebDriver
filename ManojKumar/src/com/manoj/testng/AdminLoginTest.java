package com.manoj.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AdminLoginTest 
{
@Test
public void adminLogin()
{FirefoxDriver driver=new FirefoxDriver();
driver.get("Http://amazon.in");
driver.manage().window().maximize();

driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
driver.findElement(By.className("nav-input")).click();

driver.navigate().back();

driver.close();
	
}
}
