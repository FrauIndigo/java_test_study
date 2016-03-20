package abook.tests;


import abook.model.GroupData;
import org.testng.annotations.Test;

/**
 * Created by админ1 on 20.03.2016.
 */
public class GroupModificationTests extends TestBase{
    @Test
    public void testGroupModification(){
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("newGroup", "test2", "test3"));
        app.getGroupHelper().submitGroupModification();
        app.getNavigationHelper().gotoContactsList();
    }
}
