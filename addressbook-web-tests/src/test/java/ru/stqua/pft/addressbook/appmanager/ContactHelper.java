package ru.stqua.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqua.pft.addressbook.model.ContactData;
import ru.stqua.pft.addressbook.model.PhoneContactData;

public class ContactHelper extends HelperBase {
  private boolean creation;

  public ContactHelper(WebDriver driver) {
    super(driver);
  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }

  public void submitContactCreation() {
    click(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Notes:'])[1]/following::input[1]"));
  }

  public void fillContactForm(ContactData contactData, boolean creation) {

    type(By.name("firstname"), contactData.getFirst_name());
    type(By.name("middlename"), contactData.getMidlle_name());
    type(By.name("lastname"), contactData.getLast_name());
    type(By.name("nickname"), contactData.getNick_name());

    type(By.name("title"), contactData.getTitle());
    type(By.name("company"), contactData.getCompany());
    type(By.name("address"), contactData.getAddress());
    //fillPhonedata(contactData);
    if (creation){
      new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }

  }

  public void fillPhonedata (PhoneContactData phoneContactData){
      type(By.name("home"), phoneContactData.getHome_telephone());
      type(By.name("mobile"), phoneContactData.getMobile_phone());
      type(By.name("work"), phoneContactData.getWork_phone());
      type(By.name("fax"), phoneContactData.getFax());
    }

    public void goToHomePage () {
      click(By.linkText("home"));
    }

    public void selectContact () {
      click(By.name("selected[]"));
    }

    public void deleteContact () {
      //click(By.name("Delete"));
      driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select all'])[1]/following::input[2]")).click();
    }
    //

    public void initContactModification () {
     // driver.findElement(By.cssSelector(".center:nth-child(8) img")).click();
      driver.findElement(By.xpath("//img[@alt='Edit']")).click();
      //click(By.name("edit"));
    }

    public void submitContactModification () {
      click(By.name("update"));
    }

  public boolean isThereAContact() {
    return isElementPresent(By.xpath("//img[@alt='Edit']"));

  }

}
