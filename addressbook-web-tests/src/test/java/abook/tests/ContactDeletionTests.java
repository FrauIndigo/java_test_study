package abook.tests;

import abook.model.ContactData;
import org.testng.annotations.Test;

/**
 * Created by админ1 on 20.03.2016.
 */
public class ContactDeletionTests extends TestBase{
    @Test
    public void testContactDeletion() {
        app.getNavigationHelper().gotoContactsList();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContact();
        app.getContactHelper().acceptDeletion();
        app.getNavigationHelper().gotoContactsList();
    }
}
