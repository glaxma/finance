package org.finance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddRemove {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id='content']/ul/li[2]/a")
    private WebElement addRemoveElements;

    @FindBy(xpath = "//button[text()='Add Element']")
    private WebElement addElement;

    @FindBy(xpath = "//div[@id='elements']/button")
    private WebElement deleteElement;

    public AddRemove(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    public void clickAddRemove() {
        addRemoveElements.click();
    }
    public void clickAddElement() {
        addElement.click();
    }
    public void clickDeleteElement() {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(deleteElement));
        deleteElement.click();
    }
}
