package com.miniproject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_login {
	
	

	public static void main(String[]args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home\\eclipse-workspace\\Selenium_project\\Chrome_driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement fbook = driver.findElement(By.cssSelector("[class$=img]"));
		String url2 = fbook.getText();
		
		boolean equalsIgnoreCase = currentUrl.equalsIgnoreCase(url2);
		System.out.println(equalsIgnoreCase);
		
		Thread.sleep(3000);
		
		if(currentUrl.contains(url2))
		{
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("@123");
		}
		else
		{
			System.out.println("wrong xpath");
		}
		
		if(currentUrl.contains(url2))
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");
		}
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
		//driver.findElement(By.xpath("//button[text()='Yes, Continue']")).click();
		
		Thread.sleep(1000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Home\\eclipse-workspace\\Selenium_project\\screenshot\\error5.png");
		FileUtils.copyFile(source, des);
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();


		TakesScreenshot ts2=(TakesScreenshot)driver;
		File source2=ts2.getScreenshotAs(OutputType.FILE);
		File des2=new File("C:\\Users\\Home\\eclipse-workspace\\Selenium_project\\screenshot\\facebook5.png");
		FileUtils.copyFile(source2, des2);
		
		
		WebElement sign = driver.findElement(By.xpath("//div[text()='Sign Up']"));
		String s=sign.getText();
		
		WebElement sign2 = driver.findElement(By.xpath("//button[text()='Sign Up'][1]"));
		String s2=sign2.getText();
		
		
		boolean equalsIgnoreCase2 = s.equalsIgnoreCase(s2);
		

		System.out.println(equalsIgnoreCase2);
		
		
		if(s.contains(s2)) 
		{
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("xyz");
		}
		
		else {
			System.out.println("wrong input");
		}
		
		
		if(s.contains(s2)) 
		{
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("zyx");
			//driver.findElement(By.xpath("//div[text()='Mobile number or email address']")).sendKeys("9834465119");
		}
		
		
		else 
		{
			System.out.println("wrong input");
		}
		
		
		Thread.sleep(1000);
		

		
		if(s.contains(s2))
		{
			
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9834465119");
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("abcd");
		}
	
		else 
		{
			System.out.println("wrong input");
	    }
		
		/////////////////////////////////////////////////////////////////////////////////////
		
		
		WebElement selectDoB = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select DB=new Select(selectDoB);
		DB.selectByIndex(1);
		
		WebElement DoB_mo= driver.findElement(By.xpath("//select[@title='Month']"));
		Select mo=new Select(DoB_mo);
		mo.selectByIndex(4);
		
		WebElement DOB_yr = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select yr=new Select(DOB_yr);
		yr.selectByIndex(8);
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
//		TakesScreenshot ts1=(TakesScreenshot)driver;
//		 File Source1=ts1.getScreenshotAs(OutputType.FILE);
//		 File des1=new File("C:\\Users\\Home\\eclipse-workspace\\Selenium_project\\screenshot\\textsc.png");
//		 FileUtils.copyFile(Source1,des1);
		
		//////////////////////////////////////////////////////////////////////////////////////
		 
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		Thread.sleep(1000);
		
		
		TakesScreenshot ts1=(TakesScreenshot)driver;
		 File Source1=ts1.getScreenshotAs(OutputType.FILE);
		 File des1=new File("C:\\Users\\Home\\eclipse-workspace\\Selenium_project\\screenshot\\textsc5.png");
		 FileUtils.copyFile(Source1,des1);
		
		 driver.close();
		 
//		 TakesScreenshot ts4=(TakesScreenshot)driver;
//		 File Source3=ts1.getScreenshotAs(OutputType.FILE);
//		 File des3=new File("C:\\Users\\Home\\eclipse-workspace\\Selenium_project\\screenshot\\close2.png");
//		 FileUtils.copyFile(Source3,des3);
	}

}
		
	


