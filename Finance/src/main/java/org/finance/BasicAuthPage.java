package org.finance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicAuthPage {
    private WebDriver driver;

    @FindBy(xpath = "//*[@id='content']/ul/li[3]/a")
    private WebElement basicAuthLink;

    @FindBy(xpath = "//*[@id='content']/div/p")
    private WebElement basicAuthMessageValidation;

    public BasicAuthPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickBasicAuthLink() {
        basicAuthLink.click();
    }

    public void authenticate(String username, String password,String baseUrl) {
        String authUrl = "https://" + username + ":" + password + "@" + baseUrl.replace("https://", "");
        driver.get(authUrl);
    }

    public String verifyBasicAuthMessageValidation() {
       return basicAuthMessageValidation.getText();
    }

}
