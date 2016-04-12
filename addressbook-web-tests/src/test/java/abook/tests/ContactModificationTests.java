package abook.tests;

import abook.model.ContactData;
import org.testng.annotations.Test;

/**
 * Created by админ1 on 20.03.2016.
 */
public class ContactModificationTests extends TestBase{
    @Test
    public void testContactModification() {
        app.getNavigationHelper().gotoContactsList();


        app.getContactHelper().selectContact();
        app.getContactHelper().modifySelectedContact();
        app.getContactHelper().fillContactInfo(new ContactData("Second", "M", "Last", "test1", "test2", "test3", "test4", "test5", "first.last@fm.com", null),false);
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().gotoContactsList();
    }
}
