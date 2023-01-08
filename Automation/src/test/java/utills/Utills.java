package utills;

import java.util.Objects;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import constatnts.Constants;
import driver.DriverManager;
import objects.Shopping;

public class Utills {
	

	public  void loadproperties() {
		/*
		 * FileReader reader=null; try { reader=new
		 * FileReader("credentials.properties"); } catch (FileNotFoundException e) { //
		 * TODO: handle exception e.printStackTrace(); }
		 */
		
		Properties  property=new Properties();
		
		try {
			property.load(getClass().getResourceAsStream("/credentials.properties"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * try { property.load(getClass.); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
	Constants.url=property.getProperty("url");
	Constants.browser=property.getProperty("browser");
	Constants.ChromeDriverLocation=property.getProperty("ChromeDriverLocation");	
	Constants.FirefoxDriverLocation=property.getProperty("FirefoxDriverLocation");	
	Constants.product1= property.getProperty("product1");
	Constants.product2= property.getProperty("product2");
	Constants.product3= property.getProperty("product3");
	Constants.size=property.getProperty("1");
	Constants.size2=property.getProperty("3");
	Constants.color1=property.getProperty("green");
	Constants.color1=property.getProperty("yellow");
	Constants.quantity2=property.getProperty("quantity2");
	Constants.email=property.getProperty("email");
	Constants.firstname=property.getProperty("firstname");
	Constants.lastname=property.getProperty("lastname");
	Constants.address1=property.getProperty("address1");
	Constants.address2=property.getProperty("address2");
	Constants.city=property.getProperty("city");
	Constants.high=property.getProperty("high");
	
	
}
	
	public void initiWebElements() {
		PageFactory.initElements(DriverManager.getDriver(),Shopping.class);
	}
	
	
	
}