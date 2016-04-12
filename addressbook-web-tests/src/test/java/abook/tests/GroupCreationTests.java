package abook.tests;

import abook.model.GroupData;
import org.testng.annotations.Test;


public class GroupCreationTests extends TestBase{

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", null, "test3"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
    }

}
