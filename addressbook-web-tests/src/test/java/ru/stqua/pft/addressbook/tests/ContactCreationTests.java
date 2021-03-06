package ru.stqua.pft.addressbook.tests;




import org.testng.annotations.Test;
import ru.stqua.pft.addressbook.model.ContactData;
import ru.stqua.pft.addressbook.model.PhoneContactData;

public class ContactCreationTests extends TestBase {
  @Test
  public void testContactCreation() throws Exception {


    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Vashuta","Petrovich",
            "Andrey","PaRRot", "QA Department", "Multicarta", "Govorova 52", "test1"), true);
    app.getContactHelper().fillPhonedata( new PhoneContactData("34-97-52","8-911-170-61-15",
            "777-77-55", "888-99-99"));
    app.getContactHelper().submitContactCreation();
   // app.getGroupHelper().initGroupCreation();
  //  app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
  //  app.getGroupHelper().submitGroupCreation();
  //  app.getGroupHelper().returnToGroupPage();
  }

}
