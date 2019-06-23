package com.manoj.java;

public class SwitchStatement {

	public static void main(String[] args) 
	{
		// to display weekdaynames for a given number
		//int n=9;
		String weekDayName="Sunday";
		switch (weekDayName) {
		case "Monday":
			System.out.println("1");
			break;
		case "Tuesday":
			System.out.println("2");
			break;
		case "Wednessday":
			System.out.println("3");
			break;
		case "Thursday":
			System.out.println("4");
			break;
		case "Friday":
			System.out.println("5");
			break;
		case "Saturday":
			System.out.println("6");
			break;
		case "Sunday":
			System.out.println("7");
			break;
		default:
			System.out.println("Out of Range");
			break;
		}
	}

}
