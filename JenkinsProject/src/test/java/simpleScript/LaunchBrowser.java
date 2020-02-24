package simpleScript;
/**
 * 
 * @author HenTryRAj
 *
 */

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
	@Test
	public void LaunchBrowser1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		String title =  driver.getTitle();
		System.out.println("The Title of the page is ===>>" +title);
		driver.close();
	}

}
