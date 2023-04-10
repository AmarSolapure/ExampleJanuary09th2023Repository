package com.sgtesting.Assertion;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualDemo {
      @Test(enabled=false)
      public void assertequalsTestng()
      {
    	  try {
			String s1="JavaScript";
			String s2=new String("JavaScript");
			Assert.assertEquals(s1, s2);
			System.out.println(" This step will execute after successful execution of assertdemo");
		} catch (Exception e) {
			e.printStackTrace();
		}
      }
      @Test(enabled=false)
      
    	  public void assertnotequalstestng()
    	  {
    	  try {
    	  
		  String s1="JavaScript";
		  String s2=new String("JavaScript1");
		  Assert.assertNotEquals(s1, s2);
		  System.out.println("This step will execute succesful execution of assertnotequals");
	  
    	  
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    	  }
      @Test(enabled=false)
      public void asserttruetesting()
      {
    	  try {
    		  int x=25;
    		  int y=50;
    		  Assert.assertTrue(x<=y);
    		  System.out.println("This step will execute after succesfull execution of asserttrue");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
      }
    	  @Test(enabled =false)
    	  public void assertfalsetesting()
    	  {
    		  try {
				int x=25;
				int y=50;
				Assert.assertFalse(x>=y);
				System.out.println("This step will execute first after successful execution of assertfalse");
			} catch (Exception e) {
				e.printStackTrace();
			}
    	  }
    	  @Test(enabled=false)
    	  public void assertnulltesting()
    	  {
    		  try {
    			  File obj=null;
    			  Assert.assertNull(obj);
    			  System.out.println("This step will execute after successfull execution of assertnulltesting ");
    			  
				
			} catch (Exception e) {
				e.printStackTrace();
			}
    	  }
    	  @Test(enabled =false)
    	  public void assertnotnull()
    	  {
    		  try {
				File obj=null;
				obj=new File("D:\\AmarPersonelDocument");
				Assert.assertNotNull(obj);
				System.out.println("This step will execute after successfull execution of assertnotnull");
			} catch (Exception e) {
				
			}
    	  }
    	  @Test(enabled=false)
    	  public void assertsameTesting()
    	  {
    		  try {
				String s1="JavaScript";
				String s2="JavaScript";
				Assert.assertSame(s1, s2);
				System.out.println(" This step will execute after successfull execution of assertsametesting");
			} catch (Exception e) {
				e.printStackTrace();
			}
    	  }
    	  @Test(enabled =true)
    	  public void assertnotsameTesting()
    	  {
    		  try {
				String s1="JavaScript";
				String s2=new String("JavaScript123");
				Assert.assertNotSame(s1, s2);
				System.out.println("this step will execute after successfull execution of assertnotsametesting");
			} catch (Exception e) {
				e.printStackTrace();
			}
    	  }
    	  
      }
      


