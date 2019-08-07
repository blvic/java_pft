package ru.stqua.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqua.pft.addressbook.model.ContactData;
import ru.stqua.pft.addressbook.model.PhoneContactData;

public class ContactHelper extends HelperBase {
  public ContactHelper(WebDriver driver) {
    super(driver);
  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }
  public void submitContactCreation() {
    click(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Notes:'])[1]/following::input[1]"));
  }
  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"), contactData.getFirst_name());
    type(By.name("middlename"), contactData.getMidlle_name());
    type(By.name("lastname"), contactData.getLast_name());
    type(By.name("nickname"), contactData.getNick_name());

    type(By.name("title"), contactData.getTitle());
    type(By.name("company"), contactData.getCompany());
    type(By.name("address"), contactData.getAddress());
    //fillPhonedata(contactData);
  }

  public void fillPhonedata(PhoneContactData phoneContactData) {
    type(By.name("home"), phoneContactData.getHome_telephone());
    type(By.name("mobile"), phoneContactData.getMobile_phone());
    type(By.name("work"), phoneContactData.getWork_phone());
    type(By.name("fax"), phoneContactData.getFax());
  }
}
