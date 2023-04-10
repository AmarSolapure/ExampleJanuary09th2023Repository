package com.sgtesting.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateUserScenarioDemo {
	public static WebDriver oBrowser;

	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
		login();
		minimizeFlyOutWindow();
		createuser();
		deleteuser();
		logout();
		closeapp();
	}

	private static void launchBrowser() {
		try {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			oBrowser = new ChromeDriver(options);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void navigateURL() {
		try {
			// Navigation obj=oBrowser.navigate();
			// obj.to("http://localhost:81/login.do");
			oBrowser.navigate().to("http://localhost:81/login.do");
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void login() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("loginButton")).click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void minimizeFlyOutWindow() {
		try {
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void createuser() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			oBrowser.findElement(By.name("firstName")).sendKeys("Amar");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("lastName")).sendKeys("Solapur");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_emailField\"]")).sendKeys("amarsolapure@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).sendKeys("Amar");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("1234");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("1234");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void deleteuser() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(1000);
			TargetLocator target = oBrowser.switchTo();
			Alert oAlert = target.alert();
			String content = oAlert.getText();
			System.out.println(content);
			oAlert.accept();


		} catch (Exception e) 
		{
			e.printStackTrace();
		}

	}
	private static void logout()
	{
		try {
			oBrowser.findElement(By.linkText("logout")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}private static void closeapp()
	{
		try {
			oBrowser.close();
		} catch (Exception e) {
            e.printStackTrace();
		}
	}

}
