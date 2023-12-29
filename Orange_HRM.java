package com.miniproject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Orange_HRM {

	public static void main(String[]args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\Selenium_project\\Chrome_driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement admin = driver.findElement(By.xpath("//p[text()='Username : Admin']"));
		String ad=admin.getText();
		
		WebElement adm= driver.findElement(By.xpath("//input[@name='username']"));
		String ad2=adm.getText();
		
		boolean equalsIgnoreCase = ad.equalsIgnoreCase(ad2);
		System.out.println(equalsIgnoreCase);
		
		if(ad.contains(ad2))
		{
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		}
		
		WebElement pass = driver.findElement(By.xpath("//p[text()='Password : admin123']"));
		String pa=pass.getText();
		
		WebElement pass2 = driver.findElement(By.xpath("//input[@name='password']"));
		String pa2=pass2.getText();
		
		boolean equalsIgnoreCase2 = pa.equalsIgnoreCase(pa2);
		System.out.println(equalsIgnoreCase2);
		
		if(pa.contains(pa2))
		{
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		}
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,2000)");
		
//		WebElement scrolld = driver.findElement(By.xpath("//p[text()='Employees on Leave Today']"));
//		js.executeScript("argument[4].scrollIntoView();",scrolld);
		
		driver.findElement(By.xpath("//span[text()='My Info']")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(2000);
		
		TakesScreenshot ref = (TakesScreenshot)driver;
		File source =ref.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Home\\eclipse-workspace\\Selenium_project\\screenshot\\successfully.png");
		FileUtils.copyFile(source,des);
		
 WebElement log = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
 log.click();
 
 driver.findElement(By.xpath("//a[text()='Logout']")).click();
 Thread.sleep(2000);
 driver.quit();


	}
}
