package com.manoj.practies;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromBrowserTest {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("Http://Gmail.com");

	}

}
