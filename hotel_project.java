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

public class hotel_project {

	public static void main(String[]args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\Selenium_project\\Chrome_driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		//driver.get("url");
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys("komnikure");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("nik2703");
		WebElement login = driver.findElement(By.xpath("//input[contains(@name,'login')]"));
		login.click();
		
		Thread.sleep(500);
		WebElement dropdown = driver.findElement(By.xpath("//select[contains(@name,'location')]"));
		Select s=new Select(dropdown);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		s.selectByIndex(2);
		Thread.sleep(500);
		WebElement selecthotel = driver.findElement(By.xpath("//select[contains(@name,'hotels')]"));
		Select s1=new Select(selecthotel);
		boolean multiple2 = s1.isMultiple();
		System.out.println(multiple2);
		s1.selectByValue("Hotel Creek");
		Thread.sleep(500);
		WebElement room= driver.findElement(By.xpath("//select[contains(@name,'room_type')]"));
		Select s2=new Select(room);
		boolean multiple3 = s2.isMultiple();
		System.out.println(multiple3);
		s2.selectByVisibleText("Super Deluxe");
		Thread.sleep(500);
		WebElement roomno = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s3=new Select(roomno);
		boolean multiple4 = s3.isMultiple();
		System.out.println(multiple4);
		s3.selectByIndex(2);
		Thread.sleep(500);
		WebElement adultroom = driver.findElement(By.xpath("//select[contains(@name,'adult_room')]"));
		Select s4=new Select(adultroom);
		boolean multiple5 = s4.isMultiple();
		System.out.println(multiple5);
		s4.selectByIndex(3);
		Thread.sleep(500);
		WebElement childroom = driver.findElement(By.xpath("//select[contains(@name,'child_room')]"));
		Select s5=new Select(childroom);
		boolean multiple6 = s5.isMultiple();
		System.out.println(multiple6);
		s5.selectByIndex(3);
		Thread.sleep(500);
		WebElement submit = driver.findElement(By.xpath("//input[@name='Submit']"));
		submit.click();
		
		driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
		
		driver.findElement(By.xpath("//input[@name='continue']")).click();
		
		Thread.sleep(500);
		WebElement user_name= driver.findElement(By.xpath("//input[@name='first_name']"));
		user_name.sendKeys("komal");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
		lastname.sendKeys("xyzss");
		
		WebElement add= driver.findElement(By.xpath("//textarea[@name='address']"));
		add.sendKeys("chennai");
		
		WebElement cc_no = driver.findElement(By.xpath("//input[@name='cc_num']"));
		cc_no.sendKeys("7896321458963256");
		
		Thread.sleep(500);
		WebElement cctype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select s6=new Select(cctype);
		s6.selectByIndex(2);
		
		WebElement ccmonth = driver.findElement(By.xpath("//select[contains(@name,'cc_exp_month')]"));
		Select s7=new Select(ccmonth);
		s7.selectByIndex(2);
		
		WebElement ccyear = driver.findElement(By.xpath("//select[contains(@name,'cc_exp_year')]"));
		Select s8=new Select(ccyear);
		s8.selectByIndex(4);
		
		WebElement ccv = driver.findElement(By.xpath("//input[contains(@name,'cc_cvv')]"));
		ccv.sendKeys("123");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@type='button']")).click();
		
		driver.findElement(By.xpath("//input[contains(@name,'my_itinerary')]")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[contains(@name,'logout')]")).click();
		Thread.sleep(500);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Home\\eclipse-workspace\\Selenium_project\\screenshot\\logout_page.png");
		FileUtils.copyFile(source, des);
		
		
	driver.navigate().back();
	Thread.sleep(500);
	driver.navigate().refresh();
	driver.close();
	}
}