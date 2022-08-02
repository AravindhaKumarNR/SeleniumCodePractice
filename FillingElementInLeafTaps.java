package AutomationDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FillingElementInLeafTaps {
	
	public static void main(String[] args) {
		//Inititalizing Driver
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		
		//Getting to webpage and maximizing the screen
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/logout");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//clicking the hyperlink
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Creating Lead
		driver.findElement(By.linkText("Create Lead")).click();

		//filling the form details
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		//driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("ABC");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aravindha Kumar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("N R");
			
		//Handling DropDown -->I
		WebElement dropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropDownElement=new Select(dropDown);
		dropDownElement.selectByVisibleText("Existing Customer");
		driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("ABC123");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Aravind");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		
		//Handling DropDown -->II
		WebElement findElement = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dd1=new Select(findElement);
		dd1.selectByVisibleText("Car and Driver");

		//Forms
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("21/11/98");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("2500000");
		
		//Handling DropDown-->III
		WebElement currency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dd3=new Select(currency);
		dd3.selectByValue("INR");
		
		//Handling BirthDate
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("02/08/22");
		//Handling DropDown-->IV
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd4=new Select(industry);
		dd4.selectByVisibleText("Computer Software");
		//Forms
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("250");
		
		//Handling DropDown-->V
		WebElement industryType = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dd5=new Select(industryType);
		dd5.selectByIndex(1);
		
		//Forms
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Bla Bla Bla");
		
		driver.findElement(By.name("importantNote")).sendKeys("Bla Bla Bla");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("bla12@bla.com");
		
		//Handling DropDown --> VI
		WebElement stateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd6=new Select(stateProvince);
		dd6.selectByValue("IN");
		
		//Handling DropDown -->VII
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dd7=new Select(country);
		dd7.selectByValue("IND");
		
		
		driver.findElement(By.className("smallSubmit")).click();

		

	}
}
