package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 System.out.println("URL opend successfully");
		

	}

}
