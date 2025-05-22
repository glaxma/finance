package org.finance;

import org.testng.annotations.Test;

public class testABTestingLink extends BaseTest {
    @Test
    public void testABTestingLink() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickABTesting();
    }


}
