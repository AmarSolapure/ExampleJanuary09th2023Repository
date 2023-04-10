package com.sgtesting.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginLogoutDemo {
   public static WebDriver oBrowser;
   public static Actipage oPage;
	public static void main(String[] args) {
		launchBrowser();

	}
	private static void launchBrowser()
	{
		try {
			ChromeOptions option=new ChromeOptions();
			option.addArguments("---remote-allow-origins=*");
			oBrowser=new ChromeDriver(option);
			oPage=new Actipage(oBrowser);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
