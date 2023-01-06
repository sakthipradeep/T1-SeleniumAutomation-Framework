package steps;


import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import constatnts.Constants;
import driver.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import objects.Shopping;


public class Shop {
	@Given("Open url")
	public void open_url() {
		 DriverManager.getDriver().get(Constants.url);

	}

	@When("Enter products")
	public void enter_product_one() {
		// PRODUCT 1

		Shopping.searchbar.sendKeys(Constants.product1);
		//new Actions(DriverManager.getDriver()).click();
	Shopping.maginfier.click();
		Shopping.selectproductone.click();
	DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		Shopping.sizeone.click();
		Shopping.colorone.click();
		Shopping.addtocart.click();
		System.out.println("checking cart total");
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(03));

		Shopping.checkcarttotal.click();
		Shopping.edit.click();

		Shopping.adquantity.clear();
		Shopping.adquantity.sendKeys(Constants.quantity2);
		Shopping.updatecart.click();
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(04));
        // PRODUCT 2
		Shopping.searchbar.sendKeys(Constants.product2);
		Shopping.maginfier.click();
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(04));

		Shopping.selectproductone.click();
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(04));

		Shopping.sizeTwo.click();
		Shopping.colorTwo.click();

		Shopping.addtocart.click();
		System.out.println("product 2 added to cart");
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(03));
         
		// PRODUCT 3
		Shopping.searchbar.sendKeys(Constants.product3);
		Shopping.maginfier.click();
		Shopping.selectproductTwo.click();
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		Shopping.addtocart.click();
		Shopping.checkcarttotal.click();

		
		System.out.println("product 3 added to cart");
		////////////////////////////////////////////////
		Shopping.proceesedtocheckout.click();

		//Shopping.checkcarttotal.click();
		/*
		 * DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.
		 * ofSeconds(5)); String total = Shopping.getText.getText();
		 * System.out.println(total);
		 */		//Shopping.proceesedtocheckout.click();
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Shopping.email.sendKeys(Constants.email);
		Shopping.fname.sendKeys(Constants.firstname);
		Shopping.lname.sendKeys(Constants.lastname);
		Shopping.street0.sendKeys(Constants.address1);
		Shopping.street1.sendKeys(Constants.address2);
		Shopping.city.sendKeys(Constants.city);
		
		Select state=new Select(Shopping.state);
		state.selectByIndex(15);

		Select ss=new Select(Shopping.country);
		ss.selectByIndex(15);

		Shopping.postalcode.sendKeys(Constants.postalcode);

		Shopping.phonenumber.sendKeys(Constants.phonenumber);
		
		Shopping.radio.click();


	}



	@When("Processed to check")
	public void processed_to_check() {

	}

	@When("Enter Credentials")
	public void enter_credentials() {
	
	}

	@When("Click next")
	public void click_next() {
		Shopping.button.click();
	}

}
