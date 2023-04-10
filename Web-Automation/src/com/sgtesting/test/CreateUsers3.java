package com.sgtesting.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateUsers3 {
    private static WebDriver oBrowser;
	public static void main(String[] args) {
		launch();
		navigateURL();
		login();
		minimizeFlyOutWindow();
		createMultipleusers();
		logout();
		loginAsuser1();
		welcomeuser();
		loginAsuser2();
		loginAsuser3();
		login();
		modifyuserpassword1();
		modifyuserpassword2();
		modifyuserpassword3();
		logout();
		loginasuser1();	
		logout();
		loginasuser2();
		logout();
		loginasuser3();
		logout();
		login();
		deleteuser1();
		deleteuser2();
		deleteuser3();
		logout();
		closeapp();
		

	}
	private static void launch()
	{
		try {
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			oBrowser=new ChromeDriver(option);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}private static void navigateURL()
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
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(1000);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void  minimizeFlyOutWindow()
	{
		try {
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createMultipleusers()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Amar");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("lastName")).sendKeys("Solapure");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("amar@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).sendKeys("Amar1");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("1234");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("1234");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(1000);
			
			
			
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("manju");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("lastName")).sendKeys("kiranagi");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("manju@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).sendKeys("manju1");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("4567");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("4567");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(1000);
			
			
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("siddu");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("lastName")).sendKeys("gampa");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("siddu@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).sendKeys("siddu1");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("1478");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("1478");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(1000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}private static void logout()
	{
		try {
			oBrowser.findElement(By.id("logoutLink")).click();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginAsuser1()
	{
		try {
			oBrowser.findElement(By.name("username")).sendKeys("Amar1");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("1234");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(1000);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void welcomeuser()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginAsuser2()
	{
		try {
			oBrowser.findElement(By.name("username")).sendKeys("manju1");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("4567");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
			Thread.sleep(1000);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginAsuser3()
	{
		try {
			oBrowser.findElement(By.name("username")).sendKeys("siddu1");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("1478");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
			Thread.sleep(1000);
	
			
			} catch (Exception e) {
			e.printStackTrace();
		}
		
			
		}
	private static void modifyuserpassword1()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("3214");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("3214");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}private static void modifyuserpassword2()
	{
		try {
			
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("6547");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("6547");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void modifyuserpassword3()
	{
		try {
		oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.name("password")).clear();
		Thread.sleep(1000);
		oBrowser.findElement(By.name("password")).sendKeys("2589");
		Thread.sleep(1000);
		oBrowser.findElement(By.name("passwordCopy")).clear();
		Thread.sleep(1000);
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("2589");
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div")).click();
		Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasuser1()
	{
		try {
			oBrowser.findElement(By.name("username")).sendKeys("Amar1");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("2589");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasuser2()
	{
		try {
			oBrowser.findElement(By.name("username")).sendKeys("manju1");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("6547");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasuser3()
	{
		try {
			oBrowser.findElement(By.name("username")).sendKeys("siddu1");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("3214");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteuser1()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			TargetLocator target = oBrowser.switchTo();
			Alert oAlert = target.alert();
			String content = oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteuser2()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			TargetLocator target = oBrowser.switchTo();
			Alert oAlert = target.alert();
			String content = oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteuser3()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			TargetLocator target=oBrowser.switchTo();
			Alert oAlert = target.alert();
			String content =oAlert.getText();
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
