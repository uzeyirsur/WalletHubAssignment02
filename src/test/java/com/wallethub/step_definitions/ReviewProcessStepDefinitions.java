package com.wallethub.step_definitions;

import com.wallethub.utilities.BrowserUtils;
import com.wallethub.utilities.ConfigurationReader;
import com.wallethub.utilities.Driver;
import com.wallethub.utilities.WordReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.IOException;

public class ReviewProcessStepDefinitions extends BaseStep {
    WordReader wordReader = new WordReader("C:\\Users\\omers\\workspace\\WalletHubAssignment01\\src\\test\\resources\\testData\\SomeReview.docx");

    @Given("the user is on the WalletHub Test Insurance Company page")
    public void the_user_is_on_the_WalletHub_Test_Insurance_Company_page() {
        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);
        System.out.println("Open:: " + URL);


    }

    @When("the user hovers over the fourth star in the reviews section")
    public void the_user_hovers_over_the_fourth_star_in_the_reviews_section() {
        pages.homePage().hoverMouseOverTheNthStar(4);
    }


    @Then("the {int} stars get lit up when the user hover over them")
    public void the_stars_get_lit_up_when_the_user_hover_over_them(int selectedStar) {

        int numberOfLitUpStar = pages.homePage().getLitUpStarCount();
        Assert.assertEquals(numberOfLitUpStar, selectedStar);
    }


    @When("the user clicks on the fourth star")
    public void the_user_clicks_on_the_fourth_star() {

        pages.homePage().clickTheNthStar(4);

    }


    @When("the user selects {string} from the Policy dropdown")
    public void the_user_selects_from_the_Policy_dropdown(String policy) throws InterruptedException {
        pages.testInsuranceCompanyPage().selectInDropdown();
    }


    @Given("the user enters a {string} with a minimum of 200 characters in write your review box")
    public void the_user_enters_a_random_text_with_a_minimum_of_characters_in_write_your_review_box(String randomText) throws IOException {

        String review = wordReader.readText();
        pages.testInsuranceCompanyPage().enterReview(review);

    }


    @When("the user submits the review")
    public void the_user_submits_the_review() {
        pages.testInsuranceCompanyPage().clickSubmitButton();
    }


    @Then("the user should see a confirmation screen with the message {string}")
    public void the_user_should_see_a_confirmation_screen_with_the_message(String message) {
        String reviewPostedMessage = pages.verifyActPage().getReviewPostedMessage();
        Assert.assertEquals(message, reviewPostedMessage);
    }


    @Then("the user should see a confirmation screen with the message {string} in their profile page")
    public void the_user_should_see_a_confirmation_screen_with_the_message_in_their_profile_page(String reviewFeed) {
        String reviewFeedText = pages.profilePage().getReviewFeedText();
        Assert.assertEquals(reviewFeed, reviewFeedText);
    }


    @Then("the user navigates to Test Insurance Company Page")
    public void the_user_navigates_to_Test_Insurance_Company_Page() {
        String testInsuranceCompanyPage = ConfigurationReader.getProperty("testInsuranceCompanyPageURl");
        Driver.getDriver().get(testInsuranceCompanyPage);
    }


    @Then("the user should see the review in Test Insurance Company Page")
    public void the_user_should_see_the_review_in_Test_Insurance_Company_Page() throws IOException {
        String reviewTextInWebPage = pages.testInsuranceCompanyPage().getReviewText();
        String reviewInData = wordReader.readText();

        Assert.assertTrue(reviewInData.contains(reviewTextInWebPage));

    }
}
