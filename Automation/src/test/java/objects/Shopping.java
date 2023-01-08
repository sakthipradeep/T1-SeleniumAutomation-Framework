package objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shopping {

	@FindBy(xpath="//input[@id='search']")
	public static WebElement searchbar;

	@FindBy(xpath ="//button[@class='action search']")
	public static WebElement maginfier;

	//gwyn endurance tee medium green:

	@FindBy(xpath="//Strong[@class='product name product-item-name']/child::a")
	public static WebElement selectproductone;

	@FindBy(xpath="//div[text()='M']")
	public static WebElement sizeone;

	@FindBy(xpath="//div[text()='M']/following::div[6]")
	public static WebElement colorone;

	@FindBy(xpath ="//span[text()='Add to Cart']")
	public static WebElement addtocart;

	//mycart

	@FindBy(linkText ="shopping cart")
	public static WebElement checkcarttotal;

	//edit quantity
	@FindBy(xpath   ="//a[@class='action action-edit']")
	public static WebElement edit;

	//update quantity
	@FindBy(xpath ="//input[@name='qty']")
	public static WebElement adquantity;

	@FindBy(xpath="//button[@class='action primary tocart']")
	public static WebElement updatecart;
	//-----------------------------------------------



	@FindBy(linkText ="Quest Lumaflex™ Band")
	public static WebElement selectproductTwo;


	@FindBy(id="option-label-size-143-item-167")
	public static WebElement sizeTwo;

	@FindBy(id="option-label-color-93-item-60")
	public static WebElement colorTwo;



	@FindBy(linkText ="Quest Lumaflex™ Band ")
	public static WebElement selectproductThree;

	@FindBy(xpath ="//strong[text()='Order Total']/following::span")
	public static WebElement Checkcart;

	//proceesed to checkout:
	@FindBy(xpath = "//button[@class='action primary checkout']/child::span")
	public static WebElement checkout;
	// My cart
	@FindBy(xpath="//span[text()='My Cart']")
	public static WebElement Mycart;

	@FindBy(xpath="//*[@id=\"cart-totals\"]/div/table/tbody/tr[3]/td/strong/span")
	public static WebElement getText;

	//proceesed to checkout:
	@FindBy(xpath = "//span[text()='Proceed to Checkout']")
	public static WebElement proceesedtocheckout;

	//email
	@FindBy(xpath ="//div[@class='control _with-tooltip']/child::input")
	public static WebElement email;

	//fname
	@FindBy(name ="firstname" )
	public static WebElement fname;

	//lname
	@FindBy(name ="lastname" )
	public static WebElement lname;

	//street
	@FindBy(name ="street[0]" )
	public static WebElement street0;

	@FindBy(name ="street[1]" )
	public static WebElement street1;

	@FindBy(name ="street[2]" )
	public static WebElement street2;

	//city
	@FindBy(name ="city" )
	public static WebElement city;


	//state
	@FindBy(xpath  = "//select[@class='select']")
	public static WebElement state;

	//postalcode
	@FindBy(xpath = "//input[@name='postcode']")
	public static WebElement post;

	//country
	@FindBy(xpath ="//input[@class='input-text']/following::select[2]")
	public static WebElement country;

	//phonenumber
	@FindBy(xpath="//input[@name='telephone']")
	public static WebElement phonenumber;

	// radi0 button selct fixed
	@FindBy(xpath="//td[text()='Fixed']")
	public static WebElement radio;

	// next button
	@FindBy(xpath = "//*[@name='city']/following::button[1]")
	public static WebElement button;
	
	@FindBy(xpath="//*[@id=\"opc-sidebar\"]/div[1]/table/tbody/tr[3]/td/strong/span")
	public static WebElement GrandTotal;

	@FindBy(xpath="//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button/span")
	public static WebElement PlaceOrder;
}
