package org.finance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BrokenImagesPage {
    private WebDriver driver;

    @FindBy(xpath = "//*[@id='content']/ul/li[4]/a")
    private WebElement brokenImage;

    @FindBy(xpath = "//*[@id='content']/div/img")
    private List<WebElement> brokenImageCount;


    public BrokenImagesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnBrokenImage() {
        brokenImage.click();
    }

    public void getBrokenImageCount() {
        long images = brokenImageCount.size();
        System.out.println("Number of broken images: " + images);
    }

}
