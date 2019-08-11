package ru.stqua.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() throws Exception {
    app.getContactHelper().goToHomePage();
    app.getContactHelper().selectContact();
    app.getGroupHelper().initContactModification();

  }
}
