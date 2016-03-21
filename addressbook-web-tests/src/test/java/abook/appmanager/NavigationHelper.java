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
        click(By.linkText("groups"));
    }

    public void gotoContactsList(){
        click(By.linkText("home"));
    }
    public void gotoContactCreationPage() {
        wd.findElement(By.linkText("add new")).click();
    }
}
