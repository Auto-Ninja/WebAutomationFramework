package webapp.auth;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class loginpageStepdefs {
    @Given("User is on HRMLogin page {string}")
    public void loginTest(String url) {
    }

    @When("User enters username as {string} and password as {string}")
    public void goToHomePage(String userName, String passWord) {
    }

    @Then("User should be able to login successfully and new page open")
    public void verifyLogin() {
    }

    @Then("User should be able to see error message {string}")
    public void verifyErrorMessage(String expectedErrorMessage) {
    }
}
