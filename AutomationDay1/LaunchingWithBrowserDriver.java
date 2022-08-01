package AutomationDay1;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchingWithBrowserDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\BrowserDrivers\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
	}

}
