package guru99BankTest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddCustGuru99Bank {

	ChromeDriver driver;
	
	//Website to be accessed
	String url = "https://demo.guru99.com/v4";
	
	@Test(priority = 01)
	public void invokeBrowser() {
		
		//Update the chromedriver.exe path where it is stored in your machine
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
	}
	@Test(priority = 02)
	public void verifyTitleOfThePage() {
		
		String expectedTitle = "Guru99 Bank Home Page";
		
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	
	@Test(priority = 03)
	
	public void verifyLoginToGuru99() {
		
		WebElement userId = driver.findElement(By.name("uid"));
		WebElement userPassword = driver.findElement(By.name("password"));
		WebElement loginButton = driver.findElement(By.name("btnLogin"));
		
		//User ID and Password only lasts for 20 days after generation
		userId.sendKeys("mngr136913");
		userPassword.sendKeys("Omn@12");
		loginButton.click();
		

	}	
	
	@Test(priority = 04) 
	
	public void AddCust(){

		WebElement addCustomerLink = driver.findElement(By.linkText("New Customer"));
		//WebElement addCustomerLink = driver.findElement(By.xpath("//input[@href=\"addcustomerpage.php\"]"));	
				
		addCustomerLink.click();
		
		driver.findElement(By.xpath("//input[@value='f']")).click();
		
		//unique in every run
		driver.findElement(By.name("name")).sendKeys("Twelve Twelve");
		
		//unique in every run
		driver.findElement(By.name("dob")).sendKeys("06/12/1988");
		driver.findElement(By.name("addr")).sendKeys("Araw");
		driver.findElement(By.name("city")).sendKeys("Imus");
		driver.findElement(By.name("state")).sendKeys("Cavite");
		driver.findElement(By.name("pinno")).sendKeys("410300");
		driver.findElement(By.name("telephoneno")).sendKeys("9201234567");
		
		//unique in every run
		driver.findElement(By.name("emailid")).sendKeys("test12@test.com");
		driver.findElement(By.name("password")).sendKeys("pw@!49");
		driver.findElement(By.name("sub")).click();		
	
	}	
	
	@Test(priority = 05) 
	
	public void CloseBrowser(){
	
		String customerId = driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
		
		System.out.println("New Customer Created: " + customerId);
		driver.quit();	
	}
	
	
	
}
