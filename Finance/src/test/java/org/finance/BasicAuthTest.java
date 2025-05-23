package org.finance;


import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAuthTest extends BaseTest {

    @Test
    public void basicAuthTest() {
        BasicAuthPage basicAuthPage = new BasicAuthPage(driver);
        basicAuthPage.clickBasicAuthLink();
        basicAuthPage.authenticate("admin", "admin", "https://the-internet.herokuapp.com/basic_auth");
        Assert.assertEquals(basicAuthPage.verifyBasicAuthMessageValidation(),"Congratulations! You must have the proper credentials.");
    }
}
