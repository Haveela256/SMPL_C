//package stepdefinitions;
//
//import com.vassarlabs.projectname.page.AssetInventory_page;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.When;
//import com.driver.WebdriverInitializer;
//
//public class AssetInventory_steps {
//    AssetInventory_page assetInventoryPage=new AssetInventory_page(WebdriverInitializer.getDriver());
//    @When("Click on the Asset Inventory tab")
//    public void click_on_the_asset_inventory_tab() {
//       assetInventoryPage.assetInventoryTab();
//    }
//
//    @And("Verify Asset Inventory bar chart")
//    public void verifyAssetInventoryBarChart() {
//        assetInventoryPage.barChart();
//    }
//
//    @And("Verify Asset Inventory pie chart")
//    public void verifyAssetInventoryPieChart() {
//        assetInventoryPage.pieChart();
//    }
//
//
//    @And("Validate the Pagination {string} {string} {string}")
//    public void validateThePagination(String arg0, String arg1, String arg2) {
//    }
//}
