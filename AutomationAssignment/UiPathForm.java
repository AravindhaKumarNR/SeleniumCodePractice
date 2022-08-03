package AutomationWeek;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UiPathForm {

	public static void main(String[] args) {
		//Logging in and logging out  UiPathForm
		
		//Launching Browser
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();

		//Wait Statements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
		
		//Submit Button
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		//Logging out
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
	}

}
