package abook.tests;

import abook.model.ContactData;
import abook.model.GroupData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{


    @Test
    public void testContactCreation() {
        app.getNavigationHelper().gotoGroupPage();
        if (!app.getGroupHelper().isThereTheGroup("test1")){

            app.getGroupHelper().createGroup(new GroupData("test1",null,null));
        }
        app.getNavigationHelper().gotoContactCreationPage();
        app.getContactHelper().createContact(new ContactData("First", null, "Last", "test1", "test2", "test3", "test4", "test5", "first.last@fm.com","test1"), true);
        app.getNavigationHelper().gotoContactsList();
    }

}
