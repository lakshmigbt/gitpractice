package com.sel;


import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		



	public class Facebook {


		    public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			// launch the browser
			ChromeDriver driver = new ChromeDriver();

			// open the url
			driver.get("https://en-gb.facebook.com/");
	
			//maximize the screen
			driver.manage().window().maximize();
			
			//login credentials
			//driver.findElement(By.className("inputLogin")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("email")).sendKeys("9739369572");
			driver.findElement(By.id("pass")).sendKeys("Samurai@123");
		    }
	}