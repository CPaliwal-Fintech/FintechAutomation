package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class1 {
	
	String URL= "http://wwwtest.vcmpartners.com/xp/?returnUrlCode=xpappstore";
	
	
	@Test
	public void tata() throws InterruptedException {
		
	Reporter.log("Test started");
	
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get(URL);
	driver.manage().window().maximize();
	
	WebElement un = driver.findElement(By.id("UserEmail"));
	WebElement pw = driver.findElement(By.id("UserPassword"));
	WebElement singbtn = driver.findElement(By.id("btnSignIn"));
	
	un.sendKeys("bjivani.trader@fintechglobal.center");
	pw.sendKeys("Passw0rd");
	singbtn.click();
	
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	
	System.out.println("Test ended");
	
	Thread.sleep(5000);
	//driver.close();
	
	Reporter.log("Driver Closed");
	
	
	
	}
	

}
