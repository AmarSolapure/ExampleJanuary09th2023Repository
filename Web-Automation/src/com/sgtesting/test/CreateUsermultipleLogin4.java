package com.sgtesting.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateUsermultipleLogin4 {
public static WebDriver oBrowser;
	public static void main(String[] args) {
		launchBrowser();
		navigateURl();
		login();
		minimizeFlyoutWindow();
		createuser1();
		logout();
		loginAsUser1();
		createUser2();
		logout();
		loginAsUser2();
		createUser3();
		logout();
		loginAsUser3();
		logout();
		loginAsUser3();
		logout();
		loginAsUser1();
		modifyuser2password();
		logout();
		loginAsUser2D();
		logout();
		login();
		modifyuser1password();
		logout();
		loginAsUser2D();
		deleteUser3();
		logout();
		loginAsUser1D();
		deleteUser2();
		logout();
		login();
		deleteUser1();
		logout();
		closeapp();	

	}
	private static void launchBrowser()
	{
		try {
			ChromeOptions option=new ChromeOptions();
			option.addArguments("---remote-allow-origins=*");
			oBrowser=new ChromeDriver(option);
			
		} catch (Exception e) {
			
		}
	}
	private static void navigateURl()
	{
	try {
		oBrowser.navigate().to("http://localhost:81/login.do");
		Thread.sleep(2000);
	} catch (Exception e) {
		e.printStackTrace();
	}	
	}
	private static void login()
	{
		try {
			oBrowser.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void minimizeFlyoutWindow()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"gettingStartedShortcutsPanelId\"]")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void createuser1()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Amar");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("lastName")).sendKeys("solapure");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("email")).sendKeys("amar@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).sendKeys("amar1");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("1234");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("1234");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try {
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginAsUser1()
	{
		try {
			oBrowser.findElement(By.name("username")).sendKeys("amar1");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("1234");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createUser2()
	{
		try {
			
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("manju");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("lastName")).sendKeys("kirangi");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("email")).sendKeys("manju@123");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys("manju1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("4567");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("4567");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void loginAsUser2()
	{
		try {
			oBrowser.findElement(By.name("username")).sendKeys("manju1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("4567");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createUser3()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("siddu");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("lastName")).sendKeys("gampa");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("email")).sendKeys("siddu@123");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys("siddu1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("1478");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("1478");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginAsUser3()
	{
		try {
			oBrowser.findElement(By.name("username")).sendKeys("siddu1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("1478");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void modifyuser2password()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("7654");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("7654");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]")).click();
			Thread.sleep(1000);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginAsUser2D()
	{
		try {
			oBrowser.findElement(By.name("username")).sendKeys("manju1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("7654");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void modifyuser1password()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("4321");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("4321");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteUser3()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(1000);
			TargetLocator target = oBrowser.switchTo();
			Alert oAlert = target.alert();
			String content = oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginAsUser1D()
	{
		try {
			oBrowser.findElement(By.name("username")).sendKeys("amar1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("4321");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteUser2()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(1000);
			TargetLocator target = oBrowser.switchTo();
			Alert oAlert = target.alert();
			String content = oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void deleteUser1()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(1000);
			TargetLocator target = oBrowser.switchTo();
			Alert oAlert = target.alert();
			String content = oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void closeapp()
	{
		try {
			oBrowser.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
