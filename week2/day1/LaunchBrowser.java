package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch Chrome Driver
		
		ChromeDriver driver = new ChromeDriver();
		
		// Maximize the browser screen
		
		driver.manage().window().maximize();
		
		// Get or open the URl on browser
		
		driver.get("https://www.facebook.com/\r\n");
		
		// Wait for 3 seconds
		
		Thread.sleep(3000);
		
		//close the browser
		
		driver.close();
			

	}

}
