package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2a {

	public static void main(String[] args) throws InterruptedException {
		// Initialize Chrome Driver
		ChromeDriver driver = new ChromeDriver();
		// Load URL
		String URL = new String("http://leaftaps.com/opentaps/");
		driver.get(URL);
		// Maximize the window
		driver.manage().window().maximize();
		
		// Enter Username, password, and click login button
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on CRM SFA link then leads tab then create leads from shortcuts 
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter the details on the page
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Company Name");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("First Name");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Last Name");
		
		// select dropdown Source by index value
		WebElement dropdown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sl = new Select(dropdown1);
		sl.selectByIndex(4);
		
		//select dropdown marketing camp by visible text
		WebElement dropdown2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sl2 = new Select(dropdown2);
		sl2.selectByVisibleText("Automobile");
		
		//select dropdown ownership by value
		WebElement dropdown3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sl3 = new Select(dropdown3);
		sl3.selectByValue("OWN_SCORP");
				
		//click on create lead and verify Title on current page 
		driver.findElement(By.name("submitButton")).click();
		// String txt1 = new String("Title");
		//WebElement ttl = driver.findElement(By.linkText("Title"));
		//String txt2 = new String(WebElement(ttl));
		//if( txt1== txt2) {
			
		//	System.out.println("Text-Title is available on your webpage");
			
		//}
		//else {
		//	System.out.println("Text-Title is not available on your webpage");
		//}
			
		//and wait for 10 secs
		Thread.sleep(10000);
		
		// close browser
		driver.close();
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	private static String WebElement(WebElement ttl) {
		// TODO Auto-generated method stub
		return null;
	}

}
