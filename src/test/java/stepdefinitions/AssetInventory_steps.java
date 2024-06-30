package stepdefinitions;

import com.vassarlabs.projectname.page.AssetInventory_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import com.driver.WebdriverInitializer;

public class AssetInventory_steps {
    AssetInventory_page assetInventoryPage=new AssetInventory_page(WebdriverInitializer.getDriver());
    @When("Click on the Asset Inventory tab")
    public void click_on_the_asset_inventory_tab() {
       assetInventoryPage.assetInventoryTab();
    }

    @And("Verify Asset Inventory bar chart")
    public void verifyAssetInventoryBarChart() throws InterruptedException {
        assetInventoryPage.barChart();
    }

    @And("Verify Asset Inventory pie chart")
    public void verifyAssetInventoryPieChart() throws InterruptedException {
        assetInventoryPage.pieChart();
    }




}
