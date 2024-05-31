package stepdefinitions;

import com.vassarlabs.projectname.driver.WebdriverInitializer;
import com.vassarlabs.projectname.page.SamplePage;
import io.cucumber.java.en.Given;

public class SampleSteps {

    SamplePage sp = new SamplePage(WebdriverInitializer.getDriver());


    @Given("this is a sample defintions {string}")
    public void this_is_a_sample_defintions(String name) throws InterruptedException {
        System.out.println("done");
        sp.test(name);
    }
}
