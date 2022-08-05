package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FrontPageStepDefination {

	WebDriver driver;
	
	
@Given("^User is already on login page$")
public void user_is_already_on_login_page()  {
 
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\hp\\\\OneDrive\\\\Desktop\\\\se3\\\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://ui.cogmento.com/");
	
}

@When("^title of login page is Cogmento CRM$")
public void title_of_login_page_is_Cogmento_CRM() {
	
	String titleLoginPage=driver.getTitle();
	Assert.assertEquals("Cogmento CRM", titleLoginPage);
	
}

@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enters_username_and_password(String uName,String pwd) {
    
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.name("email")).clear();
	driver.findElement(By.name("password")).clear();
	driver.findElement(By.name("email")).sendKeys(uName);
	driver.findElement(By.name("password")).sendKeys(pwd);
	
}

@Then("^User clicks on Login$")
public void user_clicks_on_Login() {

	driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[3]")).click();
}

@Then("^Close the browser$")
public void close_the_browser() throws InterruptedException {
	
	Thread.sleep(5000);
	driver.close();

}


	
		


			

	
}