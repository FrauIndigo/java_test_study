package abook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by админ1 on 20.03.2016.
 */
public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd) {
       super(wd);
    }

    public void gotoGroupPage() {
        if (isElementPresent(By.tagName("h1")) && wd.findElement(By.tagName("h1")).getText().equals("Groups") &&
                isElementPresent(By.name("new"))){
            return;
        }
        click(By.linkText("groups"));
    }

    public void gotoContactsList(){
        if (isElementPresent(By.id("maintable")) ){
            return;
        }
        click(By.linkText("home"));
    }
    public void gotoContactCreationPage() {
        if (isElementPresent(By.tagName("h1"))&& wd.findElement(By.tagName("h1")).getText().contains("add address book entry")){
            return;
        }
        wd.findElement(By.linkText("add new")).click();
    }
}
