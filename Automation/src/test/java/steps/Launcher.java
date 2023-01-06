package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import constatnts.Constants;
import driver.DriverManager;
import io.cucumber.java.Before;
import utills.Utills;

public class Launcher {


	//public static WebDriver driver;
	
	@Before
	public void beforeScenario() {
		try {
			
			Utills obj=new Utills();
			obj.loadproperties();
			if(DriverManager.getDriver()==null) {
			DriverManager.launchbrowser();
			obj.initiWebElements();
			}
		} catch (Exception e) {
       e.printStackTrace();
		}
	}



}
