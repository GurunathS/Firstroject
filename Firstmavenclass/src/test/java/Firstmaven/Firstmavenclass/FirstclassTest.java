package Firstmaven.Firstmavenclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstclassTest {
	
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium worksace\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://phptravels.com/demo/");
		d.manage().window().maximize();
	}

}
