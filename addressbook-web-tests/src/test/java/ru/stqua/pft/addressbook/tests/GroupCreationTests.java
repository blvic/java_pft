package ru.stqua.pft.addressbook.tests;


import org.testng.annotations.Test;
import ru.stqua.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {
@Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
    app.getNavigationHelper().gotoHomePage();
  }

}
