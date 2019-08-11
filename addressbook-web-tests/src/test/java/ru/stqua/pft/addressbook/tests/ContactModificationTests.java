package ru.stqua.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqua.pft.addressbook.model.ContactData;
import ru.stqua.pft.addressbook.model.PhoneContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() throws Exception {
    app.getContactHelper().goToHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Vashman","Ivanovich",
            "Alloha", "MoRGan","Peer","Condor Systems","Metrostroevtsev 5"));
    app.getContactHelper().fillPhonedata(new PhoneContactData("(812) 344-55-13",
            "8-914-548-55-18",
            "8-812-555-55-11",
            "8-999-555-1"));
    app.getContactHelper().submitContactModification();
  }
}
