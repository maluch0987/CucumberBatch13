package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
   public static WebDriver driver;
    @Given("user is navigate to HRMS application")
    public void user_is_navigate_to_hrms_application() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @When("user enters valid admin username and password")
    public void user_enters_valid_admin_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user click on login button")
    public void user_click_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("admin user is successful logged in")
    public void admin_user_is_successful_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
