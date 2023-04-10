package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameWork1 {
    public static WebDriver oBrowser;
	public static void main(String[] args) {
		launchBrowser();
		navigateURl();
		login();

	}
	private static void launchBrowser()
	{
		try {
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			oBrowser=new ChromeDriver(options);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void navigateURl()
	{
		try {
			oBrowser.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void login()
	{
		try {
			oBrowser.switchTo().frame(0);
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
			Thread.sleep(1000);
			oBrowser.switchTo().defaultContent();
			Thread.sleep(2000);
			oBrowser.switchTo().frame("packageFrame");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='WebDriver']")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().defaultContent();
			Thread.sleep(2000);
			WebElement oFrame=oBrowser.findElement(By.xpath("//iframe[@title='Package, class and interface descriptions']"));
		    oBrowser.switchTo().frame(0);
		    String content =oFrame.findElement(By.xpath("/html/body/main/div[2]")).getText();
		    System.out.println(content);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
