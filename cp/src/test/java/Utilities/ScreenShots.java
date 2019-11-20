package Utilities;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class ScreenShots {
	
	WebDriver driver;
	
	public void takeSS() {
	
	TakesScreenshot src= ((TakesScreenshot)driver);
	
	File srcfile= src.getScreenshotAs(OutputType.FILE);
	
	 File DestFile=new File(./ScreenShots);

	//sasassasasasa
	}
}
