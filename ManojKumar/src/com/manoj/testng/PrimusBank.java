package com.manoj.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrimusBank
{
	FirefoxDriver driver;
	@BeforeSuite
	public void appLaunch()
	{
		driver=new FirefoxDriver();
		driver.get("Http://Primusbank.qedgetech.com");
		driver.manage().window().maximize();
	}
	@BeforeTest
	public void appLogin()
	{
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
	}
	@AfterTest
	public void appLogout() throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
	}
	@AfterSuite
	public void appClose()
	{
		driver.close();
	}
}
