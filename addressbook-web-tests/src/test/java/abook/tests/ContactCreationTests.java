package abook.tests;

import abook.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{


    @Test
    public void testContactCreation() {
        app.gotoContactCreationPage();
        app.fillContactInfo(new ContactData("First", "M", "Last", "test1", "test2", "test3", "test4", "test5", "first.last@fm.com"));
        app.submitContactCreation();
        app.gotoContactsList();
    }

}
