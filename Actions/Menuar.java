package Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Menuar {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\viganasan\\Desktop\\selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://menuar.net");
		driver.findElement(By.xpath("//div[@class='col-sm-12 background']/div/div[3]/a")).click();
		driver.findElement(By.id("email")).sendKeys("viganasan@pnms.in");
		WebElement pwd = driver.findElement(By.name("Password"));
		pwd.sendKeys("Test12345@");
		WebElement cpwd=driver.findElement(By.id("cPwd"));
		cpwd.sendKeys("Test12345@");
		if(pwd==cpwd)
		{
			System.out.println("Both password is matched correctly");
		}
		else
		{
			System.out.println("Not matched");
		}
		driver.findElement(By.id("bName")).sendKeys("Prism New media");
		driver.findElement(By.id("fName")).sendKeys("Test1");
		driver.findElement(By.id("dba")).sendKeys("Test12345");
		driver.findElement(By.xpath("//input[@name='Street1']")).sendKeys("1 Philips Dr,");
		driver.findElement(By.xpath("//input[@name='Street2']")).sendKeys("Atlanta");
		driver.findElement(By.name("//input[@name='City']")).sendKeys("Georgia");
		
		WebElement country=driver.findElement(By.name("Country"));
		Select oSelect = new Select(country);
		oSelect.selectByVisibleText("USA");
		
		WebElement state=driver.findElement(By.name("State"));
		Select oSelect1 = new Select(state);
		oSelect1.selectByVisibleText("Georgia");
		
		driver.findElement(By.id("phone")).sendKeys("1234465789");
		driver.findElement(By.id("cName")).sendKeys("Test12345");
		driver.findElement(By.id("cEmail")).sendKeys("viganasan@pnms.in");
		
		driver.findElement(By.id("cPhone")).sendKeys("123456");
		driver.findElement(By.id("cCell")).sendKeys("123456");
		
		WebElement state1=driver.findElement(By.id("salesPerson"));
		Select state2 = new Select(state1);
		state2.selectByVisibleText("Corporate@pnms.in");
		

		

	}

}
