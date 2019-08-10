package ru.stqua.pft.addressbook.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {
  @Test
  public void testGroupCreation() throws Exception {
    app.getContactHelper().goToHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteContact();
    app.acceptNextAlert=true;
    app.getContactHelper().goToHomePage();
  }
}
