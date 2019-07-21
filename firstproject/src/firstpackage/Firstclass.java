package firstpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstclass {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium worksace\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
	}
	

}
