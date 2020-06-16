package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class HW2EditLead {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("TestLeaf");
		driver.findElementByXPath("(//td[@class='x-btn-left']/following::button)[7]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		driver.findElementByLinkText("Edit").click();
		String attribute = driver.findElementById("updateLeadForm_companyName").getAttribute("value");
		System.out.println(attribute);
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("NewTestLeaf");
		driver.findElementByXPath("(//input[@class='smallSubmit'])[1]").click();
		Thread.sleep(3000);
		driver.close();
		
		 
		
		
		
		
	}

}
