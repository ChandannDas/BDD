package bddframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cucumber {
	WebDriver driver=new ChromeDriver();
	@Given("^Open Application$")
	public void open_application() {
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	    System.out.println("open appplication");
	}

	@When("^Verify Title$")
	public void verify_title() {
	   if(driver.getTitle().equals("OrangeHrm")) {
		   System.out.println("verif title successful");
	   }else {
		   System.out.println("not succesful");
	   }
		 
	}

	@And("^Login with username and password$")
	public void Loginapplication() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//aside[@class='oxd-sidepanel']/nav/div/div/following::ul/li[1]/a")).click();
		System.out.println("login appplication");
	}
	
	@Then("Close Application")
	public void close_application() throws InterruptedException {
		Thread.sleep(3000);
	    driver.quit();
		 System.out.println("close appplication");
	}
}
