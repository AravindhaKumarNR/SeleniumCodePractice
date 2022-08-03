package AutomationWeek;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		
		//Launching Browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		//Maximize and wait statement.
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("XYZ XYZ");
		driver.findElement(By.name("lastname")).sendKeys("ABC ");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9123456789");
		driver.findElement(By.id("password_step_input")).sendKeys("122dqad@Ab");
		
		//Handling DropDowns
		WebElement birthDay = driver.findElement(By.name("birthday_day"));
		Select dd1=new Select(birthDay);
		dd1.selectByVisibleText("21");
		
		WebElement birthMonth = driver.findElement(By.name("birthday_month"));
		Select dd2=new Select(birthMonth);
		dd2.selectByVisibleText("Nov");
		
		WebElement birthYear = driver.findElement(By.name("birthday_year"));
		Select dd3=new Select(birthYear);
		dd3.selectByVisibleText("1998");
		
		//Handling Radio Button Selecting Female
		driver.findElement(By.name("sex")).click();
		
		//Submiting the form
		driver.findElement(By.name("websubmit")).click();
		
		
	}

}
