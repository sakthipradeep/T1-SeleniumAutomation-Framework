package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import constatnts.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	private static WebDriver driver=null;
	
	
	public static void launchbrowser() {
		try {
        switch (Constants.browser) {
			
			case "chrome":
		      WebDriverManager.chromedriver().setup();
		      driver=new ChromeDriver();
		      break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				break;
				
				default:
					   WebDriverManager.chromedriver().setup();
					      driver=new ChromeDriver();
					      break;
	
		} 
	}
catch(Exception e) {
	e.printStackTrace();
}}
		
		

	public static WebDriver getDriver() {
		return driver;
	}
}
