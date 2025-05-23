package org.finance;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAbTest extends BaseTest {
    @Test
    public void AbTestingLink() {
        AbTestingPage AbTestingPage = new AbTestingPage(driver);
        AbTestingPage.clickABTesting();
        Assert.assertEquals(AbTestingPage.validateABTesting(),"A/B Test Variation 1");
    }


}
