package AutomationWeek;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditingLeads {
	public static void main(String[] args) throws InterruptedException {
		//Invoking Browser logging in to leaftaps and editing leads form.
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://leaftaps.com/opentaps/control/login");

		//Logging in with credentials 
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		//Selecting CRM/SFA
		driver.findElement(By.tagName("a")).click();
		
		//Clicking on Leads
		driver.findElement(By.xpath("//div[@class='x-panel-header']//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//div[@class='frameSectionBody']//li/a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Aravindha Kumar");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//table/tbody/tr/td/div/a")).click();
		
		Thread.sleep(5000);
		driver.close();

	}
}
