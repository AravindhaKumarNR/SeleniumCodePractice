package PracticingActions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayingWithActionsSnapdeal {
	public static void main(String[] args) {
		//Invoking EdgeDriver in EdgeBrowser
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		//Maximizing the screen and hitting the url
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement mensFashion = driver.findElement(By.partialLinkText("Men's Fashion"));
		//Actions to move to element and click the link
		Actions builder=new Actions(driver);
		builder.moveToElement(mensFashion).perform();
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		//To get the total number of items in a single page
		List<WebElement> title = driver.findElements(By.xpath("//p[@class='product-title']/parent::a"));
		int size = title.size();
		System.out.println("Total Number of Sports Shoes in a page are:"+size);
		//To get the count of total number of items present
		String count = driver.findElement(By.className("category-count")).getText();
		count=count.trim();
		System.out.println("Total Number of Sports Shoes availabe:"+count);
		driver.close();
	}

}
