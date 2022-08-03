package AutomationDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String[] args) {
		
		//Invoking Browser logging in to leaftaps and editing leads form.
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Logging in with credentials 
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Selecting CRM/SFA
		driver.findElement(By.tagName("a")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Creating Lead
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aravindha Kumar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("N R");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Aravind");
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing is really cool");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("bla12@bla.com");

		//Handling drop down
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd1=new Select(state);
		dd1.selectByValue("NY");
		driver.findElement(By.className("smallSubmit")).click();
		
		//Edting the webpage
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Testing is cool");
		driver.findElement(By.className("smallSubmit")).click();
		
		
		//verifying the title
		String title="View Lead | opentaps CRM";
		String title2 = driver.getTitle();
		if(title.contains(title2)) {
			System.out.println("Title is correct.");
		}
		else {
			System.out.println("Title is wrong.");
		}


		
	}
}
