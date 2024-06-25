package stepdefinitions;


import com.vassarlabs.projectname.page.ScopeDocument_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;



public class ScopeDocument_Steps {
    ScopeDocument_page scopeDocumentPage=new ScopeDocument_page(com.driver.WebdriverInitializer.getDriver());


    @When("Click on the Cancel button")
    public void click_on_the_cancel_button() throws InterruptedException {
       scopeDocumentPage.cancelbutton();
    }

    @And("Click on the Submit button by entering all fields and without entering all fields and verify {} {}{}")
    public void clickOnTheSubmitButtonByEnteringAllFieldsAndWithoutEnteringAllFieldsAndVerify(String FileUploadToaster, String ScopeDocFileName, String File) throws InterruptedException {
        scopeDocumentPage.submitbutton( FileUploadToaster, ScopeDocFileName, File);
    }

    @When("Click on Upload File button and enter the {string} {string}")
    public void click_on_upload_file_button_and_enter_the(String ScopeDocFileName , String File) throws InterruptedException {
        scopeDocumentPage.uploadFile(ScopeDocFileName, File);
    }



    @When("Verfiy the uploaded file {string} on table")
    public void verfiy_the_uploaded_file_on_table(String ScopeDocFileName) {
       scopeDocumentPage. verifyUploadedFile( ScopeDocFileName);
    }

    @When("Validate the Sort icon of Updated On , File Name column and Validate Download and Delete icons")
    public void validate_the_sort_icon_of_updated_on_file_name_column_and_validate_download_and_delete_icons() throws Throwable {
        scopeDocumentPage.icons();
    }

    @When("verify delete popup")
    public void verify_delete_popup() throws InterruptedException {
        scopeDocumentPage.deletePopup();
    }

    @When("Validate the delete functionality {string}")
    public void validate_the_delete_functionality(String DeletedFileToaster) throws InterruptedException {
scopeDocumentPage.deletedFile( DeletedFileToaster);
    }



    @Given("Click on Select Year dropdown by Selecting Year")
    public void click_on_select_year_dropdown_by_selecting_year() throws InterruptedException {
scopeDocumentPage.selectYear();
    }


    @When("Click on the discovery  module")
    public void clickOnTheDiscoveryModule() {
        scopeDocumentPage.discoveryModule();
    }

    @When("Validate the Pagination {string} {string} {string}")
    public void validateThePagination(String ScopeDocFileName, String uploadCount, String File) throws InterruptedException {
        scopeDocumentPage.pagination( ScopeDocFileName, uploadCount, File);
    }


}
