package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class HW4ButtonPage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		System.out.println("The Title is :"+driver.getTitle());
		
		
		  if (driver.getTitle().contains("TestLeaf")) {
		  
		  System.out.println("I Confirm the title has TestLeaf");
		  
		  }else System.out.println("The title does not have the word TestLeaf");
		  
		System.out.println("The Page Source is:"+driver.getPageSource());
		 
		
		//getCssValue
		System.out.println(driver.findElementById("color").getCssValue("background-color"));
		
		//getText
		System.out.println(driver.findElementById("home").getText());
		
		//getLocation
		System.out.println(driver.findElementById("position").getLocation().getX());
		System.out.println(driver.findElementById("position").getLocation().getY());
		System.out.println(driver.findElementById("position").getLocation());
		
		//getSize
		System.out.println(driver.findElementById("size").getSize().getHeight());
		System.out.println(driver.findElementById("size").getSize().getWidth());
		System.out.println(driver.findElementById("size").getSize());
		
		//getTagName
		System.out.println(driver.findElementById("home").getTagName());		
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
