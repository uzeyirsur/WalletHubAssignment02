package com.wallethub.pages;

import com.wallethub.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    private static final String STAR_XPATH = "//review-star[@class='rvs-svg']//div[@class='rating-box-wrapper']//*[name()='svg']";
    @FindBy(xpath = STAR_XPATH + "[1]")
    private WebElement oneRatedStar;
    @FindBy(xpath = STAR_XPATH + "[2]")
    private WebElement twoRatedStar;
    @FindBy(xpath = STAR_XPATH + "[3]")
    WebElement threeRatedStar;
    @FindBy(xpath = STAR_XPATH + "[4]")
    private WebElement fourRatedStar;
    @FindBy(xpath = STAR_XPATH + "[5]")
    private WebElement fiveRatedStar;
    @FindBy (css = "review-star[class='rvs-svg'] div[class='rating-box-wrapper']")
    private WebElement stars;

    public void hoverMouseOverTheNthStar(int number) {

        switch (number) {
            case 1:
                BrowserUtils.hoverOverElement(oneRatedStar);
                break;
            case 2:
                BrowserUtils.hoverOverElement(twoRatedStar);
                break;
            case 3:
                BrowserUtils.hoverOverElement(threeRatedStar);
                break;
            case 4:
                BrowserUtils.hoverOverElement(fourRatedStar);
                break;
            case 5:
                BrowserUtils.hoverOverElement(fiveRatedStar);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }

    }

    public void clickTheNthStar(int number) {
BrowserUtils.waitForClickability(stars,5);
        switch (number) {
            case 1:
                oneRatedStar.click();
                break;
            case 2:
                twoRatedStar.click();
                break;
            case 3:
                threeRatedStar.click();
                break;
            case 4:
                fourRatedStar.click();
                break;
            case 5:
                fiveRatedStar.click();
                break;

        }
    }

    public int getLitUpStarCount() {
        if (oneRatedStar.getAttribute("aria-checked").contains("true")) {
            return 1;
        } else if (twoRatedStar.getAttribute("aria-checked").contains("true")) {
            return 2;
        } else if (threeRatedStar.getAttribute("aria-checked").contains("true")) {
            return 3;
        } else if (fourRatedStar.getAttribute("aria-checked").contains("true")) {
            return 4;
        } else if (fiveRatedStar.getAttribute("aria-checked").contains("true")) {
            return 5;
        }
        return 0;
    }

}
