package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginApplication {

	public static void main(String[] args) throws InterruptedException {
		// Launch Chrome Driver
		
				ChromeDriver driver = new ChromeDriver();
				
				// Maximize the browser screen
				
				driver.manage().window().maximize();
				
				// Get or open the URl on browser
				
				driver.get("http://www.facebook.com");
				
				//Syntax
				
				driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
				driver.findElement(By.id("pass")).sendKeys("Tuna@321");
				driver.findElement(By.name("login")).click();
				
				//Delay 10 secs
				
				Thread.sleep(15000);
				
				// close 
				
				driver.close();

	}

}
