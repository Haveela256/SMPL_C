package stepdefinitions;

import com.vassarlabs.projectname.page.CompanyDetails_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.driver.WebdriverInitializer;

public class Company_Details_Steps {
    CompanyDetails_page companyDetailsPage=new CompanyDetails_page(WebdriverInitializer.getDriver());
    @When("Click on the Edit button")
    public void click_on_the_edit_button() throws InterruptedException {
        companyDetailsPage.editButton();
    }

    @When("Add the following company details {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void add_the_following_company_details(String CompanyName, String FEINno, String URL, String DUNSno, String Phone, String Address1, String Address2, String ZipCode, String City) throws InterruptedException {
        companyDetailsPage.addDetails( CompanyName,  FEINno,  URL,  DUNSno,  Phone,  Address1,  Address2,  ZipCode,  City);
    }


    @When("Validate the cancel button")
    public void validate_the_cancel_button() throws InterruptedException {
        companyDetailsPage.cancelButton();
    }



    @And("click on the replace icon and add profile {string} {string}")
    public void clickOnTheReplaceIconAndAddProfile(String File, String ReplaceFile) throws InterruptedException {
        companyDetailsPage. replaceProfile(File, ReplaceFile);
    }







    @Then("Validate the submit button and verify {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void validateTheSubmitButtonAndVerify(String CompanyName,String FEINno, String URL, String DUNSno,String Phone,String AddressOne,String AddressTwo,String ZipCode,String City, String CompanyDetailsUpdatedToaster, String ErrorMessage,String ReplaceFile, String File) throws InterruptedException {
        companyDetailsPage.submitbutton(CompanyName,  FEINno,  URL,  DUNSno,  Phone,  AddressOne,  AddressTwo,  ZipCode,  City, CompanyDetailsUpdatedToaster, ErrorMessage,ReplaceFile,File);
    }

    @And("Upload Profile and verify Crop popup {} {}")
    public void uploadProfileAndVerifyCropPopup(String File,String ReplaceFile) throws InterruptedException {
        companyDetailsPage.profile(File,ReplaceFile);
    }
}
