package com.sgtesting.Product;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Product {
@Test
public void productUser()
{
	System.out.println("Product user Done succesfully ");
}
@Test
public void productmodify()
{
	System.out.println("Product modify Done Successfully ");
}
@Test 
public void deleteproduct()
{
	System.out.println("Product delete done succesfully");
}
@BeforeClass
public void productsetup()
{
	System.out.println(" launch chrome Browser,Navigate the URL and login ");
}
@AfterClass
public void TearDown()
{
	System.out.println("logout from application and close application ");
	System.out.println("   ");
}
}
