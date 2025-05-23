package org.finance;

import org.testng.annotations.Test;

public class AddRemoveTest extends BaseTest {


    @Test
    public void addRemoveTest() {
        AddRemovePage AddRemove = new AddRemovePage(driver);
        AddRemove.clickAddRemove();
        AddRemove.clickAddElement();
        AddRemove.clickDeleteElement();
    }
}
