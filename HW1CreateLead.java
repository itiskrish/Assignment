package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HW1CreateLead {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("TestLeaf");
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Krish");
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Ganesh");
		
		WebElement eleDD1 = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(eleDD1);
		dd.selectByValue("LEAD_EMPLOYEE");
		
		driver.findElementByXPath("//input[@id='createLeadForm_annualRevenue']").sendKeys("10,00,000");
		
		WebElement eleIndus = driver.findElementById("createLeadForm_industryEnumId");
		Select ddi = new Select(eleIndus);
		ddi.selectByIndex(3);
		
		WebElement eleOwner = driver.findElementById("createLeadForm_ownershipEnumId");
		Select ddown = new Select(eleOwner);
		ddown.selectByVisibleText("S-Corporation");
		
		//driver.findElementById("(//span[text()='Description']/following::textarea)[1]").sendKeys("Selenium");
		driver.findElementById("createLeadForm_description").sendKeys("Selenium");

		WebElement eleMark = driver.findElementById("createLeadForm_marketingCampaignId");
		Select ddmark = new Select(eleMark);
		ddmark.selectByIndex(6);
		//select[@id='createLeadForm_marketingCampaignId']
		
		WebElement eleState = driver.findElementByXPath("//select[@id='createLeadForm_generalStateProvinceGeoId']");
		Select ddState = new Select(eleState);
		ddState.selectByValue("TX");
		
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("testemail@testemail.com");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9999988888");
		driver.findElementByXPath("//input[@name='submitButton']").click();
		driver.close();	
		
		
	
	
	}

}
