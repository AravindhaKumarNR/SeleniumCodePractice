package PracticingActions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListOfWebElementsFlipkart {
	public static void main(String[] args) {
		//Invoking EdgeDriver in EdgeBrowser
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		//Maximizing the screen and hitting the url
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/clothing-and-accessories/topwear/tshirt/men-tshirt/pr?sid=clo,ash,ank,edy&otracker=categorytree&otracker=nmenu_sub_Men_0_T-Shirts");
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> countingElements = driver.findElements(By.className("_3ywSr_"));
		int size = countingElements.size();
		System.out.println(size);
		
	}

}
