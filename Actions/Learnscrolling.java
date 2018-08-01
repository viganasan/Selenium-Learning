package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Learnscrolling {
  
	WebDriver driver;

	
	@Test
	

    public void ByVisibleElement() {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\viganasan\\Desktop\\selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		
		//driver.get("http://menuar.net/Home");
		 JavascriptExecutor js = (JavascriptExecutor) driver;

	        //Launch the application		
	        driver.get("http://demo.guru99.com/test/guru99home/");
	        driver.manage().window().maximize();

	        //Find element by link text and store in variable "Element"        		
	        WebElement Element = driver.findElement(By.linkText("Linux"));

	        //This will scroll the page till the element is found		
	        js.executeScript("arguments[0].scrollIntoView();", Element);
		
		

	}

}
