package ru.stqua.pft.addressbook.tests;


import org.testng.annotations.Test;
import ru.stqua.pft.addressbook.model.GroupData;

public class GroupDeletionTests extends TestBase {
  @Test
  public void testGroupDeletion() throws Exception {
   app.getNavigationHelper().gotoGroupPage();
   if (! app.getGroupHelper().isThereAGroup()) {
     app.getGroupHelper().createGroup(new GroupData("test1", "test2", "test3"));
   }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteGroup();
    app.getGroupHelper().returnToGroupPage();
  }

}
