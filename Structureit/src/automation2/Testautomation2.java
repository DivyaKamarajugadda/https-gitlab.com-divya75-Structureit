package automation2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testautomation2 {

	public static void main(String[] args)

		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Divya Kamarajugadda\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  String URL="http://automationpractice.com/index.php";

		  driver.get(URL);
		  driver.manage().window().maximize();
		
		 page_objects_automationtest.email address(driver).sendKeys("test1249@test.com");
		 page_objects_automationtest.password(driver).sendKeys("PKR@PKR");
		 page_objects_automationtest.sign in(driver).click();
		 driver.findElement(By.id("SubmitLogin")).click();
		  //Click on Women
		  driver.findElement(By.linkText("WOMEN")).click();

		  WebElement SecondImg=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[1]/div/a[1]/img"));
		  WebElement MoreBtn=driver.findElement(By.xpath("/html/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul/li[2]/div[1]/div[2]/div[2]/a[2]"));
		  Actions actions=new Actions(driver);
		  actions.moveToElement(SecondImg).moveToElement(MoreBtn).click().perform();

		  //Change quantity by 2
		  driver.findElement(By.id("quantity_wanted")).clear();
		  driver.findElement(By.id("quantity_wanted")).sendKeys("2");

		  //Select size as M
		  WebElement Sizedrpdwn=driver.findElement(By.xpath("//*[@id='group_1']"));
		  Select oSelect=new Select(Sizedrpdwn);
		  oSelect.selectByVisibleText("M");

		  //Select Color
		  driver.findElement(By.id("color_11")).click();

		  //Click on add to cart
		  driver.findElement(By.xpath("//p[@id='add_to_cart']//span[.='Add to cart']")).click();

		  //Click on proceed
		  driver.findElement(By.xpath("/html//div[@id='layer_cart']//a[@title='Proceed to checkout']/span")).click();
		  //Checkout page Proceed
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/p[2]/a[1]/span")).click();
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")).click();
		  //Agree terms&Conditions
		  driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/p/button/span")).click();

		  //Click on Payby Check
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a")).click();
		  //Confirm the order
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")).click();

		  //Get Text
		  String ConfirmationText=driver.findElement(By.xpath("//div[@id='center_column']/p[@class='alert alert-success']")).getText();
		  
		  // Verify that Product is ordered
		  if(ConfirmationText.contains("complete")) {
		   System.out.println("Order Completed: Test Case Passed");
		  }
		  else {
		   System.out.println("Order Not Successfull: Test Case Failed");
		  }

		
	
		
		}


	
	

}
