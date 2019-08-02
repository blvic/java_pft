package ru.stqua.pft.addressbook.tests;


import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {
  @Test
  public void testGroupDeletion() throws Exception {
   app.gotoGroupPage();
    app.selectGroup();
    app.deleteGroup();
    app.returnToGroupPage();
  }

}
