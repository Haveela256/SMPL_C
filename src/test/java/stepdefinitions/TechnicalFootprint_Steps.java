package stepdefinitions;

import com.vassarlabs.projectname.page.TechnicalFootprint_page;
import com.driver.WebdriverInitializer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TechnicalFootprint_Steps {
    TechnicalFootprint_page technicalFootprintPage = new TechnicalFootprint_page(WebdriverInitializer.getDriver());

    @When("Click on the Technical Footprint module")
    public void click_on_the_technical_footprint_module() throws InterruptedException {
        technicalFootprintPage.clickOnmodule();
    }

    @When("Click on the panels, checkboxes and Click on the other textfield and enter data {string} {string} {string} {string} {string} {string} {string}  {string} {string} {string}  {string}  {string} {string} and verify {string}")
    public void click_on_the_panels_checkboxes_and_click_on_the_other_textfield_and_enter_data_and_verify(String FirstQstn, String SecondQstnNoOfUsers, String ThirdQstnTypeOfCUI, String FourthQstn, String FifthQstnPurposeOfSystem, String SixthQstn, String SeventhQstn, String EighthQstn, String NinethQstn, String TenthQstn, String EleventhQstn, String TwelthQstn, String TextfieldData, String ToasterMessage) throws InterruptedException {
        technicalFootprintPage.answertheQuestions(FirstQstn, SecondQstnNoOfUsers, ThirdQstnTypeOfCUI, FourthQstn, FifthQstnPurposeOfSystem, SixthQstn, SeventhQstn, EighthQstn, NinethQstn, TenthQstn, EleventhQstn, TwelthQstn, TextfieldData, ToasterMessage);
    }

    @When("Click on the cancel button")
    public void click_on_the_cancel_button() throws InterruptedException {
        technicalFootprintPage.cancelbutton();
    }

    @Then("Click on the Submit button {string} {string} {string} {string} {string} {string} {string}  {string} {string} {string}  {string}  {string} {string} and verify {string}")
    public void click_on_the_submit_button_and_verify(String FirstQstn, String SecondQstnNoOfUsers, String ThirdQstnTypeOfCUI, String FourthQstn, String FifthQstnPurposeOfSystem, String SixthQstn, String SeventhQstn, String EighthQstn, String NinethQstn, String TenthQstn, String EleventhQstn, String TwelthQstn, String TextfieldData, String ToasterMessage) throws InterruptedException {
        technicalFootprintPage.submitButton(FirstQstn, SecondQstnNoOfUsers, ThirdQstnTypeOfCUI, FourthQstn, FifthQstnPurposeOfSystem, SixthQstn, SeventhQstn, EighthQstn, NinethQstn, TenthQstn, EleventhQstn, TwelthQstn, TextfieldData, ToasterMessage);
    }



}
