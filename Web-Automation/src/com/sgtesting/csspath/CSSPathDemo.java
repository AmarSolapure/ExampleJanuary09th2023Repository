package com.sgtesting.csspath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CSSPathDemo {
     private static WebDriver oBrowser;
	public static void main(String[] args) {
		launchBrowser();
		navigateurl();
		absoluteCSSSelector();

	}
	private static void launchBrowser()
	{
		try
		{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("---remote--allow-origins=*") ;
		oBrowser=new ChromeDriver(option);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
     private static void navigateurl()
     {
    	 try
    	 {
    	oBrowser.get("file:///C:/Users/Amar/Desktop/Sample.html");
    	Thread.sleep(2000);
    	 }
    	 catch (Exception e) {
			e.printStackTrace();
		}
     }
     private static void absoluteCSSSelector()
     {
    	 try {
			oBrowser.findElement(By.cssSelector("html body div form input")).sendKeys("Amar");
		} catch (Exception e) {
			e.printStackTrace();
		}
     }
}
