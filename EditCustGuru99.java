package guru99BankTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditCustGuru99 {
	
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
	
	public void verifyLoginToGuru99() {
		
		WebElement userId = driver.findElement(By.name("uid"));
		WebElement userPassword = driver.findElement(By.name("password"));
		WebElement loginButton = driver.findElement(By.name("btnLogin"));
		
		//User ID and Password only lasts for 20 days after generation
		userId.sendKeys("mngr136913");
		userPassword.sendKeys("Omn@12");
		loginButton.click();
		

	}
	
	@Test(priority = 03) 
	public void EditCust() throws InterruptedException{

		WebElement editCustomerLink = driver.findElement(By.linkText("Edit Customer"));
				
		editCustomerLink.click();
		
		//provide Customer ID
		driver.findElement(By.name("cusid")).sendKeys("20860");
		
		driver.findElement(By.name("AccSubmit")).click();
		
		
		driver.findElement(By.name("city")).clear();
		
		//update City
		driver.findElement(By.name("city")).sendKeys("Dasma");
		
		driver.findElement(By.name("sub")).click();	
		
		driver.switchTo().alert().accept();
		
	
	}
	
	@Test(priority = 04) 
	
	public void CloseBrowser(){
				
		System.out.println("Customer edited");
		driver.quit();	
	}	

}
