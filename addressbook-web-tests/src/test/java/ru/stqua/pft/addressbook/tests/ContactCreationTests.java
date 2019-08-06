package ru.stqua.pft.addressbook.tests;




import org.testng.annotations.Test;
import ru.stqua.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {
  @Test
  public void testGroupCreation() throws Exception {


    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Vashuta","Petrovich",
            "Andrey","PaRRot", "QA Department", "Multicarta", "Govorova 52"));
    app.getContactHelper().submitContactCreation();
   // app.getGroupHelper().initGroupCreation();
  //  app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
  //  app.getGroupHelper().submitGroupCreation();
  //  app.getGroupHelper().returnToGroupPage();
  }

}
