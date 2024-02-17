package functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_run_004_Test {

	@Test
	public void run() throws InterruptedException
	{
		String url = System.getProperty("url");
		System.out.println(url);
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		driver.quit();
	}
}
