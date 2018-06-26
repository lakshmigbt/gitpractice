package com.practice_selenium;


import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		



	public class EditCompanyName {


		    public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			// launch the browser
			ChromeDriver driver = new ChromeDriver();

			// open the url
			driver.get("http://leaftaps.com/opentaps/control/main");
	
			//maximize the screen
			driver.manage().window().maximize();
			
			//login credentials
			//driver.findElement(By.className("inputLogin")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();

			Thread.sleep(2000);
			
			// click on crmsfa link
			driver.findElement(By.linkText("CRM/SFA")).click();
		
			//click on leads link
			driver.findElement(By.linkText("Leads")).click();

			Thread.sleep(2000);
			
			//click on find leads link
			driver.findElement(By.linkText("Find Leads")).click();
			
			
			// input first name
			driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("uma");
			
			//click on leads link	
			driver.findElement(By.linkText("Find Leads")).click();
			
			Thread.sleep(5000);
			
			//click on 1st record from the table
			driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]").click();
			
			//get the page title
			String myTitle = driver.getTitle();
			
			//print the title of page
			System.out.println(myTitle);
			
			//Verify title of the page 
			if(myTitle.contains("View Lead | opentaps CRM"))
				{
					System.out.println("tc passed");
				}
				else
				{
					System.out.println("tc failed");
				}

			//click on edit link
			driver.findElementByXPath("//a[text()='Edit']").click();
		
			Thread.sleep(5000);
			
			//clear  company name
			driver.findElementByXPath("(//input[@name='companyName'])[2]").clear();
		
			//enter a new input to the company field
			driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("ADD Technologies");
		
			//click on update
			driver.findElementByXPath("//input[@value='Update']").click();
			
		
			
			
			
			
		   }
}
