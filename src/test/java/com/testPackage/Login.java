package com.testPackage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	
	
	@Test (groups = {"Functional"})
	public void OpenBrowser()
	{
		System.out.println(" this is OpenBrowser");
		
		Assert.assertEquals('S', 'A');
		
	}
	
	
	@Test (groups = {"Smoke"})
	public void LoginPage()
	{
		System.out.println(" this is LoginPage");
	}
	
	
	@Test (groups = {"Regression"})
	public void LoginCredential()
	{
		System.out.println(" this is LoginCredentia");
	}
	
	@Test (groups = {"Sanity", "unitTesting"})
	public void HomePAge()
	{
		System.out.println(" this is HomePAge");
	}
	
	@Test (groups = {"Functional", "Regression"})
	public void SearchProduct()
	{
		System.out.println(" this is SearchProduct1234");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * @BeforeMethod public void BeforeMethod() {
	 * System.out.println("BeforeMethod"); }
	 * 
	 * @BeforeTest public void BeforeTest() { System.out.println("BeforeTest"); }
	 * 
	 * @BeforeClass public void BeforeClass() { System.out.println("BeforeClass"); }
	 * 
	 * 
	 * @BeforeSuite public void BeforeSuite() { System.out.println("BeforeSuite"); }
	 * 
	 * 
	 * @Test public void LoginMethodTest() { System.out.println("LoginMethodTest");
	 * }
	 * 
	 * @Test public void PaymentMethodTest() {
	 * System.out.println("PaymentMethodTest"); }
	 * 
	 * 
	 * 
	 * 
	 * @AfterMethod public void AfterMethod() { System.out.println("AfterMethod"); }
	 * 
	 * @AfterClass public void AfterClass() { System.out.println("AfterClass"); }
	 * 
	 * @AfterSuite public void AfterSuite() { System.out.println("AfterSuite"); }
	 * 
	 * 
	 * @AfterTest public void AfterTest() { System.out.println("AfterTest"); }
	 * 
	 * 
	 */

}
