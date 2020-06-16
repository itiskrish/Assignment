package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class HW3DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByName("emailAddress").sendKeys("testemail@testemail.com");
		driver.findElementByXPath("(//td[@class='x-btn-center']/following::button)[6]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@class=\"x-grid3-cell-inner x-grid3-col-partyId\"]/a").click();
		driver.findElementByLinkText("Delete").click();
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(2000);
		driver.findElementByName("id").sendKeys("10771");
		driver.findElementByLinkText("Find Leads").click();
		
	}

}
