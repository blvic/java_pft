package ru.stqua.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.getContactHelper().goToHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteContact();
    app.getContactHelper().acceptAllert();
    app.getContactHelper().goToHomePage();
  }
}
