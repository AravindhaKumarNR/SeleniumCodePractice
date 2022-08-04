package AutomationDay1;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigatingWebPages {
	public static void main(String[] args) throws InterruptedException {

		//To create a Lead in LeafTaps website.
		//setting up driver using bonigarcia webdrivermanager:
		WebDriverManager.edgedriver().setup();

		//invoking browser driver
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		driver.get("https://www.flipkart.com");
		
		driver.navigate().to("https://www.amazon.in");
	
		driver.navigate().back();

		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		
		driver.close();
		
		
		

	}
}
