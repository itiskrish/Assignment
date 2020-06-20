package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class HW6GetAttribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		System.out.println(driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href"));
		System.out.println(driver.findElementByLinkText("Verify am I broken?").getAttribute("href"));
		
		
		
		driver.close();
		
		
	}

}
