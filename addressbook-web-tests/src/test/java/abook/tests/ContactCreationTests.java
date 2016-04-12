package abook.tests;

import abook.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{


    @Test
    public void testContactCreation() {
        app.getNavigationHelper().gotoContactCreationPage();
        app.getContactHelper().fillContactInfo(new ContactData("First", null, "Last", "test1", "test2", "test3", "test4", "test5", "first.last@fm.com","test1"), true);
        app.getContactHelper().submitContactCreation();
        app.getNavigationHelper().gotoContactsList();
    }

}
