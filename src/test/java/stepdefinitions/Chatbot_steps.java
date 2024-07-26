package stepdefinitions;

import com.vassarlabs.projectname.page.ChangePassword_page;
import com.vassarlabs.projectname.page.Chatbot_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import com.driver.WebdriverInitializer;

public class Chatbot_steps {
    Chatbot_page chatbotPage=new Chatbot_page(WebdriverInitializer.getDriver());

    @Given("Validate the GenAi chatbot")
    public void validate_the_gen_ai_chatbot() throws InterruptedException {
        chatbotPage.genAiChatbot();
    }

    @Given("validate the maximize icon")
    public void validate_the_maximize_icon() throws InterruptedException {
       chatbotPage.maximize();
    }

    @Given("validate mic icon")
    public void validate_mic_icon() throws InterruptedException {
        chatbotPage.mic();
    }

    @Given("validate collapse icon")
    public void validate_collapse_icon() {
       chatbotPage.collpase();
    }

    @And("validate textfield {string}")
    public void validateTextfield(String TextfieldData) {
        chatbotPage.textfield(TextfieldData);
    }

    @Given("validate send icon")
    public void validate_send_icon() {
       chatbotPage.send();
    }

    @Given("validate user profile button")
    public void validate_user_profile_button() {
        chatbotPage.userProfile();
    }

    @Given("validate manage users button")
    public void validate_manage_users_button() throws InterruptedException {
       chatbotPage.manageUser();
    }

    @Given("validate company details button")
    public void validate_company_details_button() {
        chatbotPage.companyDetails();
    }



}
