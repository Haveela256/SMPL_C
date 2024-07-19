package stepdefinitions;

import com.vassarlabs.projectname.page.SA_ControlCenter_page;
import io.cucumber.java.en.And;
import com.driver.WebdriverInitializer;

public class SA_ControlCenter_Steps {
    SA_ControlCenter_page saControlCenterPage=new SA_ControlCenter_page(WebdriverInitializer.getDriver());
    @And("Validate homepage and lightBulb of super admin")
    public void validateHomepageAndLightBulbOfSuperAdmin() throws InterruptedException {
        saControlCenterPage.home();
    }
}
