package DemoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTesting {

	public static void main(String[] args) {

		
		//Configure the Browser-chrome
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		//Launch The Browser
		WebDriver driver = new ChromeDriver();
		
		driver.close();
	}

}
