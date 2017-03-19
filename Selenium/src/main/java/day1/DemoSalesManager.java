package day1;


import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSalesManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Testleaf/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoCSR"); //DemoSalesManager
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("CompanyName");
		driver.findElementById("createLeadForm_firstName").sendKeys("Kamalasekar");
		driver.findElementById("createLeadForm_lastName").sendKeys("Ramachandran");
		driver.findElementById("createLeadForm_dataSourceId").sendKeys("Cold Call");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Raja");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Mr");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Male");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("10.00");
		driver.findElementById("createLeadForm_industryEnumId").sendKeys("Aerospace");
		driver.findElementById("createLeadForm_ownershipEnumId").sendKeys("Sole Proprietorship");
		driver.findElementById("createLeadForm_sicCode").sendKeys("12345");
		driver.findElementById("createLeadForm_description").sendKeys("Description");
		driver.findElementById("createLeadForm_importantNote").sendKeys("ImportantNote");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("2");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("91");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("8866");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("tkgkamal@gmail.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("Kamal");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("Flat no 4185");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("603103");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("123");
		driver.findElementById("createLeadForm_parentPartyId").sendKeys("10867");
		driver.findElementById("createLeadForm_marketingCampaignId").sendKeys("Affiliate Sites");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Sekar");
		driver.findElementById("createLeadForm_birthDate").sendKeys("02/04/17");
		driver.findElementById("createLeadForm_departmentName").sendKeys("DepartmentName");
		driver.findElementById("createLeadForm_currencyUomId").sendKeys("AFA - Afghani");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("$");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("12345789");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("primaryPhoneAskForName");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("primaryWebUrl");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("generalAttnName");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("generalAddress2");
		driver.findElementById("createLeadForm_generalStateProvinceGeoId").sendKeys("Alabama");
		driver.findElementById("createLeadForm_generalCountryGeoId").sendKeys("Algeria");
		driver.findElementByName("submitButton").click();
		System.out.println("testcase passed");


	}
}
