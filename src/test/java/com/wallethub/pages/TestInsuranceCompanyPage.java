package com.wallethub.pages;

import com.wallethub.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TestInsuranceCompanyPage extends BasePage {
    @FindBy(css = "div[class='dropdown second']")
    private WebElement selectDropdown;
    @FindBy(css = "textarea[placeholder='Write your review...']")
    private WebElement reviewBox;
    @FindBy(xpath = "//div[normalize-space()='Submit']")
    private WebElement submitButton;

    @FindBy(className = "rvtab-ci-content.with-links.text-select[data-pos='0']")
    private WebElement reviewText;

    @FindBy(xpath = "//li[@id='opt-64459569a9c40-1']")
    private WebElement healthInsuranceSelect;

    public void selectInDropdown() throws InterruptedException {

        selectDropdown.click();
       BrowserUtils.waitForClickability(healthInsuranceSelect,5);
       healthInsuranceSelect.click();

        // It could not work because there is no "select" tag in the website page.
        //        BrowserUtils.selectTextInDropdown(selectDropdown, text);
    }

    public void enterReview(String reviewText) {
        reviewBox.sendKeys(reviewText);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public String getReviewText() {
        return reviewText.getText();
    }

}
