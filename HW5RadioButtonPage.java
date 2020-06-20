package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class HW5RadioButtonPage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		
		System.out.println(driver.findElementById("yes").isSelected());
		System.out.println(driver.findElementById("no").isSelected());
		System.out.println(driver.findElementByXPath("(//input[@type='radio'])[3]").isSelected());
		System.out.println(driver.findElementByXPath("(//input[@type='radio'])[4]").isSelected());
		System.out.println(driver.findElementByXPath("(//input[@type='radio'])[4]").isEnabled());
		System.out.println(driver.findElementByXPath("//input[@name='age' and @value='1']").isDisplayed());
		
		
		driver.close();
		
		
		
		
		
		
		
	}

}
