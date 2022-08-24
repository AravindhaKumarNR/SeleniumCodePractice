package PracticingActions;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayingWithActionsNykaa {
	public static void main(String[] args) throws InterruptedException {
		//Invoking EdgeDriver in EdgeBrowser
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		//Maximizing the screen and hitting the url
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Identifying webelement brand
		WebElement brand = driver.findElement(By.xpath("//a[text()='brands']"));
		//Actions to move to element and click the link
		Actions builder=new Actions(driver);
		builder.moveToElement(brand).perform();
		WebElement LorealClick = driver.findElement(By.xpath("//div[@id='brandCont_Popular']//li[5]"));
		LorealClick.click();
		//Verifying whether the title contains L'Oreal Paris 
		String title = driver.getTitle();
		boolean verifyingTitle = title.contains("L'Oreal Paris");
		System.out.println("Title contains \"L\'Oreal Paris\":"+verifyingTitle);
		//Sorting from Customer rated
		//Clicking on Customer rating
		driver.findElement(By.xpath("//div[@class='css-0']/child::button")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		//Clicking concern-->color protection
		WebElement element = driver.findElement(By.xpath("//span[text()='Concern']"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		WebElement mrp = driver.findElement(By.xpath("(//div[@class='css-1d0jf8e'])[1]"));
		String mrpOfShampoo = mrp.getText();
		System.out.println(mrpOfShampoo);
		//Selecting the 1st shampoo and then adding to bag
		driver.findElement(By.xpath("(//div[@class='css-43m2vm'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> openWindow  =new ArrayList<String>(windowHandles);
		String opString=openWindow.get(1);
		driver.switchTo().window(opString);
		//Adding to bag
		WebElement addToBag = driver.findElement(By.xpath("//div[@class='css-vp18r8']"));
		wait.until(ExpectedConditions.elementToBeClickable(addToBag));
		addToBag.click();
		//Opening cart
		driver.findElement(By.xpath("//button[@class='css-g4vs13']")).click();
		//Proceeding as Guest
		WebElement proceedFrame = driver.findElement(By.className("css-acpm4k"));
		driver.switchTo().frame(proceedFrame);
		driver.findElement(By.xpath("//span[text()='Proceed']//ancestor::button")).click();
		//Clicking on continue as guest
		driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();
		//Comparing the price with MRP and Grand Total:
		//It will return false
		String grandTotal = driver.findElement(By.xpath("(//div[@class='value']/span)[2]")).getText();
		System.out.println("Grand Total:\n"+grandTotal);
		boolean comparingTotal_mrp = grandTotal.equals(mrpOfShampoo);
		System.out.println("Both the values are same:"+comparingTotal_mrp);
		//Closing the current page
		driver.close();
		//Closing the browser
		driver.quit();
		

	}
}
