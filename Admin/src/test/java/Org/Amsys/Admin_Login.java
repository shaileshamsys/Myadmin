package Org.Amsys;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Admin_Login 
{
	@Test
	public void Validlogin() throws InterruptedException
	{
		
		
		 //*FAQ- Can Manage the downloads and setups easilyyyy*//
		
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.saucedemo.com"); //*FAQ- Wait until the page load*//
		//driver.navigate().to("https://www.saucedemo.com");//*FAQ- Cannot wait for page load and maintains browser history and cookies *//
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//driver.close();
		List<WebElement> listOfAllWebElements = driver.findElements(By.cssSelector(".inventory_item_price"));
		
		for(WebElement element : listOfAllWebElements)
		{
			
	
			String a = element.getText().replaceAll("[^1-9]","");
			if (a.length()==3)
			{
				driver.findElement(By.xpath("//button[text()=\"Add to cart\"]")).click();
				
			}
		
	
		}
		
		
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("Tom");
		driver.findElement(By.id("last-name")).sendKeys("Cruise");
		driver.findElement(By.id("postal-code")).sendKeys("410210");
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("finish")).click();
		
		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(3000);
	}
	
	
	

}
