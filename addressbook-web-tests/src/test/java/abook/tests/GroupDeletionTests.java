package abook.tests;

import abook.model.GroupData;
import org.testng.annotations.Test;

/**
 * Created by админ1 on 20.03.2016.
 */
public class GroupDeletionTests extends TestBase{
    @Test
    public void testGroupDeletion(){
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroup();
        app.getNavigationHelper().gotoContactsList();
    }
}
