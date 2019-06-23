package com.manoj.testng;

import org.testng.annotations.Test;

public class MultipleTestNg 
{
@Test()
public void appLaunch()
{
	System.out.println("AppLaunch");
}
@Test(priority=3)
public void appLogin()
{
	System.out.println("AppLogin");
}
@Test
public void appClose()
{
	System.out.println("AppClose");
}
}
