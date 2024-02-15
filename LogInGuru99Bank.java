package guru99BankTest;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class LogInGuru99Bank {
	
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
		
		System.out.println("Login Successful");
		driver.quit();
	}	

}
