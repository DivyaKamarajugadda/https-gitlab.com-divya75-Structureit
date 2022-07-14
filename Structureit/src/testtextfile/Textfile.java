package testtextfile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Divya Kamarajugadda\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  String URL="http://automationpractice.com/index.php";

		  driver.get(URL);
		  driver.manage().window().maximize();
		  
		  
		  
		  // FILE UPLOADING USING SENDKEYS ....
		  
		   WebElement browse = d.findElement(By.xpath("//input[@id='file-upload']"));
		   //click on ‘Choose file’ to upload the desired file
		   browse.sendKeys("C:\\Users\\Divya Kamarajugadda\\Desktop\\women"); //Uploading the file using sendKeys
		   System.out.println("File is Uploaded Successfully");
		 
	}

}
