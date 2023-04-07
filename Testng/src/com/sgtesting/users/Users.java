package com.sgtesting.users;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Users {
@Test
public void createuser()
{
	System.out.println("Create user sucessfully");
}
@Test
public void modifyuser()
{
	System.out.println("modify user sucessfully ");
}
@Test
public void deleteuser()
{
	System.out.println("The user Demouser1 has deleted successfully");
}
@BeforeClass
public void setup()
{
	System.out.println("Lanuch chrome Browser,Navigate the URL and login into application");
}
@AfterClass
public void tearDown()
{
	System.out.println("Logout from the appln and close application");
}
	

}
