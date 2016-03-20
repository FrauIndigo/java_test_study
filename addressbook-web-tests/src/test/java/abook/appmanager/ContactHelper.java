package abook.appmanager;

import abook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by админ1 on 20.03.2016.
 */
public class ContactHelper extends HelperBase {

    public ContactHelper(FirefoxDriver wd) {
        super(wd);

    }

    public void submitContactCreation() {
        click(By.xpath("//input[@type='submit']"));
    }

    public void fillContactInfo(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("middlename"), contactData.getMiddleName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("title"), contactData.getTitle());
        type(By.name("company"), contactData.getCompany());
        type(By.name("address"), contactData.getAddress());
        type(By.name("home"), contactData.getHomeTelNumber());
        type(By.name("mobile"), contactData.getMobileTelNumber());
        type(By.name("email"), contactData.getEmail());
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }

    public void deleteSelectedContact() {
        click(By.xpath("//input[@value='Delete']"));
    }

    public void acceptDeletion(){
        wd.switchTo().alert().accept();
    }
}
