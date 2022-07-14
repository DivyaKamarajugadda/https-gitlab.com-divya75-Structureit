package automationpractice1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationtest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Divya Kamarajugadda\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  String URL="http://automationpractice.com/index.php";

		  driver.get(URL);
		  driver.manage().window().maximize();
		  //Click on Sign in
		  public static webElement sign in(WebDriver driver) {
		  driver.findElement(By.linkText("Sign in")).click();
		return element;
		  }
		  
		  //Enter email address
		  public static webElement email address(WebDriver driver) {
		  driver.findElement(By.cssSelector("[name='email_create']")).sendKeys("test1249@test.com");
		  return element;
		  }
		  //Click on "Create an account"
		  public static webElement create account(WebDriver driver) {
		  driver.findElement(By.xpath("//button[@name=\"SubmitCreate\"]")).click();
		  }
		  
		  //Select Title
		  driver.findElement(By.xpath("//input[@id=\"id_gender1\"]")).click();
		  driver.findElement(By.name("customer_firstname")).sendKeys("Test User");
		  driver.findElement(By.name("customer_lastname")).sendKeys("Vsoft");
		  public static webElement password(WebDriver driver) {
		  driver.findElement(By.id("passwd")).sendKeys("PKR@PKR");
		  
		  // Enter your address
		  driver.findElement(By.id("firstname")).sendKeys("Test User");
		  driver.findElement(By.id("lastname")).sendKeys("Vsoft");
		  driver.findElement(By.id("company")).sendKeys("Vsoft");
		  driver.findElement(By.id("address1")).sendKeys("Test 81/1,2nd cross");
		  driver.findElement(By.id("city")).sendKeys("XYZ");
		  
		  // Select State
		  WebElement statedropdown=driver.findElement(By.name("id_state"));
		  Select oSelect=new Select(statedropdown);
		  oSelect.selectByValue("4");

		  driver.findElement(By.name("postcode")).sendKeys("51838");
		  
		  // Select Country
		  WebElement countrydropDown=driver.findElement(By.name("id_country"));
		  oSelectC.selectByVisibleText("China");
		  
		  //Enter Mobile Number
		  driver.findElement(By.id("phone_mobile")).sendKeys("234567897");
		  driver.findElement(By.xpath("//input[@name=\"alias\"]")).clear();
		  driver.findElement(By.xpath("//input[@name=\"alias\"]")).sendKeys("Office");
		  driver.findElement(By.name("submitAccount")).click();
		  String userText=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).getText();

		  // Validate that user has created
		  if(userText.contains("Vsoft")) {
		   System.out.println("User Verified,Test case Passed");
		  }
		  else {
		   System.out.println("User Verification Failed,Test case Failed");
	}

}
}
