package stepdefinitions;

import com.vassarlabs.projectname.page.CE_MyProfile_page;
import com.driver.WebdriverInitializer;
import io.cucumber.java.en.And;

public class CE_MyProfile_Steps {
    CE_MyProfile_page ceMyProfilePage=new CE_MyProfile_page(WebdriverInitializer.getDriver());
    @And("Add the profile details or edit {string} {string} {string} {string} {string} of Compliance expert")
    public void addTheProfileDetailsOrEditOfComplianceExpert(String FirstName, String MiddleName, String LastName, String UploadResume, String EmailAddress) throws InterruptedException {
        ceMyProfilePage.details(FirstName, MiddleName, LastName, UploadResume,EmailAddress);
    }
}
