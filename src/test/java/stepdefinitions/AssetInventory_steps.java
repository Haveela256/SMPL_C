package stepdefinitions;

import com.vassarlabs.projectname.page.AssetInventory_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import com.driver.WebdriverInitializer;

public class AssetInventory_Steps {
    AssetInventory_page assetInventoryPage=new AssetInventory_page(WebdriverInitializer.getDriver());
    @When("Click on the discovery  module Asset Inventory tab")
    public void click_on_the_discovery_module_asset_inventory_tab() throws InterruptedException {
    assetInventoryPage.assetTab();
    }

    @When("Click on Upload File button and enter the {string} {string} of asset inventory tab")
    public void click_on_upload_file_button_and_enter_the_of_asset_inventory_tab(String AssetFileName, String File) throws InterruptedException {
     assetInventoryPage.uploadFile(AssetFileName,File);
    }

    @When("Click on the Cancel button of asset inventory of asset inventory tab")
    public void click_on_the_cancel_button_of_asset_inventory_of_asset_inventory_tab() throws InterruptedException {
 assetInventoryPage.cancelButton();
    }

    @When("Click on the Submit button by entering all fields and without entering all fields and verify {string} {string} {string} of asset inventory tab")
    public void click_on_the_submit_button_by_entering_all_fields_and_without_entering_all_fields_and_verify_of_asset_inventory_tab(String FileUploadToaster, String AssetFileName, String File) throws InterruptedException {
assetInventoryPage.submit(FileUploadToaster, AssetFileName, File);
    }

    @When("Verfiy the uploaded file {string} on table of asset inventory tab")
    public void verfiy_the_uploaded_file_on_table_of_asset_inventory_tab(String AssetFileName) {
assetInventoryPage.VerifyFile(AssetFileName);
    }

    @Given("Click on Select Year dropdown by Selecting Year of asset inventory tab")
    public void click_on_select_year_dropdown_by_selecting_year_of_asset_inventory_tab() throws InterruptedException {
assetInventoryPage.yeardropdown();
    }

    @Given("Validate the Sort icon of Updated On , File Name column and Validate Download and Delete icons of asset inventory tab")
    public void validate_the_sort_icon_of_updated_on_file_name_column_and_validate_download_and_delete_icons_of_asset_inventory_tab() throws InterruptedException {
assetInventoryPage.sorticons();
    }
    @And("Validate the bar chart")
    public void validateTheBarChart() throws InterruptedException {
assetInventoryPage.barchart();
    }

    @And("Validate the pie chart")
    public void validateThePieChart() throws InterruptedException {
assetInventoryPage.piechart();
    }
    @Given("verify delete popup {string} of asset inventory tab")
    public void verify_delete_popup_of_asset_inventory_tab(String AssetFileName) throws InterruptedException {
assetInventoryPage.delete(AssetFileName);
    }

    @Given("Validate the delete functionality {string} {string} of asset inventory tab")
    public void validate_the_delete_functionality_of_asset_inventory_tab(String DeletedFileToaster, String AssetFileName) throws InterruptedException {
assetInventoryPage.deletToaster(DeletedFileToaster,AssetFileName);
    }

    @And("validate the Pagination {string} {string} {string}")
    public void validateThePagination(String AssetFileName, String uploadCount, String File) throws InterruptedException {
        assetInventoryPage.pagination(AssetFileName,uploadCount,File);
    }






}
