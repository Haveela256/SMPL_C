package stepdefinitions;

import com.vassarlabs.projectname.page.HireAnExpert_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import com.driver.WebdriverInitializer;

public class HireAnExpert_steps {
    HireAnExpert_Page hireAnExpertPage = new HireAnExpert_Page(WebdriverInitializer.getDriver());



    @Given("Login with Valid credentials {string} {string} {string}")
    public void loginWithValidCredentials(String username, String password, String pin) {
        hireAnExpertPage.loginWithValidCredential(username, password,  pin);
    }





    @When("Go to Hire Expert Module {string} {string} {string} {string} {string}")
    public void goToHireExpertModule(String search, String Subject, String body, String toaster, String ErrorMessage) throws InterruptedException {
        hireAnExpertPage.goToHireAnExpert( search, Subject, body,toaster,ErrorMessage);
    }
}

