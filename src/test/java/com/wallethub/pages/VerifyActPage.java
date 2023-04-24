package com.wallethub.pages;

import com.wallethub.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyActPage extends BasePage{
    @FindBy (css = "div[class='rvc-header'] h4")
    private WebElement reviewPostedMessage;
@FindBy (css = "div[class='brgm-button brgm-user brgm-list-box'] span[class='brgm-list-title']")
private WebElement userNameButton;

@FindBy (xpath = "//a[@class='brgm-list-it'][normalize-space()='Profile']")
private WebElement profileButton;

    public String getReviewPostedMessage(){
        return reviewPostedMessage.getText();
    }
    public void hoverOverMouseToUserNameButton(){
        BrowserUtils.hoverOverElement(userNameButton);
    }
    public void clickProfileButton(){
        BrowserUtils.clickWithMouse(profileButton);
    }
}
