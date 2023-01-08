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

	@When("Adding Gwyn Endurance Tee meduim green to cart")
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
		System.out.println("Gwyn Endurance Tee meduim green Added to cart Successfully");
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(03));
	}
	@When("Update quantity  Gwyn Endurance Tee meduim green to cart")
	public void updateQuantity() {
		Shopping.checkcarttotal.click();
		Shopping.edit.click();

		Shopping.adquantity.clear();
		Shopping.adquantity.sendKeys(Constants.quantity2);
		Shopping.updatecart.click();
		System.out.println("Gwyn Endurance Tee meduim green Quantity updated Successfully");

		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(04));
	}
	// PRODUCT 2
	@When("Adding Gwyn Endurance Tee meduim yellow to cart")
	public void product2() {
		Shopping.searchbar.sendKeys(Constants.product2);
		Shopping.maginfier.click();
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(04));

		Shopping.selectproductone.click();
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(04));

		Shopping.sizeTwo.click();
		Shopping.colorTwo.click();

		Shopping.addtocart.click();
		System.out.println("Gwyn Endurance Tee meduim yellow Added to cart Successfully");
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(03));
	}  
	// PRODUCT 3
	@When("Adding Quest Lumaflex band to cart")
	public void product3() {
		Shopping.searchbar.sendKeys(Constants.product3);
		Shopping.maginfier.click();
		Shopping.selectproductTwo.click();
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		Shopping.addtocart.click();
		System.out.println("Quest Lumaflex band  Added to cart Successfully");

		Shopping.checkcarttotal.click();


		//System.out.println("product 3 added to cart");
	}
	@When("Check total")
	public void checktotal() {
		String total = Shopping.getText.getText();
		//System.out.println(total);
		String high=new String(Constants.high);
		if(total.equals(high)) {
			Shopping.proceesedtocheckout.click();
			System.out.println("cart total amount is suitable");
		}
		else {
			System.out.println("cart total amount is high");
		}
	}
	//Shopping.checkcarttotal.click();
	/*
	 * DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.
	 * ofSeconds(5)); String total = Shopping.getText.getText();
	 * System.out.println(total);
	 */		//Shopping.proceesedtocheckout.click();
	@When("Enter Credentials")
	public void enterCredentials() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Shopping.email.sendKeys(Constants.email);
		Shopping.fname.sendKeys(Constants.firstname);
		Shopping.lname.sendKeys(Constants.lastname);
		Shopping.street0.sendKeys(Constants.address1);
		Shopping.street1.sendKeys(Constants.address2);
		Shopping.city.sendKeys(Constants.city);
		Select state=new Select(Shopping.state);
		state.selectByIndex(15);
		//DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Shopping.post.sendKeys("6456896");
		// Select ss=new Select(Shopping.country);
		//ss.selectByIndex(15);
		Shopping.phonenumber.sendKeys("662486259996");
		Shopping.radio.click();


	}
	@When("Click next")
	public void click_next() {
		Shopping.button.click();
		String GrandTotals = Shopping.GrandTotal.getText();
		System.out.println("grandtoatal include shipping charge :"+GrandTotals);
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		Shopping.PlaceOrder.click();
	}

}
