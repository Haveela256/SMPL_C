package stepdefinitions;

import com.vassarlabs.projectname.page.TestYopm_page;
import io.cucumber.java.en.When;
import com.driver.WebdriverInitializer;

public class TestYop_Steps {
    TestYopm_page testYopmPage=new TestYopm_page(WebdriverInitializer.getDriver());
    @When("click on the Yopmail account")
    public void click_on_the_yopmail_account() throws InterruptedException {
        testYopmPage.emaiL();
    }



}
