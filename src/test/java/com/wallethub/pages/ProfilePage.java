package com.wallethub.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage{
    @FindBy (xpath = "//h2[@class='pr-rec-subtitle']")
    private WebElement reviewFeedText;

    public String getReviewFeedText(){
        return reviewFeedText.getText();
    }

}
