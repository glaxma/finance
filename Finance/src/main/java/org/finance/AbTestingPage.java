package org.finance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbTestingPage {
    private final WebDriver driver;

    public AbTestingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Initialize @FindBy
    }


    @FindBy(xpath = "//*[@id='content']/ul/li[1]/a")
    WebElement abTestingLink;


    @FindBy(xpath = "//*[@id='content']/div/h3")
    WebElement ABTestVariation1;

    public void clickABTesting() {
        abTestingLink.click();
    }

    public String validateABTesting() {
        return ABTestVariation1.getText();
    }

}
