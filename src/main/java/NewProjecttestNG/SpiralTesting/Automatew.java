package NewProjecttestNG.SpiralTesting;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automatew {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rk650\\.eclipse\\SpiralTesting\\driver\\chromedriver.exe");
		//interface   ref       class
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html#");
	    
		WebElement mul = driver.findElement(By.id("multi-select"));
 		Select s = new Select(mul);
 		
 		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		List<WebElement> alloptions = s.getOptions();
		for (WebElement options : alloptions) {
			String text = options.getText();
			System.out.println(text);
		}
		
		int size = alloptions.size();
		System.out.println(size);
		 
		for (int i = 0; i <size; i++) {
			if (i==0||i==3||i==5) {
				s.selectByIndex(i);
			}
		}
		
		
		
	 
	}
	   
}
