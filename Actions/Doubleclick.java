package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\viganasan\\Desktop\\selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://only-testing-blog.blogspot.in/2014/09/selectable.html");
		
		WebElement ele=driver.findElement(By.xpath("//button[contains(.,'Double-Click Me To See Alert')]"));
		
		Actions ele1=new Actions(driver);
		ele1.doubleClick(ele);
		ele1.perform();
		
		

	}

}
