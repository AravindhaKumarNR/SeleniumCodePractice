package AutomationDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatingLeadLeafTaps {
	public static void main(String[] args) {
		//To create a Lead in LeafTaps website
		//setting up driver using bonigarcia webdrivermanager
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
		//Creating Lead from clicking Create leads from homepage
		driver.findElement(By.linkText("Create Lead")).click();
		//Filling the necessary Form Details.
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aravindha Kumar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("N R");
		driver.findElement(By.className("smallSubmit")).click();
		
		
		
	}

}
