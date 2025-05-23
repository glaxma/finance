package org.finance;

import org.testng.annotations.Test;

public class BrokenImagesTest extends BaseTest {
    @Test
    public void testBrokenImages() {
        BrokenImagesPage brokenImagesPage = new BrokenImagesPage(driver);
        brokenImagesPage.clickOnBrokenImage();
        brokenImagesPage.getBrokenImageCount();
    }
}
