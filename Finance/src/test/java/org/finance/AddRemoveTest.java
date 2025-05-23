package org.finance;

import org.testng.annotations.Test;

public class AddRemoveTest extends BaseTest {


    @Test
    public void addRemoveTest() {
        AddRemove AddRemove = new AddRemove(driver);
        AddRemove.clickAddRemove();
        AddRemove.clickAddElement();
        AddRemove.clickDeleteElement();
    }
}
