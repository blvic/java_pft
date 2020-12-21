package ru.stqua.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqua.pft.addressbook.model.ContactData;
import ru.stqua.pft.addressbook.model.PhoneContactData;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() throws Exception {
    app.getContactHelper().goToHomePage();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().initContactCreation();
      app.getContactHelper().fillContactForm(new ContactData("Vashuta","Petrovich",
              "Andrey","PaRRot", "QA Department", "Multicarta", "Govorova 52", "test1"), true);
      app.getContactHelper().fillPhonedata( new PhoneContactData("34-97-52","8-911-170-61-15",
              "777-77-55", "888-99-99"));
      app.getContactHelper().submitContactCreation();
    }
    app.getContactHelper().goToHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteContact();
    app.getContactHelper().acceptAllert();
    app.getContactHelper().goToHomePage();
  }
}
