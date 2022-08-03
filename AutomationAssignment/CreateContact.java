package AutomationWeek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {

		//To create a Lead in LeafTaps website.
		//setting up driver using bonigarcia webdrivermanager:
		WebDriverManager.edgedriver().setup();

		//invoking browser driver
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();

		//Hitting the link leaftaps.com
		driver.get("http://leaftaps.com/opentaps/control/main");

		//filling the login page
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		//Selecting CRM/SFA
		driver.findElement(By.tagName("a")).click();
		
		//Creating Contact
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Aravindha Kumar ");
		driver.findElement(By.id("lastNameField")).sendKeys("N R");
		driver.findElement(By.name("firstNameLocal")).sendKeys("Aravindha Kumar");
		driver.findElement(By.name("lastNameLocal")).sendKeys("N R");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Test Test Test");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("123@12.com");
		
		
		//Handling DropDown
		WebElement province = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd1=new Select(province);
		dd1.selectByVisibleText("Indiana");
		
		driver.findElement(By.name("submitButton")).click();
		
		//Editing the contact
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("Test Test");
		
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		String text=driver.getTitle();
		System.out.println(text);
		
		driver.close();
		
		
	}

}
