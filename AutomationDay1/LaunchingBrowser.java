package AutomationDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingBrowser {
	public static void main(String[] args) {

		//Setuping the browser drivers
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//Setting up the link and launching the browser.
		driver.get("http://leaftaps.com/opentaps/control/main");
		//to maximize the full screen
		driver.manage().window().maximize();
		//accessing webelements
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//to printing the text
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println("The given text is :\n"+text);
	}
}
