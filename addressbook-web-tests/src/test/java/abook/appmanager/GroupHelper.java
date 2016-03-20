package abook.appmanager;

import abook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by админ1 on 20.03.2016.
 */
public class GroupHelper extends HelperBase{


    public GroupHelper(FirefoxDriver wd) {
        super(wd);
    }


    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }
    public void submitGroupModification() {
        click(By.name("update"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"),groupData.getHeader());
        type(By.name("group_footer"),groupData.getFooter());

       // wd.findElement(By.id("content")).click();
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void selectGroup(){
        click(By.name("selected[]"));
    }

    public void deleteSelectedGroup(){
        click(By.name("delete"));
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }
}
