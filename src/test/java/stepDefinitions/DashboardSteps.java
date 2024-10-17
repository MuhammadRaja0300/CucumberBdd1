package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pagefactory.DashboardPage;
import pagefactory.LoginPage_PF;

public class DashboardSteps {
	WebDriver driver = null;
	LoginPage_PF loginPage;
	DashboardPage dashboard;
	
	@Before
	public void setup() {
		System.getProperty("webdriver.chrome.driver" , "/Users/muhammad/eclipse-workspace/CucumberTest/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		loginPage = new LoginPage_PF(driver);
		dashboard = new DashboardPage(driver);
		
	}
	
	@After
	public void kill() {
		driver.close();
		driver.quit();
	}
	@Given("perform valid login")
	public void perform_valid_login() throws InterruptedException {
		driver.get("https://web.metricapp.co/login");
		loginPage.enterEmal("riyeye2030@tanlanav.com");
		loginPage.enterPassword("112233");
		loginPage.clickLogin();
		Thread.sleep(2000);
	}
	

	
	
	
	@Given("verify that add transaction button is visible")
	public void verify_that_add_transaction_button_is_visible() throws InterruptedException {
		Thread.sleep(20000);
		dashboard.checkAddTransactionButtonVisibility();
	}
	
	@Then("click on add transaction button")
	public void click_on_add_transaction_button() throws InterruptedException {
		Thread.sleep(20000);
		dashboard.clickAddTransaction();
	}
	
	@And("verify that addincome is visible")
	public void verify_that_addincome_is_visible() {
		dashboard.checkAddIncomeIsVisible();
	}
	
	@Then("click at add income button")
	public void click_at_add_income_button() {
		dashboard.clickAddIncomeBtn();
	}

}
