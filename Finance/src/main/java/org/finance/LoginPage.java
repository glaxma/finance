package org.finance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Initialize @FindBy
    }


    @FindBy(linkText = "A/B Testing")
    WebElement abTestingLink;

    public void clickABTesting() {
        abTestingLink.click();
    }

}
