package com.sgtesting.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowserDemo {

	public static WebDriver oBrowser = null;

	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
		closeapp();

	}

	private static void launchBrowser() {
		try {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("---remote-allow-origins=*");

			oBrowser = new ChromeDriver(option);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void navigateURL() {
		try {

			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void closeapp() {
		try {
			oBrowser.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
