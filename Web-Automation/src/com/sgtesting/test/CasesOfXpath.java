package com.sgtesting.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CasesOfXpath {
public static WebDriver oBrowser;
	public static void main(String[] args) {
		
		launchBrowser();
		navigateURL();
		//absolutexpath();
		//relativeXpathBasedonTagName();
		//relativeXpathBasedonTagNameWithIndex();
		//relativeXpathWithTagNameAndAttributeNameValue();
		//relativeXpathWithTagNameWithMultipleAttributeNameValue();	
		//relativeXpathWithTagNameWithMultipleAttributeNameValueUsingAND();
		//relativeXpathWithPartialMatchingOfAttributeValue();
		//relativeXpathWithTagNameAndAttributeName();
		//relativeXpathWithTagNameAndAttributeName_1();
		//relativeXpathWithTagNameAndAttributeName_2();
		//relativeXpathWithTagNameAndAttributeName_3();
		//relativeXpathWithTagNameAndTextContent();
		relativeXpathWithTagNameAndPartialTextContent();
		
	}public static void launchBrowser()
	{
		try {
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			oBrowser=new ChromeDriver(option);
			 //oBrowser= new FirefoxDriver(); 
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void navigateURL()
	{
		try {
			oBrowser.navigate().to("file:///D:/HTML/Sample.html");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Case 1: identify the element based on tagName
	 * syntax: //<tagName>
	 */
	private static void absolutexpath()
	{
		try {
			oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("Amar");
			Thread.sleep(2000);
			//oBrowser.findElement(By.xpath("html/body/div/form/input[2]")).sendKeys("manager");
			//Thread.sleep(2000);
			//oBrowser.findElement(By.xpath("html/body/div/form/input[3]")).click();
			//Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void relativeXpathBasedonTagName()
	{/**
		 * Case 2: identify the element based on tagName with index
		 * syntax: //<tagName>[index]
		 */
		/**/
		try {
			oBrowser.findElement(By.xpath("//input")).sendKeys("Amar");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//input[2]")).sendKeys("Manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//input[3]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	 
	private static void relativeXpathBasedonTagNameWithIndex()
	{
		/* Case 3: identify the element based on tagName with 
		 *			Attribute Name and Value Combination
		 * syntax: //<tagName>[@attributename='attributevalue']
		 */
		try {
			oBrowser.findElement(By.xpath("//input[@type='text']")).sendKeys("Amar");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//input[@id=\"pwd1pass1word1\"]")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//input[@name=\"submit1btn1\"]")).click();
			Thread.sleep(2000);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void relativeXpathWithTagNameAndAttributeNameValue()
	{
	/**
	 * Case 4: irrespective of tagName,identify the element based on  
	 *			Attribute Name and Value Combination
	 * syntax: //*[@attributename='attributevalue']
	 
	 */
		
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"tools\"]")).click();
		} catch (Exception e) {
			e.printStackTrace();
			
		}/**
		 * Case 5: irrespective of tagName, irrespective of  
		 *			Attribute Name, identify based on attribute Value 
		 * syntax: //*[@*='attributevalue']
		 */
	}
	private static void relativeXpathWithTagNameWithMultipleAttributeNameValue()
	{
		try {
			/**
			 * Case 7: identify the element based on tagName with 
			 *			Multiple Attribute Name and Value Combination using OR operator
			 * syntax: //<tagName>[@attributename1='attributevalue' or @attributename2='attributevalue']
			 */
			//oBrowser.findElement(By.xpath("//input[@id='btn1submit1button1' or name='submit1btn1']")).click(); 
			
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
	private static void relativeXpathWithTagNameWithMultipleAttributeNameValueUsingAND()
	{
		/**
		 * Case 8: identify the element based on tagName with 
		 *			Multiple Attribute Name and Value Combination using AND operator
		 * syntax: //<tagName>[@attributename1='attributevalue' and @attributename2='attributevalue']
		 */
		try {
			oBrowser.findElement(By.xpath("//input[@id='pwd1pass1word1' and @name='pass1word1']")).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void relativeXpathWithPartialMatchingOfAttributeValue()
	{
		/**
		 * Case 9: identify the element based on  
		 *			partial matching of Attribute Value 
		 * syntax: 
		 *  starts-with(@attributeName,'attributeValue')
		 *  ends-with(@attributeName,'attributeValue')
		 *  contains(@attributeName,'attributeValue')
		 * 
		 *  //<tagName>[starts-with(@attributeName,'attributeValue')]
		 *  //<tagName>[ends-with(@attributeName,'attributeValue')]
		 *  //<tagName>[contains(@attributeName,'attributeValue')]
		 */
		try {
			oBrowser.findElement(By.xpath("//input[starts-with(@id,'btn1submit1button1')]")).click();
			oBrowser.findElement(By.xpath("//input[contains(@name,'submit1btn1')]")).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		/**
		 * Case 10: identify the element based on tagName with 
		 *			Attribute Name Combination
		 * syntax: //<tagName>[@attributename]
		 */
	}
	private static void relativeXpathWithTagNameAndAttributeName()
	{
		
		try {
			// find out number of links in the application
			List<WebElement> links=oBrowser.findElements(By.xpath("//a[@href]"));
			System.out.println("# of Links in Application :"+links.size());
			
		} catch (Exception e) {
			
		}
		
	}
	private static void relativeXpathWithTagNameAndAttributeName_1()
	{
		try {
			
				// Display all names of links in the application
				List<WebElement>links=oBrowser.findElements(By.xpath("//a[@href]"));
				for(int i=0;i<links.size();i++)
				{
					WebElement link=links.get(i);
					System.out.println(link.getText());
					
					
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		
	}
	private static void relativeXpathWithTagNameAndAttributeName_2()
	{
		try {
			
			List<WebElement>links=oBrowser.findElements(By.xpath("//a[@href]"));
			for(int i=0;i<links.size();i++)
			{
				WebElement link=links.get(i);
				String linkcontent=link.getText();
				if(linkcontent.endsWith("HQ"))
				{
					link.click();
					Thread.sleep(2000);
					break;
				}
				oBrowser.navigate().back();
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}private static void relativeXpathWithTagNameAndAttributeName_3()
	
	{
		try {
			
			// org.openqa.selenium.StaleElementReferenceException: stale element reference: 
			// element is not attached to the page document
			List<WebElement> links=oBrowser.findElements(By.xpath("//a[@href]"));
			for(int i=0;i<links.size();i++)
			{
				WebElement link=links.get(i);
				String linkContent=link.getText();
				if(linkContent.endsWith("HQ"))
				{
					link.click();
				}
			}
		}
		 catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void relativeXpathWithTagNameAndTextContent()
	{
		try {
			/**
			 * Case 11: identify the element based on tagName with 
			 *			Text Content Combination
			 * syntax: //<tagName>[text()='text Content']
			 */
			oBrowser.findElement(By.xpath("//a[text()='POI Apache'])")).click();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void relativeXpathWithTagNameAndPartialTextContent()
	{
		/**
		 * Case 12: identify the element based on tagName with 
		 *			Partial Text Content
		 * syntax: 
		 *  starts-with(text(),'partial text content')
		 *  ends-with(text(),'partial text content')
		 *  contains(text(),'partial text content')
		 *  
		 *  //<tagName>[starts-with(text(),'partial text content')]
		 *  //<tagName>[ends-with(text(),'partial text content')]
		 *  //<tagName>[contains(text(),'partial text content')]
		 */
		try {
			//oBrowser.findElement(By.xpath("starts-with(text(),'Eclipse')")).click();
			oBrowser.findElement(By.xpath("//a[contains(text(),'Eclipse')")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
